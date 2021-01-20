package estructural.adapter.modern_system;

import estructural.adapter.ContractDocument;
import estructural.adapter.legacy_system.DataSourceDocumentForCobolSystem;

public class CobolToModernDataSoruceAdapter implements DataSourceDocument<ContractDocument>{

	DataSourceDocumentForCobolSystem adaptee;
	
	public CobolToModernDataSoruceAdapter() {
		adaptee = new DataSourceDocumentForCobolSystem();
	}
	
	@Override
	public void save(ContractDocument entity) {
		System.out.println("Adapting to DataSourceDocumentForCobolSystem");
		adaptee.saveOnServerFolder(entity);
	}

	@Override
	public ContractDocument retrive(Object id) {
		
		java.lang.Appendable ap;
		System.out.println("Adapting to DataSourceDocumentForCobolSystem");
		return adaptee.getFromServerDocument(id);
	}

}
