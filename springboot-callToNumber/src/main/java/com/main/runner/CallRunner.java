package com.main.runner;

import java.net.URI;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

@Component
public class CallRunner implements ApplicationRunner {

	private static final String SID_ACCOUNT = "AC63d3ccaceac0c6015229882d2f59c6c0";
	private static final String AUTH_ID = "36f2a48a963095913fc8f170f8d72146";
	private static final String FROM_NUMBER = "+12182454999";
	private static final String TO_NUMBER = "+917610704094";

	// INITIALIZE TWILLIO ACCOUNT WITH GIVEN SID,AUTH_ID

	static {
		Twilio.init(SID_ACCOUNT, AUTH_ID);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Call.creator(new PhoneNumber(TO_NUMBER), new PhoneNumber(FROM_NUMBER),
				new URI("http://demo.twilio.com/docs/voice.xml")).create();
	}
}
