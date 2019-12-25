package project;

public class Product_Controller {
	ProductInventory productIn;
	Brand_Controller brandFunc;
	
	public Product_Controller(ProductInventory in, Brand_Controller brandCon) {
		this.productIn=in;
		this.brandFunc=brandCon;
	}
	public void addProduct_Handler(String name, String category, double price)
	{
		
		
		Product spec= new Product(name, price, category); 
		productIn.addProduct(spec);
		
	}
	
	

}
