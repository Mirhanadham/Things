package sw;

import java.io.Serializable;

public class ProductSpec implements Serializable {
	private String name;
	private double price;
	private String brand;
	private String category;
	private String description;
	private Integer rate;
	
	private static final long serialVersionUID = 1L;
	 
	
	public ProductSpec(String name,double price, String brand, String category, String description, int rate )
	{
		this.name=name;
		this.price=price;
		this.brand=brand;
		this.category=category;
		this.description=description;
		this.rate=rate;
	}
	
	public ProductSpec()
	{
		
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public  String getName() {
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
	
	
	@Override
	public String toString()
	{
		return new StringBuffer("Name: ").append(this.getName())
				.append("Brand: ").append(this.getBrand()).append("Price: ").append(this.getPrice()).append("category: ").append(this.getCategory()).append("Description: ").append(this.getDescription()).append("rate").append(this.getRate()).toString();
	

	}
}