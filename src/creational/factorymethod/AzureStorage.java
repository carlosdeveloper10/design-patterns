package creational.factorymethod;

import creational.factorymethod.option_a.Storage;

public class AzureStorage extends Storage {

	@Override
	public void save(Document doc) {
		System.out.println("Saving " + doc + " on local azure");
	}

	@Override
	public void delete(Document doc) {
		System.out.println("Deleting  " + doc + " from local azure");
	}

	@Override
	public void backup(Document doc) {
		System.out.println("Creatin copy of  " + doc + " on local azure");
	}

}
