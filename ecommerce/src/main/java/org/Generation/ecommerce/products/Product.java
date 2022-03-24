package org.Generation.ecommerce.products;

public class Product {
	private String name;
	private String description;
	private String url_image;
	private double price;
	private int id;
	private static int total = 0;
	
	public Product(String name, String description, String url_image, double price) {
		super();
		total++;
		this.id = total;
		this.name = name;
		this.description = description;
		this.url_image = url_image;
		this.price = price;
	} // constructor
	
	public Product() {
		super();
		total++;
		this.id = total;
	} // product constructor
	
	public int getId() {
		return id;
	} // getId

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl_image() {
		return url_image;
	}

	public void setUrl_image(String url_image) {
		this.url_image = url_image;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", description=" + description + ", url_image=" + url_image + ", price="
				+ price + "]";
	}
	
}
