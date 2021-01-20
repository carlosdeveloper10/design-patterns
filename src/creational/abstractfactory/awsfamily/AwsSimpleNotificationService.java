package creational.abstractfactory.awsfamily;

import creational.abstractfactory.SmsService;

public class AwsSimpleNotificationService implements SmsService {

	@Override
	public void send(String phoneNumber, String sms) {
		System.out.println(String.format("To: %s Msg: %s", phoneNumber, sms));
		System.out.println("Sent from AWS SNS");
	}

}
