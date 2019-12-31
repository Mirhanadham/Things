package UI;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import project.IStoreProduct;
import project.StoreFunctionalities;

public class DisplayStoresItems extends JFrame{
	StoreFunctionalities storeFuncs;
	
	JTextArea productsArea;
	public DisplayStoresItems(StoreFunctionalities funcs)
	{
		this.storeFuncs=funcs;
		this.setSize(1000,500);
		this.setTitle("Products In Stores.");
		this.setVisible(true);
		
		productsArea= new JTextArea();
		productsArea.append("ID   Store Name   Product Name");
		this.add(productsArea);
		
		display();
		
		
	}
	
	public void display()
	{
		ArrayList<IStoreProduct> storeProducts=storeFuncs.itemsList();
		
		for(IStoreProduct product:storeProducts)
		{
			String storeName=storeFuncs.getStoreName(product.getStoreId());
			
			productsArea.append(product.getId()+"   "+storeName+"   "+product.getProductName());
		}
	}
	

}
