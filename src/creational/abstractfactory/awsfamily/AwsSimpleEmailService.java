package creational.abstractfactory.awsfamily;

import creational.abstractfactory.MailService;

public class AwsSimpleEmailService implements MailService {

	@Override
	public void send(String destination, String message) {
		System.out.println(String.format("To: %s Msg: %s", destination, message));
		System.out.println("Sent fomr AWS SES");
	}

}
