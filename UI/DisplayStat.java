package UI;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import project.ProductInventory;
import project.ProductSpec;
import project.Statistics;

public class DisplayStat extends JFrame{

int value;
int which;

	public DisplayStat(int value,int calc)
	{
		this.value=value;
		this.which=calc;
		
		JTextArea display= new JTextArea();
		
		
	
		if (which==1)
		display.append("Maximum  = "+value);
		else if (which==2)
			display.append("Minimum  =" +value);
		else 
			display.append("Average = "+value);
				
		
		
		this.setSize(1000,500);
		this.setTitle("New statistics");
		this.add(display);
		this.setVisible(true);
		
	}
}
