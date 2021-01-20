package behavioral.chainofresposability;

public class BasicAuthentication extends AuthenticationHadler {

	@Override
	public boolean logIn(AuthToken token) {

		if (token.tokenForAuth.equals("user:pwd")) {
			return tryToLoing(token);
		}

		return nextHandler.logIn(token);
	}

	private boolean tryToLoing(AuthToken token) {
		return (token.pwd.equals("123"));
	}

}
