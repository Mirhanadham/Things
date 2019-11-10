package project;

public class ProductSpec {
	
	private String name;
	private String brand;
	private double price;
	private String category;
	private String description;
	private int rate;
	
	public ProductSpec(String name, String brand, double price, String category, String description, int rate)
	{
		this.name= name;
		this.brand=brand;
		this.price=price;
		this.description=description;
		this.category=category;
		this.rate=rate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	
	
}
