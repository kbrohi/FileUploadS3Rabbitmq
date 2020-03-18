package com.northbay.kaleem.fileupload.service;

import java.io.IOException;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;


@Service
public class RabbitMQListner implements MessageListener {
	
	public void onMessage(Message message) {
		try {
			FileUploadingService.readFiles();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}