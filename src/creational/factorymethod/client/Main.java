package creational.factorymethod.client;

import creational.factorymethod.Document;
import creational.factorymethod.PdfDoc;
import creational.factorymethod.StorageServices;
import creational.factorymethod.option_a.Storage;
import creational.factorymethod.option_b.StorageFactory;
import creational.factorymethod.option_b.StoragefactoryImpl;

public class Main {

	public static void main(String[] args) {
		exampleA();
		exampleB();
	}

	//By using static method INTO the parent
	public static void exampleA() {

		Document doc = new PdfDoc();

		Storage<Document> storage1 = Storage.getStorage(StorageServices.AWS_S3);
		storage1.save(doc);
		storage1.delete(doc);

		Storage<Document> storage2 = Storage.getStorage(StorageServices.ON_PREMISE);
		storage2.save(doc);
		storage2.delete(doc);
	}
	
	//By using factory interface
		public static void exampleB() {

			Document doc = new PdfDoc();
			StorageFactory<Document> factopry = new StoragefactoryImpl();

			Storage<Document> storage1 = factopry.create(StorageServices.AZURE_BLOB);
			storage1.save(doc);
			storage1.delete(doc);

			Storage<Document> storage2 = factopry.create(StorageServices.GC_STORAGE);
			storage2.save(doc);
			storage2.delete(doc);
		}

}
