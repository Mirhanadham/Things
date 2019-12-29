package UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controllers.SO_Controller;
import project.Statistics;

public class StatisticsUI extends JFrame{
	SO_Controller soCon;
	Statistics stat;
	public StatisticsUI(SO_Controller soCon,Statistics stat) {
		// TODO Auto-generated constructor stub
		this.soCon=soCon;
		this.stat=stat;
		JLabel storeID= new JLabel("Store ID: ");
		JTextField sID= new JTextField(15);
		
		
		JButton add= new JButton("Add");
	    add.setBounds(50,30, 30, 20);
		
		JPanel leftPanel= new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
	    constraints.anchor = GridBagConstraints.WEST;
	    constraints.insets = new Insets(10, 10, 10, 10);
	    constraints.gridx = 0;
	    constraints.gridy = 0;    
	    leftPanel.add(storeID,constraints);
	    constraints.gridx=1;
	    leftPanel.add(sID,constraints);
	    constraints.gridx=0;
	    constraints.gridy=1;
	   
	    
	    leftPanel.add(add,constraints);
	    this.add(leftPanel);
	    this.setSize(1000,500);
	    this.setVisible(true);
	    
	    add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int storeID=Integer.parseInt(sID.getText());
				
				soCon.viewStat(storeID,stat);		 
				
			}
	    });
			
	}

}
