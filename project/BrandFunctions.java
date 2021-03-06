package project;

import java.util.ArrayList;

public class BrandFunctions {
	ArrayList<IBrand> brands;
	public BrandFunctions() {
		brands = new ArrayList<IBrand>();
		Brand brand1= new Brand("Gucci","clothes","Gucci");
		addBrand(brand1);
		Brand brand2= new Brand("Chanel","clothes","Coco Chanel");
		addBrand(brand2);
		Brand brand3= new Brand("H&M","clothes","H&M");
		addBrand(brand3);
		
	}
	
	public void addBrand(IBrand brand)
	{
		brand.setId(brands.size());
		brands.add(brand);
		System.out.println(brand.getId()+" "+brand.getName()+" "+brand.getCategory());
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
	
	public IBrand getBrandwihId(int id)
	{
		for(int i=0;i<brands.size();i++)
		{
			if(brands.get(i).getId()==id)
				return brands.get(i);
				
		}
		return null;
	}
	
	public ArrayList<IBrand> getBrandList()
	{
		return brands;
	}

}
