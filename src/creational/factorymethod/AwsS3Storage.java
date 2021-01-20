package creational.factorymethod;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import creational.factorymethod.option_a.Storage;

public class AwsS3Storage extends Storage {

	@Override
	public void save(Document doc) {
		System.out.println("Saving " + doc + " on S3");
	}

	@Override
	public void delete(Document doc) {
		System.out.println("Deleting  " + doc + " from S3");
	}

	@Override
	public void backup(Document doc) {
		DocumentBuilderFactory k;
		System.out.println("Creatin copy of  " + doc + " on S3");
	}
}
