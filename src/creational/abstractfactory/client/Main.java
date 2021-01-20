package creational.abstractfactory.client;

import creational.abstractfactory.MailService;
import creational.abstractfactory.MessagingServiceFactory;
import creational.abstractfactory.SmsService;
import creational.abstractfactory.awsfamily.AwsMessagingServiceFactory;
import creational.abstractfactory.hostedfamily.HostedMessagingServiceFactory;

public class Main {

	public static void main(String... args) {

		familyAws();
		familyHotsed();
	}
	
	private static void familyAws() {
		MessagingServiceFactory factory = new AwsMessagingServiceFactory();
		MailService mailService = factory.createMailService();
		SmsService smsService = factory.createSmsService();
		
		mailService.send("car@ok.com", "Hola Mundo");
		smsService.send("+573147895236", "Hola Mundo");
	}
	
	private static void familyHotsed() {
		MessagingServiceFactory factory = new HostedMessagingServiceFactory();
		MailService mailService = factory.createMailService();
		SmsService smsService = factory.createSmsService();
		
		mailService.send("car2@ok.com", "Hola Mundo -2");
		smsService.send("+1589654", "Hola Mundo -2");
	}
}
