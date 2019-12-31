package project;

import java.util.HashMap;
import java.util.Map;

import UI.DisplayStat;
import UI.DisplayStoreStat;

public class Statistics {

	int views;
	Map<Integer ,Integer > soldoutProducts;
	Map<Integer ,Integer > boughtProducts;
	public Statistics()
	{
		this.views=0;
		soldoutProducts=new HashMap();
		boughtProducts=new HashMap();
	}
	
	public Map<Integer ,Integer > getSoldoutProducts() {
		return soldoutProducts;
	}
	public Map<Integer ,Integer > getBoughtProducts() {
		return boughtProducts;
	}
	// di hyt3mlha calll gwa function aly btlist alproducts ll user//done
	public void updateViews(){
		views+=1;
		
	}
	

	public int getViews()
	{
		return views;
	}
	//di hyt3mlha call lma product yb2a sold out
	public void updateSoldoutProducts(int productID){
		
			Integer value = soldoutProducts.get(productID);
			if(value==null)
			{
				soldoutProducts.put(productID, 1);
			}
			
		
		
	}
	
	//di han3mlha call lma 7ad yshtry product mn store 
	public void updateBoughtProducts(int storeID,int quantity){
	
			Integer value = boughtProducts.get(storeID);
			if(value==null)
			{
				boughtProducts.put(storeID, quantity);
			}
			else
			{
				value=value+quantity;
				boughtProducts.put(storeID,value);
			}

		
	}
	
	public void print(int ID) {
			
		
		System.out.println("Number of views = " + views);
		
	
		
		
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