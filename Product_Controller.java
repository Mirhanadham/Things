package project;

public class Product_Controller {
	ProductInventory productIn;
	Brand_Controller brandFunc;
	
	public Product_Controller(ProductInventory in, Brand_Controller brandCon) {
		this.productIn=in;
		this.brandFunc=brandCon;
	}
	public void addProduct_Handler(String name, String category, int brand, double price)
	{
		IBrand bran=brandFunc.getBrandwId(brand);
		
		Product spec= new Product(name, bran, price, category); 
		productIn.addProduct(spec);
		
	}
	public void viewBrands()
	{
		brandFunc.viewBrands();
	}
	

}
