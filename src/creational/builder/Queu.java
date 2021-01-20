package creational.builder;

public abstract class Queu {

	protected String url;

	protected String user;

	protected String pwd;

	protected String name;

	public Queu(String url, String user, String pwd, String name) {
		this.url = url;
		this.user = user;
		this.pwd = pwd;
		this.name = name;
	}

	protected String queuInfo() {
		return String.format("Queu info -> URl %s \n USER %s \n PWD %s \n NAME %s", url, user, pwd, name);
	}

	public abstract void publish(String msg);
}
