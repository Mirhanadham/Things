package project;

import java.util.ArrayList;

public class BrandFunctions {
	ArrayList<IBrand> brands;
	public BrandFunctions() {
		brands = new ArrayList<IBrand>();
		Brand brand1= new Brand("Tshirt","clothes","david");
		addBrand(brand1);
		Brand brand2= new Brand("pants","clothes","hanem");
		addBrand(brand1);
		Brand brand3= new Brand("pants","clothes","dave");
		addBrand(brand1);
		
	}
	
	public void addBrand(IBrand brand)
	{
		brand.setId(brands.size());
		brands.add(brand);
	}
	
	public IBrand searchBName(String name)
	{
		for (IBrand brand:brands)
		{
			if(brand.getName()==name);
			return brand;
		}
		return null;
	}
	
	public boolean availableBrand(String name)
	{
		
		IBrand brand = searchBName(name);
		if (brand!= null)
			return true;
		return false;
		
		
	}

}
