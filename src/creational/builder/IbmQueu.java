package creational.builder;

public class IbmQueu extends Queu {

	public IbmQueu(String url, String user, String pwd, String name) {
		super(url, user, pwd, name);
	}

	@Override
	public void publish(String msg) {
		System.out.println("Quee info -> " + super.queuInfo());
		System.out.println("Publishing using IMB MQ || message -> " + msg);
	}

}
