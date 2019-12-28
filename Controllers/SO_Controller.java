package Controllers;

import project.IBrand;
import project.StoreFunctionalities;
import project.StoreProduct;

public class SO_Controller {
	Admin_Controller adminCon;
	StoreFunctionalities storeFun;
	 public SO_Controller(Admin_Controller aCon,StoreFunctionalities funcs) {
		this.adminCon=aCon;
		this.storeFun=funcs;

	}
	public void addItemToStore(int sid, int brandId, int prodId, double price, int quantity , int ownerId,String prodName)
	{
		IBrand brand=adminCon.getBrand(brandId);
		StoreProduct product= new StoreProduct(brand, prodId, sid, quantity, price,ownerId,prodName);
		storeFun.addItem(product);
	}
	public void viewProducts()
	{
		adminCon.viewProducts();
	}
	
	public void viewBrands()
	{
		adminCon.viewBrands();
	}
	public boolean findProduct(int pid)
	{
		return adminCon.findProduct(pid);
	}
	
	public boolean findBrand(int bid)
	{
		return adminCon.findBrand(bid);
	}
	
	public boolean findStore(int sid)
	{
		return false;
		
	}
	public String getProductName(int pid)
	{
		return adminCon.getProductName(pid);
	}
	

	public void viewStores()
	{
		
	}
}
