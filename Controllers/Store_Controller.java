package Controllers;

import java.util.ArrayList;

import UI.DisplayHistory;
import UI.DisplayMyStoreItems;
import UI.DisplayStores;
import UI.DisplayStoresItems;
import project.Collaboratores;
import project.IBrand;
import project.IStoreProduct;
import project.Statistics;
import project.Store;
import project.StoreFunctionalities;
import project.StoreOffer;
import project.StoreProduct;
import project.StoreSpec;
import project.UserFunctionalities;

public class Store_Controller {
	StoreFunctionalities storeFuncs;
	Statistics stats;
	
	
	public Store_Controller(StoreFunctionalities funcs,Statistics stat)
	{
		this.storeFuncs=funcs;
		this.stats=stat;
	}
	public void addStoreProduct_Handler(int sid, IBrand brand, int prodId, double price, int quantity , int ownerId,String prodName)
	{
		
		StoreProduct product= new StoreProduct(brand, prodId, sid,quantity, price,ownerId,prodName);
		storeFuncs.addItem(product);
	}
	
	public void addStore_Handler(String name,Store.Type type, String location,int soID )
	{
		int id=0;
		Store store= new Store (name,id,type,location,soID);
		storeFuncs.addStoretoQueingList(store);
	}
	public void addCollaberator(int colID,int storeID,int storeOwnerID,UserFunctionalities user)
	{
		Collaboratores col=new Collaboratores(colID,storeOwnerID,storeID);
		storeFuncs.addCollaberator(col);
		user.setCollaboratortoTrue(colID);
		
	}
	public StoreSpec findStore(int id)
	{
		ArrayList<StoreSpec> stores= storeFuncs.getstoreList();
		for(StoreSpec spec:stores)
		{
			if(spec.getId()==id)
			{
				return spec;
			}
		}
		return null;
	}
	public void viewStoreProducts()
	{
		new DisplayStoresItems(storeFuncs);
		stats.updateViews();
	}
	public boolean addStoreOffer(String name, int sid, double perc)
	{
		return storeFuncs.addOffer(sid, name, perc);
	}
	public StoreOffer getStoreOffer(int sid)
	{
		return storeFuncs.getOfferWithSID(sid);
	}
	public boolean removeOffer(int sid)
	{
		return storeFuncs.removeOffer(sid);
	}
	public IStoreProduct getStoreProdWithID(int pid)
	{
		return storeFuncs.getItemWithID(pid);
	}
	public void updateQuantity(int pid, int quantity)
	{
		storeFuncs.updateQuantity(pid, quantity);
	}
	public boolean removeProduct_Handler(int pid)
	{
		return storeFuncs.removeItem(pid);
	}
	public void diplaystat(int storeId,Statistics stat)
	{
		storeFuncs.displayStatistics(storeId, stat);
	}
	public IStoreProduct getProduct(int id)
	{
		return storeFuncs.getItemWithID(id);
	}
	public void viewMyStoreProds(int sid)
	{
		new DisplayMyStoreItems(sid, storeFuncs);
	}
	public void checkSoldOut(int pid)
	{
		IStoreProduct product=getProduct(pid);
		if(product!=null)
		{
			if(product.getQuantity()==0)
				stats.updateSoldoutProducts(pid);
		}
	}
	public void updateBoughtProducts(int storeID,int quantity)
	{
		stats.updateBoughtProducts(storeID, quantity);
	}
	public void viewStore(int userID,boolean collab)
	{
		new DisplayStores(storeFuncs, userID, collab);
	}
	public void viewHistory(int storeID)
	{
		new DisplayHistory(storeID,storeFuncs);
	}
	public void undo(int actionID,UserFunctionalities user)
	{
		storeFuncs.undoHistory(actionID,user);
	}

}
