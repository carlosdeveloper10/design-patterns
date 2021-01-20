package estructural.proxy;

import java.util.Optional;

public class BankingAudit implements BankLegalAudit {

	private BankingApi bankingApi;

	public BankingAudit() {
		bankingApi = new BankingApi();
	}

	@Override
	public Optional<Float> totalMoneyInBank(String bankAccount) {
		return Optional.of(bankingApi.getTotalMoneyFrom(bankAccount));
	}

}
