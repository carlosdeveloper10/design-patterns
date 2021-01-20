package creational.factorymethod.option_b;

import creational.factorymethod.AwsS3Storage;
import creational.factorymethod.AzureStorage;
import creational.factorymethod.Document;
import creational.factorymethod.GCloudStorage;
import creational.factorymethod.OnPremiseStorage;
import creational.factorymethod.StorageServices;
import creational.factorymethod.option_a.Storage;

public class StoragefactoryImpl implements StorageFactory<Document> {

	@Override
	public Storage<Document> create(StorageServices targetStorage) {
		switch (targetStorage) {
		case AWS_S3:
			return new AwsS3Storage();
		case AZURE_BLOB:
			return new AzureStorage();
		case GC_STORAGE:
			return new GCloudStorage();
		default:
			return new OnPremiseStorage();
		}
	}

}
