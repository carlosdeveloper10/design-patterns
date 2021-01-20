package estructural.decorator;

public final class CurrencyConvertor {

	private CurrencyConvertor() {

	}

	public static float convert(float cop, Currency currency) {
		switch (currency) {
		case DOLLAR:
			return cop / 3500;
		case EURO:
			return cop / 4000;
		default:
			return cop;
		}
	}
}
