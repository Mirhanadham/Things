package Controllers;

import project.Collaboratores;
import project.IBrand;
import project.IStoreProduct;
import project.Statistics;
import project.Store;
import project.StoreFunctionalities;
import project.StoreProduct;
import project.StoreSpec;
import project.UserFunctionalities;
import project.StoreSpec.Type;


public class Store_Controller {
	StoreFunctionalities storeFuncs;

	public Store_Controller(StoreFunctionalities funcs)
	{
		this.storeFuncs=funcs;
	}
	
	public void addStoreProduct_Handler(int sid, IBrand brand, int prodId, double price, int quantity , int ownerId,String prodName)
	{
		
		StoreProduct product= new StoreProduct(brand, prodId, sid, quantity, price,ownerId,prodName);
		storeFuncs.addItem(product);
	}
	
	public void addStore_Handler(String name,Type type, String location,int soID )
	{
		int id=0;
		StoreSpec store= new Store (name,id,type,location,soID);
		storeFuncs.addStoretoQueingList(store);
	}
	public void addCollaberator(String userName,int storeID,int storeOwnerID,UserFunctionalities user)
	{
		Collaboratores col=new Collaboratores(userName,storeOwnerID,storeID);
		storeFuncs.addCollaberator(col);
		user.setColToTrue(userName);
		
	}
	
	public IStoreProduct getProduct(int id)
	{
		
	 IStoreProduct product=storeFuncs.getProduct(id);
		return product;
		 
	}

	public void removeProduct_Handler(IStoreProduct product)
	{
		
		storeFuncs.removeItem(product);
	}
	public void diplaystat(int storeId,Statistics stat)
	{
		storeFuncs.displayStatistics(storeId, stat);
	}
	
}
