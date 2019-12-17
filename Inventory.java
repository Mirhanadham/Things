package project;

import java.util.ArrayList;

public class Inventory {
	
	ArrayList<Product> products;
	ArrayList<Brand> brands;
	
	public Inventory()
	{
		products = new ArrayList<Product>();
		brands= new ArrayList<Brand>();
	}
	
	public void addProductToSystem(ProductSpec spec)
	{
		Product product= new Product(spec);
		products.add(product);
		
		for(Product prod: products)
		{
			System.out.println(prod);
			
		}
	}
	
	public void addBrandToSystem(Brand brand)
	{
		brands.add(brand);
	}

}
