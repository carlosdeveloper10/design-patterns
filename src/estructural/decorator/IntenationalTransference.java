package estructural.decorator;


public abstract class IntenationalTransference implements BankTransference {
	
	private BankTransference decorated;
	
	public IntenationalTransference(BankTransference decorated) {
		this.decorated = decorated;
	}

	@Override
	public void transfer(String bankEntity, float total) {
		decorated.transfer(bankEntity, total);
	}

}
