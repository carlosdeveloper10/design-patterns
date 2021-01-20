package creational.abstractfactory.hostedfamily;

import creational.abstractfactory.MailService;
import creational.abstractfactory.MessagingServiceFactory;
import creational.abstractfactory.SmsService;

public class HostedMessagingServiceFactory implements MessagingServiceFactory {

	@Override
	public SmsService createSmsService() {
		return new HostedSmsService();
	}

	@Override
	public MailService createMailService() {
		return new HostedEmailService();
	}

}
