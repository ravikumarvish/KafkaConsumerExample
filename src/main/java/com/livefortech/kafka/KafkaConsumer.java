package com.livefortech.kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "sample", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Message Received : "+ message);
	}
	
	@KafkaListener(topics = "travel-invoice", groupId = "group_id", containerFactory = "invoiceKafkaListenerContainerFactory")
	public void invoiceConsumer(Invoice invoice) {
		System.out.println("Message Received : "+ invoice.getId());
	}
}
