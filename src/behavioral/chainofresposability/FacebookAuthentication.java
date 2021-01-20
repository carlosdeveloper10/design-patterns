package behavioral.chainofresposability;

public class FacebookAuthentication extends AuthenticationHadler{

	@Override
	public boolean logIn(AuthToken token) {

		if (token.tokenForAuth.equals("fb")) {
			return tryToLoing(token);
		}

		return nextHandler.logIn(token);
	}

	private boolean tryToLoing(AuthToken token) {
		return (token.pwd.equals("123"));
	}
}
