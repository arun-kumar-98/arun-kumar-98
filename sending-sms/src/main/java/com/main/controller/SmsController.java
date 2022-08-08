package com.main.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.main.pojo.SmsPojo;
import com.main.service.SmsService;

@RestController
public class SmsController {

	@Autowired
	private SmsService service;

	@Autowired
	private SimpMessagingTemplate webSocket;

	private final String TOPIC_DETINATION = "/lesson/sms";

	@RequestMapping(value = "/sms", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)

	public void sendSms(@RequestBody SmsPojo pojo) {
		try {
			service.send(pojo);

		} catch (Exception e) {
			webSocket.convertAndSend(TOPIC_DETINATION, " :Error to send the message: " + e.getMessage());

			throw e;
		}
		webSocket.convertAndSend(TOPIC_DETINATION, " :SMS has been sent !" + pojo.getMessage());

	}

	@RequestMapping(value = "/smscallback", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)

	public void smsCallBack(@RequestBody MultiValueMap<String, String> map) {
		service.recieve(map);

		webSocket.convertAndSend(TOPIC_DETINATION, map.toString());

	}

	private String getTimeStamp() {

		return java.time.format.DateTimeFormatter.ofPattern("yyyy:MM:dd HH:mm:ss").format(LocalDate.now());

	}

}
