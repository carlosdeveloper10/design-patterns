package behavioral.chainofresposability;

public abstract class AuthenticationHadler {

	protected AuthenticationHadler nextHandler;

	public AuthenticationHadler linkWith(AuthenticationHadler nextHandler) {
		this.nextHandler = nextHandler;
		return nextHandler;
	}

	public abstract boolean logIn(AuthToken token);

	public static AuthenticationHadler getBasicAuthenticationChain() {

		AuthenticationHadler chain = new BasicAuthentication();
		
		chain.linkWith(new LdapAuthentication()).linkWith(new FacebookAuthentication())
				.linkWith(new TwitterAuthentication()).linkWith(new GoogleAuthentication());
		
		return chain;
	}
}
