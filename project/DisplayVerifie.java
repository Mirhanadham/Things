package project;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class DisplayVerifie extends JFrame{

	StoreFunctionalities storeFun;
	
 public DisplayVerifie( StoreFunctionalities storeFun)
	{
		this.storeFun= storeFun;
		
		JTextArea display = new JTextArea();
		ArrayList<StoreSpec> stores= storeFun.getstoreQueingList();
		
		for(int i=0;i<stores.size();i++)
		{
			display.append("store "+stores.get(i)+" is waiting to be verified"+"\n");
		}
		this.add(display);
		this.setSize(1000,500);
		this.setVisible(true); 
	}

}