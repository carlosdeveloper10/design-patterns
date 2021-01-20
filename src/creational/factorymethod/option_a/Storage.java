package creational.factorymethod.option_a;

import creational.factorymethod.AwsS3Storage;
import creational.factorymethod.AzureStorage;
import creational.factorymethod.Document;
import creational.factorymethod.GCloudStorage;
import creational.factorymethod.OnPremiseStorage;
import creational.factorymethod.StorageServices;

public abstract class Storage<T extends Document> {

	public abstract void save(T doc);

	public abstract void delete(T doc);

	public abstract void backup(T doc);

	public static Storage getStorage(StorageServices targetStorage) {
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
