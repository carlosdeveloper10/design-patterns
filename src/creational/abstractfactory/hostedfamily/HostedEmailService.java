package creational.abstractfactory.hostedfamily;

import creational.abstractfactory.MailService;

public class HostedEmailService implements MailService {

	@Override
	public void send(String destination, String message) {
		System.out.println(String.format("To: %s Msg: %s", destination, message));
		System.out.println("Sent from HOSTED MAIL SERVER");}

	
}
