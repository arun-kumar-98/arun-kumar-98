package com.main.service;

import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import com.main.pojo.SmsPojo;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Component
public class SmsService {

	private static final String SID_ACCOUNT = "AC63d3ccaceac0c6015229882d2f59c6c0";
	private static final String AUTH_ID = "36f2a48a963095913fc8f170f8d72146";
	private static final String FROM_NUMBER = "+12182454999";
	private static final String TO_NUMBER = "+917610704094";

	public void send(SmsPojo sms) {
		Twilio.init(SID_ACCOUNT, AUTH_ID);

		Message message = Message.creator(new PhoneNumber(sms.getTo()), new PhoneNumber(FROM_NUMBER), sms.getMessage())
				.create();

		// check from which id we get message
		System.out.println("here id message id   :" + message.getSid());

	}

	public void recieve(MultiValueMap<String, String> map) {

	}

}
