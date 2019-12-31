package Controllers;

import java.util.ArrayList;


import UI.DisplayVerifie;
import project.StoreFunctionalities;
import project.StoreSpec;

public class Verified_Controller {

	StoreFunctionalities storeFun ;
	
	
	public Verified_Controller(StoreFunctionalities storeFun) {
		// TODO Auto-generated constructor stub
		this.storeFun=storeFun;
	}

	public void listOfStoresWaiting()
	{
		new DisplayVerifie(storeFun);
	}

	public void verifie(int storeId,int storeOwnerId)
	{
		
		storeFun.verifie(storeId, storeOwnerId);
		
	}

	public void notVerifie(int storeId,int storeOwnerId)
	{
		storeFun.notVerifie(storeId, storeOwnerId);
		
	}
	
}
