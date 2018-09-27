package com.italent.demo;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.hibernate.Session;

public class App {
	public static void main(String[] args) {
		// email ID of Recipient.
		String recipient = "recipient@gmail.com";

		// email ID of Sender.
		String sender = "sender@gmail.com";

		// using host as localhost
		String host = "https://tz-alpha-stage.cisco.com";

		// Getting system properties
		Properties properties = System.getProperties();

		// Setting up mail server
		properties.setProperty("tz/tz_mail.php", host);

		// creating session object to get properties
		// Session session = Session.getDefaultInstance(properties);

		// Send email.
		// Transport.send(message);
		System.out.println("Mail successfully sent");
	}
}
