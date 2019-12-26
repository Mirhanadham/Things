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
	{  // System.out.println("product 1");
		
		storeprsoduct.setId(storeProductList.size());
		storeProductList.add(storeprsoduct);
//		System.out.println("prodcut id "+storeprsoduct.getId());
		
		//System.out.println("product list size "+storeProductList.size());
		
	}
	
	//public void addCollaborators();
	
	public void addStore(StoreSpec storespec )  {
		storespec.setId(storesList.size());
		storesList.add(storespec);
		System.out.println("store list size "+storesList.size());
		
		
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
