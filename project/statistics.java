package project;

import java.util.HashMap;
import java.util.Map;

import UI.DisplayStat;
import UI.DisplayStoreStat;

public class Statistics {

	Map<Integer ,Integer > view;
	Map<Integer ,Integer > soldoutProducts;
	Map<Integer ,Integer > boughtProducts;
	public Statistics()
	{
		view=new HashMap();
		soldoutProducts=new HashMap();
		boughtProducts=new HashMap();
	}
	public Map<Integer ,Integer > getViews() {
		return view;
	}
	public Map<Integer ,Integer > getSoldoutProducts() {
		return soldoutProducts;
	}
	public Map<Integer ,Integer > getBoughtProducts() {
		return boughtProducts;
	}
	// di hyt3mlha calll gwa function aly btlist alproducts ll user//done
	public void updateViews(int productID){
			Integer value = view.get(productID);
			value=value+1;
			view.put(productID, value);
		
	}
	

	//di hyt3mlha call lma product yb2a sold out
	public void updateSoldoutProducts(int productID){
		
			Integer value = soldoutProducts.get(productID);
			value=value+1;
			soldoutProducts.put(productID, value);
		
		
	}
	
	//di han3mlha call lma 7ad yshtry product mn store 
	public void updateBoughtProducts(int productID){
	
			Integer value = boughtProducts.get(productID);
			value=value+1;
			boughtProducts.put(productID, value);
		
	}
	
	public void print(int ID) {
			
		Integer views = view.get(ID); 
		System.out.println("product with ID="+ID+"  Number of views = " + views);
		
	
		
		
		Integer sold = soldoutProducts.get(ID); 
		if(sold!=null)
			System.out.println("product with ID="+ID+"  is sold Out");
		else
			System.out.println("product with ID="+ID+"  is not sold Out");
		
		Integer buy = boughtProducts.get(ID); 
		System.out.println("product with ID="+ID+"  Number of people who bought are   " + buy);
		DisplayStoreStat dis=new DisplayStoreStat(ID ,views,sold,buy); 
	}
	
}

