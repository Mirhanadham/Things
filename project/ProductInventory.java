package project;

import java.util.ArrayList;

public class ProductInventory{
	ArrayList<ProductSpec> products;
	
	public ProductInventory()
	{
		products = new ArrayList<ProductSpec>();
		Product spec1= new Product("Tshirt", 20, "Clothes");
		addProduct(spec1);
		Product spec2= new Product("Pants", 20, "Clothes");
		addProduct(spec2);
		Product spec3= new Product("Jackets", 20, "Clothes");
		addProduct(spec3);
	}
	public void addProduct(ProductSpec spec)
	{
		spec.setId(products.size());
		products.add(spec);
		System.out.println(spec.getName()+" "+spec.getId());
	}
	
	public ProductSpec searchPID(int id)
	{
		for(ProductSpec spec:products)
		{
			if(spec.getId()==id)
				return spec;
		}
		return null;
	}
	public String getProductName(int id)
	{
		ProductSpec prod= products.get(id);
		return prod.getName();
	}
	
	public ArrayList<ProductSpec> productList()
	{
		return products;
	}

}
