package estructural.proxy;

import java.util.Optional;

public class BankingAuditProxy implements BankLegalAudit {

	private AuditorSecurityApi securityApi;

	private BankLegalAudit audit;

	public BankingAuditProxy(BankLegalAudit audit) {
		this.audit = audit;
		securityApi = new AuditorSecurityApi();
	}

	@Override
	public Optional<Float> totalMoneyInBank(String bankAccount) {
		if (securityApi.isAuditDay()) {
			return audit.totalMoneyInBank(bankAccount);
		}else {
			System.out.println("it is not auditable day");
		}

		return Optional.of(null);
	}

}
