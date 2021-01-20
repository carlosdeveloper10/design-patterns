package creational.abstractfactory.awsfamily;

import creational.abstractfactory.MailService;
import creational.abstractfactory.MessagingServiceFactory;
import creational.abstractfactory.SmsService;

public class AwsMessagingServiceFactory implements MessagingServiceFactory{

	@Override
	public SmsService createSmsService() {
		return new AwsSimpleNotificationService();
	}

	@Override
	public MailService createMailService() {
		return new AwsSimpleEmailService();
	}

}
