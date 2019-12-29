package project;

import java.util.ArrayList;



public class StoreFunctionalities {
	ArrayList<StoreSpec> storesList ;
	ArrayList<StoreSpec> storesQueingList ;
	ArrayList<IStoreProduct> storeProductList;
	ArrayList<Collaboratores> Collaboratores;
	
	
	
	public StoreFunctionalities()
	{
		storesList= new ArrayList<StoreSpec>();
		storesQueingList =new ArrayList<StoreSpec>();
		storeProductList= new ArrayList<IStoreProduct>();
		Collaboratores =new ArrayList<Collaboratores>();
	}
	public IStoreProduct getProduct(int id)
	{
		
		for(int i=0;i<storeProductList.size();i++)
		{
			if(storeProductList.get(i).getId()==id)
				return storeProductList.get(i);
		}
		return null;
		 
	}
	public void addItem(IStoreProduct storeproduct)
	{  	
		storeproduct.setId(storeProductList.size());
		storeProductList.add(storeproduct);
		System.out.println("prodcut id "+storeproduct.getId());
		
	}
	public void addCollaberator(Collaboratores col)
	{
		
		Collaboratores.add(col);
	}
//create message box
	public void addStoretoQueingList(StoreSpec storespec )  {

		storespec.setId(storesList.size());
		storesQueingList.add(storespec);
		System.out.println("store is waiting to be verified by admin");
		
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
	
	public ArrayList<StoreSpec> getstoreQueingList()
	{
		return storesQueingList ;
	}

	public ArrayList<StoreSpec> getstoreList()
	{
		return storesList ;
	}
		
	public String getStoreName(int sid)
	{
		StoreSpec store= storesList.get(sid);
		return store.getName();
	}
		
	public ArrayList<IStoreProduct> itemsList()
	{
		return storeProductList;
	}

	public void verifie(String storeId,String storeOwnerId)
	{
		
		int indexOfVerifiedStore=storesQueingList.indexOf(storeId);
		StoreSpec store=storesQueingList.get(indexOfVerifiedStore);
		storesList.add(store);
		storesQueingList.remove(indexOfVerifiedStore);
		
	}

	public void notVerifie(String storeId,String storeOwnerId)
	{
		int indexOfVerifiedStore=storesQueingList.indexOf(storeId);
		storesQueingList.remove(indexOfVerifiedStore);
		
	}
	
	public void displayStatistics(int storeId,Statistics stat)
	{
		stat.print(storeId);
	}
	
}



	
	

	


	
