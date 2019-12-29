package Controllers;


import project.StoreSpec.Type;
import project.Collaboratores;
import project.IBrand;
import project.IStoreProduct;
import project.Statistics;
import project.UserFunctionalities;

public class SO_Controller {
	Product_Controller prodCon;
	Brand_Controller brandCon;
	Store_Controller storeCon;
	Collaborater_Controller colCon;
	 public SO_Controller(Product_Controller prodcontrol,Brand_Controller brandcontrol,Store_Controller storecontrol,Collaborater_Controller colCon) {
		this.prodCon=prodcontrol;
		this.brandCon=brandcontrol;
		this.storeCon=storecontrol;
		this.colCon=colCon;

	}
	public void addItemToStore(int sid, int brandId, int prodId, double price, int quantity , int ownerId,String prodName)
	{
		IBrand brand=brandCon.getBrandwId(brandId);
		storeCon.addStoreProduct_Handler(sid, brand, prodId, price, quantity, ownerId, prodName);
		
	}
	public void addStore(String name ,project.StoreSpec.Type type, String location,int soID )
	{
		
		storeCon.addStore_Handler(name,type,location,soID);
		
	}
	public void addCollaberator(String userName,int storeID,int storeOwnerID,UserFunctionalities user)
	{
		storeCon.addCollaberator(userName, storeID, storeOwnerID,user);
		
	}
	public void listUsers()
	{
		colCon.listUsers();
	}
	public void viewProducts()
	{
		prodCon.viewProducts();
	}
	public void removeItem(int  productID)
	{
		IStoreProduct storeProduct=storeCon.getProduct(productID);
		storeCon.removeProduct_Handler(storeProduct);
	}
	public void viewBrands()
	{
		brandCon.viewBrands();
	}
	public void viewStat(int storeId,Statistics stat)
	{
		storeCon.diplaystat(storeId,stat);
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
