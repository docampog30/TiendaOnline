package com.productos.services;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	
	@Autowired
    private JavaMailSender javaMailSender;

	public void send(String to,String subject,String text) {
        MimeMessage mail = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mail, true);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setFrom("SNK");
            helper.setText(text);
        } catch (javax.mail.MessagingException e) {
			e.printStackTrace();
		}
        javaMailSender.send(mail);

    }
}
