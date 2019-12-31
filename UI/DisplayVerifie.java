package UI;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import project.StoreFunctionalities;
import project.StoreSpec;

public class DisplayVerifie extends JFrame{

	StoreFunctionalities storeFun;
	
 public DisplayVerifie( StoreFunctionalities storeFun)
	{
		this.storeFun= storeFun;
		
		JTextArea display = new JTextArea();
		ArrayList<StoreSpec> stores= storeFun.getstoreQueingList();
		
		display.append("ID   Owner Name"+"\n");
		
		
		for(StoreSpec store:stores)
		{
			display.append(store.getId()+"   "+store.getStoreOwnerID());
		}
		this.add(display);
		this.setTitle("Stores Waiting To Be Verified");
		this.setSize(1000,500);
		this.setVisible(true); 
	}

}