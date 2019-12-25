package project;

public class Brand_Controller {
	BrandFunctions brandFunc;
	
	public Brand_Controller(BrandFunctions funcs)
	{
		this.brandFunc=funcs;
	}
	
	public void addBrand(String name, String founder, String category)
	{
		Brand brand = new Brand (name, category, founder);
		brandFunc.addBrand(brand);
		
	}

}
