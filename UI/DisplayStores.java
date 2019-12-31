package UI;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import project.Collaboratores;
import project.PersonalInfo;
import project.StoreFunctionalities;
import project.StoreSpec;

public class DisplayStores extends JFrame {

	StoreFunctionalities storeFuncs;
	int userID;
	boolean collaborater;
	
	JTextArea display;
	public DisplayStores(StoreFunctionalities storeFunc,int userid,boolean collab) {
		this.storeFuncs=storeFunc;
		this.userID=userid;
		this.collaborater=collab;
		
		this.setTitle("Stores");
		this.setSize(1000,500);
		this.setVisible(true);
		display=new JTextArea();
		display();
		
		
		
	}
	public void display()
	{
		ArrayList<StoreSpec> stores=storeFuncs.getstoreList();
		display.append("My Stores"+"\n"+"ID   StoreName"+"\n");
		for(StoreSpec store:stores)
		{
			if(store.getStoreOwnerID()==userID)
			{
				display.append(store.getId()+"   "+store.getName()+"\n");
			}
		}
		if(collaborater==true)
		{
			ArrayList<Collaboratores> collabs=storeFuncs.getCollaborators();
			display.append("Collaborater Stores"+"\n"+"ID   StoreName"+"\n");
			for(Collaboratores collab:collabs)
			{
				for(StoreSpec store:stores)
				{
					if(collab.getColID()==userID)
					{
						if(collab.getStoreID()==store.getId())
						{
							display.append(store.getId()+"   "+store.getName()+"\n");
						}
					}
				}
			}
		}
		this.add(display);
		
		
	}
}
