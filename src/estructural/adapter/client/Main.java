package estructural.adapter.client;

import estructural.adapter.BankingDocument;
import estructural.adapter.ContractDocument;
import estructural.adapter.modern_system.CobolToModernDataSoruceAdapter;
import estructural.adapter.modern_system.DataSourceDocument;
import estructural.adapter.modern_system.DynamoDbBakingDocument;

public class Main {

	public static void main(String[] args) {
		workingWithLegacySystem();
		workingWithModernSystem();
	}
	
	private static void workingWithLegacySystem() {
		DataSourceDocument dataSourceDocument = new CobolToModernDataSoruceAdapter();
		dataSourceDocument.save(new ContractDocument());
		dataSourceDocument.retrive(new Object());
	}
	
	private static void workingWithModernSystem() {
		DataSourceDocument dataSourceDocument = new DynamoDbBakingDocument();
		dataSourceDocument.save(new BankingDocument());
		dataSourceDocument.retrive(new Object());
	}

}
