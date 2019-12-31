package project;

import java.util.ArrayList;

public class StoreFunctionalities {
	ArrayList<StoreSpec> storesList ;
	ArrayList<StoreSpec> storesQueingList ;
	ArrayList<IStoreProduct> storeProductList;
	ArrayList<IStoreProduct> storeProductListRemoved;
	ArrayList<Collaboratores> Collaboratores;
	ArrayList<StoreOffer> storeOffers;
	ArrayList<History> history;
	
	
	
	
	public StoreFunctionalities()
	{
		storesList= new ArrayList<StoreSpec>();
		storesQueingList =new ArrayList<StoreSpec>();
		storeProductList= new ArrayList<IStoreProduct>();
		Collaboratores =new ArrayList<Collaboratores>();
		storeOffers= new ArrayList<StoreOffer>();
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
		History his=new History(storeprsoduct.getStoreId(),storeprsoduct.getId(),History.ActionType.PRODUCTADD,history.size());
		history.add(his);

		
	}
	public boolean addOffer(int sid,String name,double perc)
	{
		StoreOffer offer=getOfferWithSID(sid);
		if(offer==null)
		{
			StoreOffer newOffer= new StoreOffer(name, sid, perc);
			storeOffers.add(newOffer);
			History hi =new History(sid,0,History.ActionType.OFFERADD,history.size());
			history.add(hi);
			return true;
		}
		else
			return false;
	}
	public void addStoretoQueingList(StoreSpec storespec )  {

		storespec.setId(storesList.size());
		storesQueingList.add(storespec);
		System.out.println("store is waiting to be verified by admin");
		
	}
	
	public void addCollaberator(Collaboratores col)
	{
		
		Collaboratores.add(col);
		//user.setCollaboratortoTrue(col.colID);
		History his=new History(col.storeID,col.colID,History.ActionType.COLLABADD,history.size());
		history.add(his);
	}

	
	public String getStoreName(int sid)
	{
		StoreSpec store= storesList.get(sid);
		return store.getName();
	}
	
	public void updateQuantity(int pid, int quantity)
	{
		 IStoreProduct prod= getItemWithID(pid);
		 for(IStoreProduct stpd:itemsList())
		 {
			 if(prod.getId()==prod.getId())
			 {
				 stpd.setQuantity(quantity);
			 }
		 }
	}
	
	
	
	public boolean removeItem (int pid) {	
		
		IStoreProduct prod=getItemWithID(pid);
		
		if(prod==null)
		{
			return false;
		}
		else
		{
			History his=new History(prod.getStoreId(),prod.getId(),History.ActionType.PRODUCTREM,history.size());
			history.add(his);
			storeProductListRemoved.add(prod);
			int index=itemsList().indexOf(prod);
			itemsList().remove(index);
			return true;
		}
		
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

	public StoreSpec getQueingStore(int sid)
	{
		for(StoreSpec store:storesQueingList)
		{
			if(store.getId()==sid)
			{
				return store;
			}
		}
		return null;
	}
	
	public void verifie(int storeId,int storeOwnerId)
	{
		StoreSpec store=getQueingStore(storeId);
		if(store!=null)
		{
		store.setId(storesList.size());
		storesList.add(store);
		StoreSpec storeRem=getQueingStore(storeId);
		int removeindex= storesQueingList.indexOf(storeRem);
		storesQueingList.remove(removeindex);
		}
		
	}

	public void notVerifie(int storeId,int storeOwnerId)
	{
		StoreSpec store= getQueingStore(storeId);
		if(store!=null)
		{
			int index=storesQueingList.indexOf(store);
			storesQueingList.remove(index);
		}
		
		
	}
	
	public void displayStatistics(int storeId,Statistics stat)
	{
		stat.print(storeId);
	}
	public boolean removeOffer(int sid)
	{
		StoreOffer offer=getOfferWithSID(sid);
		if(offer!=null)
		{
			int index=storeOffers.indexOf(offer);
			storeOffers.remove(index);
			return true;
		}
		else
			return false;
	}
	
	public void removeCollab(int id)
	{
		Collaboratores collab= getCollabWithID(id);
		if(collab!=null)
		{
			int index=Collaboratores.indexOf(collab);
			Collaboratores.remove(index);
		}
	}
	
	public ArrayList<StoreOffer> getOffers()
	{
		return storeOffers;
	}
	public StoreOffer getOfferWithSID(int sid)
	{
		for(StoreOffer offer:storeOffers)
		{
			if(offer.getStoreID()==sid)
			{
				return offer;
			}
		}
		return null;
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
	public History findHistory(int id)
	{
		for(History his:history)
		{
			if(his.getID()==id)
			{
				return his;
			}
		}
		return null;
	}
	public Collaboratores getCollabWithID(int id)
	{
		for(Collaboratores collab:Collaboratores)
		{
			if(collab.getColID()==id)
			{
				return collab;
			}
		}
		return null;
	}
	
	public StoreOffer getOffer(int id)
	{
		for(StoreOffer offer:storeOffers)
		{
			if(offer.getStoreID()==id)
			{
				return offer;
			}
		}
		return null;
	}
	public void undoHistory (int actionId,UserFunctionalities user) {

			History history=findHistory(actionId);
			
				if(history.actionTaken==History.ActionType.PRODUCTADD)
				{
					IStoreProduct prod= getItemWithID(history.getID());
					if(prod!=null)
					{
						boolean rem= removeItem(prod.getId());
					}

				}
				else if (history.actionTaken==History.ActionType.COLLABADD)
				{
					Collaboratores collab=getCollabWithID(history.getID());
					if(collab!=null)
					{
						removeCollab(collab.getColID());
					}
					
					
				}
				else if ((history.actionTaken==History.ActionType.OFFERADD))
				{
					
					StoreOffer offer=getOffer(history.getStoreID());
					if(offer!=null)
					{
						removeOffer(offer.getStoreID());
					}
					
				}
				else
				{
					}
		
	}
					
			


	public ArrayList<History> getHistory()
	{
		return history;
	}
}