package com.KafkaProducer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.KafkaProducer.Constant.AppConstants;
import com.KafkaProducer.Entity.Order;

@Service
public class OrderService {
	
	@Autowired
	private KafkaTemplate<String, Order> kafkaTemplate;
	
	public String  addMsg(Order o) {

		kafkaTemplate.send(AppConstants.TOPIC,o);
		return "Msg Published TO KAFKA Topic !!!";
	}

}
