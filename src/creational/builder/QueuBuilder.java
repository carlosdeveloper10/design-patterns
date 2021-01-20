package creational.builder;

public abstract class QueuBuilder {
	
	protected String url;
	
	protected String user;
	
	protected String pwd;
	
	protected String name;
	
	public abstract QueuBuilder withUrl(String url);
	
	public abstract QueuBuilder withUser(String user);
	
	public abstract QueuBuilder withPwd(String pwd);
	
	public abstract QueuBuilder withName(String name);
	
	public abstract Queu build();
}
