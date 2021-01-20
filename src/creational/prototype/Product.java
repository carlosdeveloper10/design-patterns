package creational.prototype;

import java.io.Serializable;

public class Product implements Serializable{

	private String name;
	private float price;
	private byte quanityt;

	public Product(String name, float price, byte quanityt) {
		super();
		this.name = name;
		this.price = price;
		this.quanityt = quanityt;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}
	
	public byte getQuanityt() {
		return quanityt;
	}

}
