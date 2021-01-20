package creational.builder;

public class RabbitQueuBuilder extends QueuBuilder {

	@Override
	public QueuBuilder withUrl(String url) {
		super.url = url;
		return this;
	}

	@Override
	public QueuBuilder withUser(String user) {
		super.user = user;
		return this;
	}

	@Override
	public QueuBuilder withPwd(String pwd) {
		super.pwd = pwd;
		return this;
	}

	@Override
	public QueuBuilder withName(String name) {
		super.name = name;
		return this;
	}

	@Override
	public Queu build() {
		return new RabbitQueu(url, user, pwd, name);
	}

}
