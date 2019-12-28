package Controllers;

import java.util.ArrayList;

import project.IBrand;
import project.ProductSpec;

public class Admin_Controller {
	Product_Controller prodCon;
	Brand_Controller brandCon;
	
	public Admin_Controller(Product_Controller podController, Brand_Controller brandController)
	{
		this.brandCon=brandController;
		this.prodCon=podController;
	}

	public void addProduct_Handler(String name, String category, double price)
	{
		prodCon.addProduct_Handler(name, category, price);
	}
	
	public void addBrand_Handler(String name, String category, String founder)
	{
		brandCon.addBrand(name, founder, category);
	}
	
	public void viewProducts()
	{
		prodCon.viewProducts();
	}
	
	public void viewBrands()
	{
		brandCon.viewBrands();
	}
	public IBrand getBrand(int id)
	{
		IBrand brand=brandCon.getBrandwId(id);
		return brand;
	}
	public boolean findProduct(int pid)
	{
		ArrayList<ProductSpec> products=prodCon.getProducts();
		for(ProductSpec spec:products)
		{
			if(spec.getId()==pid)
				return true;
		}
		return false;
	}
	
	public boolean findBrand(int bid)
	{
		IBrand brand= brandCon.getBrandwId(bid);
		if(brand==null)
			return false;
		else 
			return true;
	}
	public String getProductName(int id)
	{
		return prodCon.getProductName(id);
	}

}
