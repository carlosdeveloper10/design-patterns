package creational.factorymethod.option_b;

import creational.factorymethod.Document;
import creational.factorymethod.StorageServices;
import creational.factorymethod.option_a.Storage;

public interface StorageFactory<T extends Document> {

	Storage<T> create(StorageServices targetStorage);
}
