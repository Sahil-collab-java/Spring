package com.MonoAndFlux.mycontroller;

import java.sql.Date;
import java.time.Duration;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MonoAndFlux.binding.CustomerEvent;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@RestController
public class CustomerRestController {
	
	@GetMapping("/event")
	public Mono<CustomerEvent> getCustomerEvent() {

		CustomerEvent event = new CustomerEvent("Smith", new Date(0));
		
		Mono<CustomerEvent> mono = Mono.just(event);

		return mono;
	}	
	
	
	@GetMapping(value = "/events", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public ResponseEntity<Flux<CustomerEvent>> getCustomerEvents() {

		// Creating Customer data in the form of object
		CustomerEvent event = new CustomerEvent("Smith", new Date(0));

		// Create Stream object to send the data
		Stream<CustomerEvent> customerStream = Stream.generate(() -> event);

		// Create Flux object with Stream
		Flux<CustomerEvent> customerFlux = Flux.fromStream(customerStream);

		// Setting Response Interval
		Flux<Long> interval = Flux.interval(Duration.ofSeconds(10));

		// Combine Flux Interval and Customer Flux
		Flux<Tuple2<Long, CustomerEvent>> zip = Flux.zip(interval, customerFlux);

		// Getting Flux value from the zip
		Flux<CustomerEvent> fluxMap = zip.map(Tuple2::getT2);

		// Returning Flux Response
		return new ResponseEntity<>(fluxMap, HttpStatus.OK);
	}

}
