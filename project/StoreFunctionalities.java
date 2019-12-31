package project;

import java.util.ArrayList;

public class StoreFunctionalities {
	ArrayList<StoreSpec> storesList ;
	ArrayList<StoreSpec> storesQueingList ;
	ArrayList<IStoreProduct> storeProductList;
	ArrayList<IStoreProduct> storeProductListRemoved;
	ArrayList<Collaboratores> Collaboratores;
	ArrayList<History> history;
	
	
	
	public StoreFunctionalities()
	{
		storesList= new ArrayList<StoreSpec>();
		storesQueingList =new ArrayList<StoreSpec>();
		storeProductList= new ArrayList<IStoreProduct>();
		Collaboratores =new ArrayList<Collaboratores>();
		 history= new ArrayList<History>();
		  storeProductListRemoved=new ArrayList<IStoreProduct>();
		
		Store store1= new Store("store1",0,StoreSpec.Type.ONLINE,"sdfgsdfgs",0);
		storesList.add(store1);
		Store store2= new Store("store2",1,StoreSpec.Type.ONLINE,"sdfgsdfgs",0);
		storesList.add(store2);
	}
	
	public void addItem(IStoreProduct storeprsoduct)
	{ 
		
		storeprsoduct.setId(storeProductList.size());
		storeProductList.add(storeprsoduct);
		System.out.println(storeprsoduct.getId()+" "+storeprsoduct.getProductId()+" "+storeprsoduct.getStoreId());
		History his=new History(storeprsoduct.getStoreId(),storeprsoduct.getId(),"item added",history.size());
		history.add(his);
		
	}
	public void addStoretoQueingList(StoreSpec storespec )  {

		storespec.setId(storesList.size());
		storesQueingList.add(storespec);
		System.out.println("store is waiting to be verified by admin");
		
	}
	
	public void addCollaberator(Collaboratores col,UserFunctionalities user)
	{
		
		Collaboratores.add(col);
		user.setCollaboratortoTrue(col.colID);
		History his=new History(col.storeID,col.colID,"Collaborater added",history.size());
		history.add(his);
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
			History his=new History(storeproduct.getStoreId(),storeproduct.getId(),"item removed",history.size());
			history.add(his);
			storeProductListRemoved.add(storeproduct);
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
	
	public ArrayList<Collaboratores> getCollaborators()
	{
		return Collaboratores;
	}
		
	
		
	public ArrayList<IStoreProduct> itemsList()
	{
		return storeProductList;
	}

	public void verifie(int storeId,int storeOwnerId)
	{
		
		
		StoreSpec store=storesQueingList.get(storeId);
		storesList.add(store);
		int removeindex= storesQueingList.indexOf(store);
		storesQueingList.remove(removeindex);
		
	}

	public void notVerifie(int storeId,int storeOwnerId)
	{
		int indexOfVerifiedStore=storesQueingList.indexOf(storeId);
		storesQueingList.remove(indexOfVerifiedStore);
		
	}
	
	public void displayStatistics(int storeId,Statistics stat)
	{
		stat.print(storeId);
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

	public void undoHistory (int actionId,UserFunctionalities user) {
		for(History history:history )
		{
			if(history.getActionID()==actionId)
			{
				if(history.actionTaken=="item added")
				{
					int index=storeProductList.indexOf(history.getID());
					IStoreProduct store=storeProductList.get(index);
					removeItem(store);
				}
				else if (history.actionTaken=="Collaborater added")
				{
					int index=Collaboratores.indexOf(history.getID());
					user.setCollaboratortoFalse(Collaboratores.get(index).colID);
					Collaboratores.remove(index);
				}
				else
				{
					int index=storeProductListRemoved.indexOf(history.getID());
					IStoreProduct store=storeProductListRemoved.get(index);
					addItem(store);
					
				}
					
			}
		}
	}

	public ArrayList<History> getHistory()
	{
		return history;
	}

}