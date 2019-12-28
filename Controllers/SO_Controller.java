package Controllers;

import project.IBrand;
import project.StoreFunctionalities;
import project.StoreProduct;

public class SO_Controller {
	Product_Controller prodCon;
	Brand_Controller brandCon;
	Store_Controller storeCon;
	 public SO_Controller(Product_Controller prodcontrol,Brand_Controller brandcontrol,Store_Controller storecontrol) {
		this.prodCon=prodcontrol;
		this.brandCon=brandcontrol;
		this.storeCon=storecontrol;

	}
	public void addItemToStore(int sid, int brandId, int prodId, double price, int quantity , int ownerId,String prodName)
	{
		IBrand brand=brandCon.getBrandwId(brandId);
		storeCon.addStoreProduct_Handler(sid, brand, prodId, price, quantity, ownerId, prodName);
		
	}
	public void viewProducts()
	{
		prodCon.viewProducts();
	}
	
	public void viewBrands()
	{
		brandCon.viewBrands();
	}
	public boolean findProduct(int pid)
	{
		return prodCon.findProduct(pid);
	}
	
	public boolean findBrand(int bid)
	{
		return brandCon.findBrand(bid);
	}
	
	public boolean findStore(int sid)
	{
		return false;
		
	}
	public String getProductName(int pid)
	{
		return prodCon.getProductName(pid);
	}
	

	public void viewStores()
	{
		
	}
}
