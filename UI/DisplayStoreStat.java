package UI;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class DisplayStoreStat extends JFrame {

	int id;
	Integer view;
	Integer sold;
	Integer buy;
	public DisplayStoreStat(int id, Integer view, Integer sold, Integer buy) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.buy=buy;
		this.sold=sold;
		this.view=view;
		JTextArea display= new JTextArea();
		display.append("product with ID="+id+"  Number of views = " + view+"\n");
		if(sold!=null)
			display.append("product with ID="+id+"  is sold Out"+"\n");
		else
			display.append("product with ID="+id+"  is not sold Out"+"\n");
		display.append("product with ID="+id+"  Number of people who bought it are  " + buy+"\n");
		this.setSize(1000,500);
		this.setTitle("Store statistics");
		this.add(display);
		this.setVisible(true);
	
	}

}