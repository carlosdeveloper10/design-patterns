package creational.factorymethod;

import creational.factorymethod.option_a.Storage;

public class OnPremiseStorage extends Storage {

	@Override
	public void save(Document doc) {
		System.out.println("Saving " + doc + " on local server");
	}

	@Override
	public void delete(Document doc) {
		System.out.println("Deleting  " + doc + " from local server");
	}

	@Override
	public void backup(Document doc) {
		System.out.println("Creatin copy of  " + doc + " on local server");
	}

}
