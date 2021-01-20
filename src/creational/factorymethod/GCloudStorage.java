package creational.factorymethod;

import creational.factorymethod.option_a.Storage;

public class GCloudStorage extends Storage {

	@Override
	public void save(Document doc) {
		System.out.println("Saving " + doc + " on GCloud");
	}

	@Override
	public void delete(Document doc) {
		System.out.println("Deleting  " + doc + " from GCloud");
	}

	@Override
	public void backup(Document doc) {
		System.out.println("Creatin copy of  " + doc + " on GCloud");
	}

}
