package project;

import java.util.ArrayList;

public class StoreFunctionalities {
	ArrayList<StoreSpec> storesList ;
	ArrayList<IStoreProduct> storeProductList;
	
	
	public StoreFunctionalities()
	{
		storesList= new ArrayList<StoreSpec>();
		storeProductList= new ArrayList<IStoreProduct>();
	}
	
	public void addItem(IStoreProduct storeprsoduct)
	{ 
		
		storeprsoduct.setId(storeProductList.size());
		storeProductList.add(storeprsoduct);
		System.out.println(storeprsoduct.getId()+" "+storeprsoduct.getProductId()+" "+storeprsoduct.getStoreId());

		
	}
	
	
	
	public void addStore(StoreSpec storespec )  {
		storespec.setId(storesList.size());
		storesList.add(storespec);
		System.out.println("store list size "+storesList.size());
		
		
		}
	
	public String getStoreName(int sid)
	{
		StoreSpec store= storesList.get(sid);
		return store.getName();
	}
	
	public void updateQuantity(int pid, int quantity)
	{
		 storeProductList.get(pid).setQuantity(quantity);
	}
	
	
	
	public void removeItem (IStoreProduct storeproduct) {	
		
		boolean found= false;
		
		for (IStoreProduct pro: storeProductList)
		{
			if (pro.getId()==storeproduct.getId())
			{
				found=true;
			}
		}
		if (found ==true)
		{
			storeProductList.remove(storeproduct.getId());
			System.out.println("ID Removed");
		}
		else
			System.out.println("not found");
		
	}
	
	public ArrayList<IStoreProduct> itemsList()
	{
		return storeProductList;
	}
	
	public IStoreProduct getItemWithID(int id)
	{
		for(IStoreProduct prod:storeProductList)
		{
			if(prod.getId()==id)
				return prod;
		}
		return null;
	}
}