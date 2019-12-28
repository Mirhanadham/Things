package Controllers;


public class Buyer_Controller {
	Store_Controller storeCon;
	
	public Buyer_Controller(Store_Controller storecontrol)
	{
		this.storeCon=storecontrol;
	}
	
	public void viewProducts()
	{
		storeCon.viewStoreProducts();
	}
	

}
