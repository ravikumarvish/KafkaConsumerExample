package com.livefortech.kafka;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ServiceB")
public class ServiceBController {

	@PostMapping("/receive")
	public void receiveInvoiceDetails(@RequestBody Invoice request) {
		System.out.println("Received request Invoice : "+request.getId());
	}
	
}
