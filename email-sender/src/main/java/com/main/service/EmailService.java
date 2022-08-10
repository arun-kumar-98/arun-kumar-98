package com.main.service;

import java.io.File;
import java.util.Date;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	public void MailWithoutAttachment() {

		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("arun.sharma@tectoro.com");
		message.setTo("saurabh.deshmukh@tectoro.com");
		message.setSubject("your identity varification");
		message.setText("Working with large email collections\n"
				+ "You may want to create networks based on email archives that are not in a format that Windows understands. For example, mbox and maildir are common formats found in Linux and Apple system mail clients. Maildir stores 100 text file per message in a directory hierarchy that matches the user's mail client, whereas mbox stores all messages in a single file.\n"
				+ "\n"
				+ "One strategy for dealing with this issue is to use a specialized programs like Aid4Mail that can aggregate email stored in multiple devices or formats, perform and store advanced searches, and export emails into a range of formats. For example, you can use Aid4Mail to open email list archive files (in .mbox format) and convert them to a format such as “eml” files that can be indexed by Windows. The tool can handle hundreds of thousands of emails with reasonable performance on a standard machine.\n"
				+ "\n"
				+ "Another strategy is to create a database of the email messages that can be queried in multiple ways. This allows you to apply language processing and text mining approaches not available in the NodeXL import wizard. Some email programs like Aid4Mail will create a database for you. Alternatively, you can convert emails into XML and then use Excel's built-in XML maps feature to populate the Excel fields based on the XML database content.");

		message.setSentDate(new Date());

		// now send mail

		javaMailSender.send(message);

	}

	// send attatchment

	public void sendAttachment() throws MessagingException {

		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
		try {
			messageHelper.setFrom("arun.sharma@tectoro.com");
			messageHelper.setTo("saurabh.deshmukh@tectoro.com");
			messageHelper.setText("Hi Team flower\n mai jhukega nhi sala");
			messageHelper.setCc("sujatha.valluru@tectoro.com");
			messageHelper.setSubject("important document ");
			// set attatchment

			File file = new File("/home/tector/Downloads/nature.jpg");

			messageHelper.addAttachment(file.getName(), file);
			messageHelper.setText("Nature- A Boon for All\n"
					+ "Nature is the mother of all, as it helps to sustain our life. It is our companion since eternity. Despite the importance of nature in human life, we are spoiling its balance only due to our greediness. Millions of years ago, when the knowledge of man was not better than an animal. At that time man used to get all the things needed for life only from nature. Even today, at the heights of science, our requirements are met by nature only. Nature is a boon given to us, as it protects crores and crores of organisms living on the earth. It gives us forests which are the lungs of Earth.\n"
					+ "\n" + "Challenges of Nature\n"
					+ "Our lives as human beings started on this planet Earth and since then we are exhausting its resources. But, in return, we are exposing it to the external threats of destruction and mistreatment. Due to this, beautiful forests have been destroyed, rivers have been polluted and vast open lands have been consumed for buildings and factories. We are giving challenges to nature by doing activities as hunting down animals, cutting down trees, releasing poisonous gases and polluting rivers.\n"
					+ "\n" + "Get the Huge List of 100+ Speech Topics here\n" + "\n"
					+ "Our earth is literally experiencing many strokes of destructive activities due to which the river sources are going dry, plants are dying as well as species are eliminating. Today’s world is facing the biggest problem of ‘global warming’, which has a serious impact on our environment. So we all think seriously about our activities and help to bring such situations under control.\n"
					+ "\n" + "Conservation of Nature\n"
					+ "Conservation of nature is another important issue. Although governments are employing various means to conserve nature, individuals must also come forward to contribute to saving nature. Therefore, everyone must do the tree plantation, restricting the use of paper, stopping wastage of water and electricity. Not only these we have to stop ill practices like the hunting of animals. Also, we must go for rainwater harvesting systems. If each one of us contributes their own bit, the difference will be tremendous for nature. The beginning of life, as well as the continuation of life on earth both, are a very complex process of nature. Every organism is important for the conservation of nature.\n"
					+ "\n" + "Conclusion\n"
					+ "In the end, I would just say that please don’t keep my words to yourself only. I request all to spread the message around so that every person can become a responsible global citizen who can contribute to saving our planet.\n"
					+ "\n"
					+ "Also, focus on energy consumption. Therefore, switch off the power button, if no one is in the room. Do not use personal vehicles, and follow public transportation. We can even use bicycles for small distances to protect your environment. Thus, through these simple yet effective measures, everyone can contribute greatly towards saving our mother nature from further exploitation.\n"
					+ "\n" + "Thanks!\n" + "\n" + "");

			// send mail

			javaMailSender.send(message);

		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}
}
