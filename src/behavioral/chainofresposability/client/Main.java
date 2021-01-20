package behavioral.chainofresposability.client;

import behavioral.chainofresposability.AuthToken;
import behavioral.chainofresposability.AuthenticationHadler;

public class Main {

	public static void main(String[] args) {
	
		AuthenticationHadler chain = AuthenticationHadler.getBasicAuthenticationChain();
		
		AuthToken tk = new AuthToken();
		tk.pwd = "123";
		tk.tokenForAuth = "g";
		
		chain.logIn(tk);
	}

}
