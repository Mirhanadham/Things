package Controllers;

import java.util.ArrayList;

import project.DisplayVerifie;
import project.StoreFunctionalities;
import project.StoreSpec;

public class Verified_Controller {

	StoreFunctionalities storeFun ;
	DisplayVerifie display;	
	
	public Verified_Controller(StoreFunctionalities storeFun) {
		// TODO Auto-generated constructor stub
		this.storeFun=storeFun;
	}

	public void listOfStoresWaiting()
	{
		display=new DisplayVerifie(  storeFun);
	}

	public void verifie(String storeId,String storeOwnerId)
	{
		
		storeFun.verifie(storeId, storeOwnerId);
		
	}

	public void notVerifie(String storeId,String storeOwnerId)
	{
		storeFun.notVerifie(storeId, storeOwnerId);
		
	}
	
}
