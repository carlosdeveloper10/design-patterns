package estructural.decorator;

public final class CommonBankTransference implements BankTransference {

	@Override
	public void transfer(String bankEntity, float total) {
		System.out.println(String.format("Transfring $ %s to %s", total, bankEntity));
	}
}
