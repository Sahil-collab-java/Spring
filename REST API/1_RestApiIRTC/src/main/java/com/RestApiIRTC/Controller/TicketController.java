package com.RestApiIRTC.Controller;

import com.RestApiIRTC.Model.Passenger;
import com.RestApiIRTC.Model.Ticket;
import com.RestApiIRTC.Service.BookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TicketController {

    @Autowired
    private BookingServiceImpl bookingService;



    @PostMapping(value = "/ticket",
            consumes = "application/json",
            produces = "application/json"
    )
    public ResponseEntity<Ticket> ticketBooking(@RequestBody Passenger passenger){
       Ticket ticket =  bookingService.bookTicket(passenger);
        return new ResponseEntity<>(ticket, HttpStatus.CREATED);
    }

    @GetMapping (value = "/ticket/{ticketNum}",
            produces = "application/json"
    )
    public ResponseEntity<Ticket> getTicket(@PathVariable("ticketNum") Integer ticketNum){
        Ticket ticket =  bookingService.getTicket(ticketNum);
        return new ResponseEntity<>(ticket, HttpStatus.OK);
    }
}
