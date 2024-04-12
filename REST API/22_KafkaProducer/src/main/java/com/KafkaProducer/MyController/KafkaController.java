package com.KafkaProducer.MyController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.KafkaProducer.Entity.Order;
import com.KafkaProducer.Service.OrderService;

@RestController
public class KafkaController {

	@Autowired
 	private OrderService orderService;
	
	@PostMapping("/order")
	public String createOrder(@RequestBody Order order) {
		String msg = orderService.addMsg(order);
		return  msg;
	}
	
	
}
