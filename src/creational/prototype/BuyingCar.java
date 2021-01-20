package creational.prototype;

import java.util.Collection;

public interface BuyingCar extends Cloneable{

	void addProduct(Product product);

	void deleteProduct(int indexOnList);
	
	Collection<Product> getProducts();

	BuyingCar clone() throws CloneNotSupportedException;

}
