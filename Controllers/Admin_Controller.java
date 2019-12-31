package Controllers;

import java.util.ArrayList;

import project.IBrand;
import project.ProductSpec;

public class Admin_Controller {
	Product_Controller prodCon;
	Brand_Controller brandCon;
	Verified_Controller verCon;
	Stat_Controller statCon;
	
	public Admin_Controller(Product_Controller podController, Brand_Controller brandController,Verified_Controller verCon,Stat_Controller statCon)
	{
		this.verCon=verCon;
		this.brandCon=brandController;
		this.prodCon=podController;
		this.statCon=statCon;
	}
	public void addProduct_Handler(String name, String category, double price)
	{
		prodCon.addProduct_Handler(name, category, price);
	}
	
	public void addBrand_Handler(String name, String category, String founder)
	{
		brandCon.addBrand(name, founder, category);
	}
	public void listOfStoresWaiting()
	{
		verCon.listOfStoresWaiting();
	}
	public void notVerifie(int storeId,int storeOwnerId)
	{
		verCon.notVerifie(storeId, storeOwnerId);
		
	}
	public void verifie(int storeId,int storeOwnerId)
	{
		
		verCon.verifie(storeId, storeOwnerId);
		
	}
	public void max(int map)
	{
		statCon.max(map);
	}
	
	public void min(int map)
	{
		statCon.min(map);
	}
	public void avg(int map)
	{
		statCon.avg(map);
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

}
