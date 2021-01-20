package estructural.adapter.modern_system;

import estructural.adapter.BankingDocument;

public class DynamoDbBakingDocument implements DataSourceDocument<BankingDocument> {

	
	@Override
	public void save(BankingDocument entity) {
		System.out.println(String.format("Saving %s on Moder System on AWS", entity));
		
	}

	@Override
	public BankingDocument retrive(Object id) {
		System.out.println(String.format("Retriving from modern Sisteem on AWS"));
		return null;
	}

}
