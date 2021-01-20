package estructural.proxy.client;

import estructural.proxy.BankLegalAudit;
import estructural.proxy.BankingAudit;
import estructural.proxy.BankingAuditProxy;

public class Main {

	public static void main(String[] args) {
	
	}
	
	public static void proxyExample() {
		BankLegalAudit audit = new BankingAudit();
		BankLegalAudit proxy = new BankingAuditProxy(audit);
		
		proxy.totalMoneyInBank("1234556");
	}

}
