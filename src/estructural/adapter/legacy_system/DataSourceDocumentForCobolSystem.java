package estructural.adapter.legacy_system;

import estructural.adapter.ContractDocument;

public class DataSourceDocumentForCobolSystem {

	public void saveOnServerFolder(ContractDocument document) {
		System.out.println(String.format("Saving %s on Cobol System", document));
	}

	public ContractDocument getFromServerDocument(Object id) {
		System.out.println(String.format("Retriving document from Cobol System"));
		return null;
	}
}
