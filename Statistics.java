package project;

import java.util.HashMap;
import java.util.Map;

public class statistics {

	Map<Integer ,Integer > view=new HashMap();
	Map<Integer ,Integer > soldoutProducts=new HashMap();
	Map<Integer ,Integer > boughtProducts=new HashMap();
	
	// di hyt3mlha calll gwa function aly btlist alproducts ll user
	public void updateViews(int sID){
			Integer value = view.get(sID);
			value=value+1;
			view.put(sID, value);
		
	}
	

	//di hyt3mlha call lma product yb2a sold out
	public void updateSoldoutProducts(int ID){
		
			Integer value = soldoutProducts.get(ID);
			value=value+1;
			soldoutProducts.put(ID, value);
		
		
	}
	
	//di han3mlha call lma 7ad yshtry product mn store 
	public void updateBoughtProducts(int ID){
	
			Integer value = boughtProducts.get(ID);
			value=value+1;
			boughtProducts.put(ID, value);
		
	}
	
	public void print(int ID) {
			
		Integer value = view.get(ID); 
		System.out.println("product with ID="+ID+"  Number of views = " + value);
		
		
		
		Integer sold = soldoutProducts.get(ID); 
		if(sold!=null)
			System.out.println("product with ID="+ID+"  is sold Out");
		else
			System.out.println("product with ID="+ID+"  is not sold Out");
		
		Integer buy = view.get(ID); 
		System.out.println("product with ID="+ID+"  Number of people who bought are   " + buy);
		
	}
	
}
