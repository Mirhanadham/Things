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
		display.append("product with ID="+id+"  Number of views = " + view);
		if(sold!=null)
			display.append("product with ID="+id+"  is sold Out");
		else
			display.append("product with ID="+id+"  is not sold Out");
		display.append("product with ID="+id+"  Number of people who bought it are  " + buy);
		this.setSize(1000,500);
		this.setTitle("Store statistics");
		this.add(display);
		this.setVisible(true);
	
	}

}