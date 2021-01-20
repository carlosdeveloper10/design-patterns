package creational.builder;

public class RabbitQueu extends Queu{
	
	

	public RabbitQueu(String url, String user, String pwd, String name) {
		super(url, user, pwd, name);
	}

	@Override
	public void publish(String msg) {
		System.out.println("Queu info -> " + super.queuInfo());
		System.out.println("Publishing using Rabbit MQ || message -> " + msg);
	}

}
