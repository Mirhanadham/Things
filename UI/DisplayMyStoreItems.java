package UI;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import project.StoreFunctionalities;
import project.IStoreProduct;

public class DisplayMyStoreItems extends JFrame{
	int storeID;
	StoreFunctionalities storeFuncs;
	JTextArea display;
	public DisplayMyStoreItems(int sid, StoreFunctionalities funcs) {
		this.storeFuncs=funcs;
		this.storeID=sid;
		this.setTitle("Display Products In My Store");
		this.setSize(1000,500);
		display= new JTextArea();
		display.append("ID   Product Name   Price"+"\n");
		ArrayList<IStoreProduct> products= storeFuncs.itemsList();
		for(IStoreProduct product:products)
		{
			if(product.getStoreId()==storeID)
			{
				display.append(product.getId()+"   "+product.getProductName()+"   "+product.getPrice()+"\n");
			}
		}
		this.add(display);
		this.setVisible(true);
	}

}
