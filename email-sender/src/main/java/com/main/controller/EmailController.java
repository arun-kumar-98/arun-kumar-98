package com.main.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.service.EmailService;

@RestController
@RequestMapping("/email")
public class EmailController {

	@Autowired
	private EmailService emailService;

	@GetMapping("/withoutAttachment")
	public String sendEmail() {
		emailService.MailWithoutAttachment();
		return "mail sent successfully";
	}

	@PostMapping("/attched")
	public String sendAttachmentfile() {
		try {
			emailService.sendAttachment();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return "email sent successfully";
	}

}
