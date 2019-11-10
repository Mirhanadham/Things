package project;

import java.util.ArrayList;

public class Inventory {
	
	ArrayList<Product> products;
	
	public Inventory()
	{
		products = new ArrayList<Product>();
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
	

}
