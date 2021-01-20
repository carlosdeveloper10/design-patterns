package creational.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class OnlineBuyCar implements BuyingCar {

	ArrayList<Product> products;

	public OnlineBuyCar() {
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
		return (BuyingCar) super.clone();
	}
Calendar p;
	
	@Override
	public Collection<Product> getProducts() {
		return new ArrayList<>(products);
	}

}
