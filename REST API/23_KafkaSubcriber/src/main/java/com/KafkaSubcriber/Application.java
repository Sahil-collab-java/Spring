package com.KafkaSubcriber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.KafkaSubcriber.Constant.KafkaConstants;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@KafkaListener(topics = KafkaConstants.TOPIC, groupId="group_sahil_order")
	public void subscribeMsg(String order) {
			System.out.print("*** Msg Recieved From Kafka *** :: ");
			System.out.println(order);
		//logic
	}

}
