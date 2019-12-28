package Controllers;

import UI.DisplayStoresItems;
import project.IBrand;
import project.StoreFunctionalities;
import project.StoreProduct;

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
	public void viewStoreProducts()
	{
		new DisplayStoresItems(storeFuncs);
	}

}
