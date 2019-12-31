package Controllers;

import UI.DisplayStores;
import project.Cart;
import project.IBrand;
import project.IStoreProduct;
import project.PersonalInfo;
import project.Statistics;
import project.StoreFunctionalities;
import project.StoreProduct;
import project.StoreSpec;
import project.UserFunctionalities;

public class SO_Controller {
	Product_Controller prodCon;
	Brand_Controller brandCon;
	Collaborater_Controller colCon;
	public Store_Controller storeCon;
	
	
	//Cart_Controller cartCon;

	
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
	public StoreSpec findStore(int id)
	{
		return storeCon.findStore(id);
	}
	public boolean addStoreOffer(String name, int sid, double perc)
	{
		return storeCon.addStoreOffer(name, sid, perc);
	}
	public boolean removeStoreOffer(int sid)
	{
		return storeCon.removeOffer(sid);
	}

//	public void addNewCart(int cartId)
//	{
//		cartCon.addCart(cartId);
//	}
	public void addCollaberator(int userID,int storeID,int storeOwnerID,UserFunctionalities user)
	{
		storeCon.addCollaberator(userID, storeID, storeOwnerID,user);
		
	}
	public void listUsers()
	{
		colCon.listUsers();
	}

	public void viewProducts()
	{
		prodCon.viewProducts();
	}
	public boolean removeItem(int  productID)
	{
		
		return storeCon.removeProduct_Handler(productID);
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
	
	
	public String getProductName(int pid)
	{
		return prodCon.getProductName(pid);
	}
	
	public void viewStoresProducts()
	{
		storeCon.viewStoreProducts();
	}
	public void viewMyStoreProds(int sid)
	{
		storeCon.viewMyStoreProds(sid);
	}
	public void viewStores(int userID,boolean collab)
	{
		storeCon.viewStore(userID, collab);
	}
	public void history(int storeID)
	{
		storeCon.viewHistory(storeID);
	}
	public void undoAction(int actionID,UserFunctionalities user)
	{
		storeCon.undo(actionID,user);	
	}
}
