package project;

public class Product_Controller {
	ProductInventory productIn;
	BrandFunctions brandFunc;
	
	public Product_Controller(ProductInventory in) {
		this.productIn=in;
	}
	public void addProduct_Handler(String name, String category, String brand, double price)
	{
		IBrand bran= brandFunc.searchBName(name);
		Product spec= new Product(name, bran, price, category); 
		productIn.addProduct(spec);
	}
	public boolean findBrand(String name)
	{
		boolean found=false;
		found=brandFunc.availableBrand(name);
		return found;
	}

}
