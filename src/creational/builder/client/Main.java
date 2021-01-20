package creational.builder.client;

import creational.builder.IbmQueuBuilder;
import creational.builder.Queu;
import creational.builder.QueuBuilder;
import creational.builder.RabbitQueuBuilder;

public class Main {

	public static void main(String[] args) {
		QueuBuilder ibmBuilder = new IbmQueuBuilder();
		QueuBuilder rabbitBuilder = new RabbitQueuBuilder();

		Queu ibm = ibmBuilder.withName("IBM").withUrl("www.ibmmq.com").withPwd("123")
				.withUser("behavioral.chainofresposability").build();
		ibm.publish("target is IBM");
		System.out.println("----");
		Queu rabbit = rabbitBuilder.withName("RABBIT").withUrl("www.rabbit-mq.com").withPwd("456").withUser("mario")
				.build();
		rabbit.publish("target is RABBIT");
	}

}
