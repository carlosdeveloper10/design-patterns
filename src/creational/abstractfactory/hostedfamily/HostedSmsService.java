package creational.abstractfactory.hostedfamily;

import creational.abstractfactory.SmsService;

public class HostedSmsService implements SmsService {

	@Override
	public void send(String phoneNumber, String sms) {
		System.out.println(String.format("To: %s Msg: %s", phoneNumber, sms));
		System.out.println("Sent from HOSTED SMS SERVICE");
	}

}
