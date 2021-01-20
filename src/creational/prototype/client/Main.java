package creational.prototype.client;

import java.util.List;

import creational.prototype.BuyingCar;
import creational.prototype.OnSiteBuyCar;
import creational.prototype.OnlineBuyCar;
import creational.prototype.Product;

public class Main {
	
	static BuyingCar copyBuyCar;

	public static void main(String[] args) {
		try {
			shallowCopy();
			deepCopy();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void shallowCopy() throws CloneNotSupportedException {
		System.out.println("-- Shallow Copy --");
		BuyingCar orginalBuyCar = new OnlineBuyCar();
		orginalBuyCar.addProduct(new Product("Rice", 1.5f, (byte) 2));
		orginalBuyCar.addProduct(new Product("Potato", 5f, (byte) 5));
		orginalBuyCar.addProduct(new Product("juice", 1.5f, (byte) 4));

		System.out.println("Original car content: ");
		orginalBuyCar.getProducts().stream().forEach(p -> {
			System.out.println(String.format("Product: %s - Units: %s", p.getName(), p.getQuanityt()));
		});

		BuyingCar copyBuyCar = orginalBuyCar.clone();

		System.out.println("Copied car content: ");
		copyBuyCar.getProducts().stream().forEach(p -> {
			System.out.println(String.format("Product: %s - Units: %s", p.getName(), p.getQuanityt()));
		});

		System.out.println("--Modifing copy but not original--\n");
		copyBuyCar.deleteProduct(1);

		System.out.println("Original car content: ");
		orginalBuyCar.getProducts().stream().forEach(p -> {
			System.out.println(String.format("Product: %s - Units: %s", p.getName(), p.getQuanityt()));
		});
		System.out.println("Copied car content: ");
		copyBuyCar.getProducts().stream().forEach(p -> {
			System.out.println(String.format("Product: %s - Units: %s", p.getName(), p.getQuanityt()));
		});
	}

	public static void deepCopy() throws CloneNotSupportedException {
		System.out.println("-- Deep copy --");
		BuyingCar orginalBuyCar = new OnSiteBuyCar();
		orginalBuyCar.addProduct(new Product("Rice", 1.5f, (byte) 2));
		orginalBuyCar.addProduct(new Product("Potato", 5f, (byte) 5));
		orginalBuyCar.addProduct(new Product("juice", 1.5f, (byte) 4));

		System.out.println("Original car content: ");
		orginalBuyCar.getProducts().stream().forEach(p -> {
			System.out.println(String.format("Product: %s - Units: %s", p.getName(), p.getQuanityt()));
		});

		copyBuyCar = orginalBuyCar.clone();

		System.out.println("Copied car content: ");
		copyBuyCar.getProducts().stream().forEach(p -> {
			System.out.println(String.format("Product: %s - Units: %s", p.getName(), p.getQuanityt()));
		});

		System.out.println("--Modifing copy but not original--\n");
		copyBuyCar.deleteProduct(1);

		System.out.println("Original car content: ");
		orginalBuyCar.getProducts().stream().forEach(p -> {
			System.out.println(String.format("Product: %s - Units: %s", p.getName(), p.getQuanityt()));
		});
		System.out.println("Copied car content: ");
		copyBuyCar.getProducts().stream().forEach(p -> {
			System.out.println(String.format("Product: %s - Units: %s", p.getName(), p.getQuanityt()));
		});
	}

}
