package project;

public class Admin_Controller {
	Product_Controller podCon;
	Brand_Controller barndCon;
	
	public Admin_Controller(Product_Controller podController, Brand_Controller brandController)
	{
		this.barndCon=brandController;
		this.podCon=podController;
	}

}
