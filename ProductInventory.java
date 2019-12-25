package project;

import java.util.ArrayList;

public class ProductInventory{
	ArrayList<ProductSpec> products;
	
	public ProductInventory()
	{
		products = new ArrayList<ProductSpec>();
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

}
