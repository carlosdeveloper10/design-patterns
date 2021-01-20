package creational.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class OnSiteBuyCar implements BuyingCar, Serializable {

	List<Product> products;

	public OnSiteBuyCar() {
		products = new ArrayList<>();
	}

	@Override
	public void addProduct(Product product) {
		products.add(product);
	}

	@Override
	public void deleteProduct(int indexOnList) {
		products.remove(indexOnList);
	}

	@Override
	public BuyingCar clone() throws CloneNotSupportedException {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			oos.close();
			
			ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
			return (BuyingCar) ois.readObject();
		} catch (Exception e) {
			throw new RuntimeException("Cloning failed");
		}

	}

	@Override
	public Collection<Product> getProducts() {
		return new ArrayList<>(products);
	}

}
