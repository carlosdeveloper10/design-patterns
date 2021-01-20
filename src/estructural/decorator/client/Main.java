package estructural.decorator.client;

import estructural.decorator.BankTransference;
import estructural.decorator.CommonBankTransference;
import estructural.decorator.EUBankTrasnference;
import estructural.decorator.UsaBankTrasnference;

public class Main {

	public static void main(String[] args) {
		
		nationalTransfer();
		usaTransfer();
		euTransfer();
	}
	
	private static void nationalTransfer() {
		System.out.println("********************************************");
		BankTransference decorated = new CommonBankTransference();
		
		decorated.transfer("bancolombia@1478568", 3500000);
	}
	
	private static void usaTransfer() {
		System.out.println("********************************************");
		BankTransference decorated = new CommonBankTransference();
		BankTransference decorator = new UsaBankTrasnference(decorated);
		
		decorator.transfer("scotiabank@1478568", 3500000);
	}
	
	private static void euTransfer() {
		System.out.println("********************************************");
		BankTransference decorated = new CommonBankTransference();
		BankTransference decorator = new EUBankTrasnference(decorated);
		
		decorator.transfer("openbank@1478568", 20000000);
	}

}
