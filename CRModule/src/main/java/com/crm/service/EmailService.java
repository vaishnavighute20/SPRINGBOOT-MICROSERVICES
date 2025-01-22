package com.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
@Autowired
JavaMailSender mailSender;
public void sendEmailToCustomer(String mailId,String name) {
	System.out.println("**** entered: sendEmailTOCustomer*****");
	SimpleMailMessage mailMessage =new SimpleMailMessage();
	mailMessage.setTo(mailId);
	mailMessage.setSubject("mail from crm app");
	mailMessage.setText("Dear"+name+",\n thanks for registering");
	mailSender.send(mailMessage);
	System.out.println("****exit:sendEmailToCustome ****");
	
	
}

}
