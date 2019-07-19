package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Run {

	 @Autowired
	    private JmsTemplate jmsTemplate;

	  	@GetMapping("/test")
	    public void run() throws Exception {
	  		System.out.println("ASD");
	    	//jmsTemplate
	        sendMessage("Hello World!");
	    }

	    public void sendMessage(String text) {
	        System.out.println(String.format("Sending '%s'", text));
	        this.jmsTemplate.convertAndSend("example", text);
	    }

	    @JmsListener(destination = "example")
	    public void receiveMessage(String text) {
	        System.out.println(String.format("Received '%s'", text));
	    }

}
