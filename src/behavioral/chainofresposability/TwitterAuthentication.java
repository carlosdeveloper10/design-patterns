package behavioral.chainofresposability;

public class TwitterAuthentication extends AuthenticationHadler{

	@Override
	public boolean logIn(AuthToken token) {

		if (token.tokenForAuth.equals("tw")) {
			return tryToLoing(token);
		}

		return nextHandler.logIn(token);
	}

	private boolean tryToLoing(AuthToken token) {
		return (token.pwd.equals("123"));
	}
}
