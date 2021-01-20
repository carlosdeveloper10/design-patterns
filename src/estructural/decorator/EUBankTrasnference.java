package estructural.decorator;

public class EUBankTrasnference extends IntenationalTransference {

	public EUBankTrasnference(BankTransference decorated) {
		super(decorated);
	}

	@Override
	public void transfer(String bankEntity, float total) {

		float targetCurrency = CurrencyConvertor.convert(total, Currency.EURO);
		System.out.println(String.format("COP %s -> EURO %s", total, targetCurrency));
		super.transfer(bankEntity, targetCurrency);
		System.out.println("Notyfing transference to UN banking tracer");
	}
}
