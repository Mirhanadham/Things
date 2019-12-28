package Controllers;

import java.util.ArrayList;

import UI.DisplayProducts;
import project.Product;
import project.ProductInventory;
import project.ProductSpec;

public class Product_Controller {
	ProductInventory productIn;
	
	
	public Product_Controller(ProductInventory in) {
		this.productIn=in;
		
	}
	public void addProduct_Handler(String name, String category, double price)
	{
		
		
		Product spec= new Product(name, price, category); 
		productIn.addProduct(spec);
		
	}
	
	public void viewProducts()
	{
		DisplayProducts display= new DisplayProducts(productIn);
	}
	
	public ArrayList<ProductSpec> getProducts()
	{
		return productIn.productList();
	}
	
	public String getProductName(int id)
	{
		return productIn.getProductName(id);
	}
	
	public boolean findProduct(int pid)
	{
		ProductSpec spec=productIn.searchPID(pid);
		if(spec==null)
			return false;
		else
			return true;
	}

}
