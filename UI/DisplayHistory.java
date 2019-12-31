package UI;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import project.History;
import project.StoreFunctionalities;

public class DisplayHistory extends JFrame {

	StoreFunctionalities storefun;
	int storeid;
	public DisplayHistory(int storeID,StoreFunctionalities storefun)
	{
		JTextArea display= new JTextArea();
		ArrayList<History> his=storefun.getHistory();
		this.storeid=storeID;
		for(History history:his )
		{
			if(history.getStoreID()==storeid)
				display.append("Action ID:"+history.getActionID()+"Store ID:" +storeid+"Product with ID:"+history.getID()+"Action taken:"+history.getActionTaken()+"\n");
		}
		this.setSize(1000,500);
		this.setTitle("History of store");
		this.add(display);
		this.setVisible(true);
	}
	
}