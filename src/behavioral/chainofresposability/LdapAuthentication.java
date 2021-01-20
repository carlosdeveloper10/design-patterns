package behavioral.chainofresposability;

import java.util.logging.Logger;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;

public class LdapAuthentication extends AuthenticationHadler {

	@Override
	public boolean logIn(AuthToken token) {

		if (token.tokenForAuth.equals("ldap")) {
			return tryToLoing(token);
		}
		return nextHandler.logIn(token);
	}

	private boolean tryToLoing(AuthToken token) {
		return (token.pwd.equals("123"));
	}
}
