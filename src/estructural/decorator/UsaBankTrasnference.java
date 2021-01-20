package estructural.decorator;

public class UsaBankTrasnference extends IntenationalTransference {

	public UsaBankTrasnference(BankTransference decorated) {
		super(decorated);
	}

	private static final float TRANSFER_TAX = 0.15F;

	@Override
	public void transfer(String bankEntity, float total) {

		float targetCurrency = CurrencyConvertor.convert(total, Currency.DOLLAR);
		System.out.println(String.format("COP %s -> USD %s", total, targetCurrency));

		float totalToBeTransfered = aplayTaxes(targetCurrency);
		System.out.println(String.format("Tax of 15  applied, total to be transfered: %s USD ", totalToBeTransfered));

		super.transfer(bankEntity, totalToBeTransfered);

		System.out.println("Notyfing transference to AMERICAN banking tracer");
	}

	public float aplayTaxes(float totalToBeTransfered) {
		return totalToBeTransfered - (totalToBeTransfered * TRANSFER_TAX);
	}
}
