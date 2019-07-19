package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;

@EnableJms
@SpringBootApplication
public class Main {

	 @Autowired
	    private JmsTemplate jmsTemplate;

	    public static void main(String[] args) {
	        SpringApplication.run(Main.class, args);
	    }

/*	    
	    public void run() throws Exception {
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
*/
}
