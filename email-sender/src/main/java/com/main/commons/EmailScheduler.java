package com.main.commons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import com.main.service.EmailService;

@Configuration
public class EmailScheduler {

	@Autowired
	private EmailService emailService;

	@Scheduled(cron = "0 0 */1 * * *")
	public void scheduleSendMails() {
		emailService.MailWithoutAttachment();

	}

}
