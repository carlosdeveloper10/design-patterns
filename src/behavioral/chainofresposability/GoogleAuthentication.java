package behavioral.chainofresposability;

public class GoogleAuthentication extends AuthenticationHadler{

	@Override
	public boolean logIn(AuthToken token) {

		if (token.tokenForAuth.equals("g")) {
			return tryToLoing(token);
		}

		return nextHandler.logIn(token);
	}

	private boolean tryToLoing(AuthToken token) {
		return (token.pwd.equals("123"));
	}

}
