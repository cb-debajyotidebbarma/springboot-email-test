package com.mailTest.mail;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerClass {


    @Autowired
    EmailSenderService emailSenderService;


    @GetMapping("/transfer-slot")
    public String slotTransfer(){

        String sendTo= "debajyotidebbarma55@gmail.com";
        String subject="SUBJECT";
        String body= "This is the mail body";

        Mail newMail = new Mail();

        newMail.setTo(sendTo);
        newMail.setBody(body);
        newMail.setSubject(subject);

        emailSenderService.sendMail(newMail);

        return "Slot transferred - A confirmation email has been sent to your mail";
    }

}
