package creational.abstractfactory;

public interface MessagingServiceFactory {

	SmsService createSmsService();

	MailService createMailService();
}
