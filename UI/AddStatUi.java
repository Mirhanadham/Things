package UI;
import java.awt.BorderLayout;
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

import Controllers.Admin_Controller;



public class AddStatUi extends JFrame {

	Admin_Controller adminCon;
	public AddStatUi(Admin_Controller adminControl) {

		
		this.adminCon=adminCon;
		
		
		
		
		JButton Views= new JButton("Views");
		Views.setBounds(50,30, 30, 20);
		
		JButton SoldOut= new JButton("SoldOut Products");
		SoldOut.setBounds(50,30, 30, 20);
	
		
		JButton boughtProducts= new JButton("Number of bought products");
		boughtProducts.setBounds(50,30, 30, 20);

	
		
		
		JPanel leftPanel= new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
	    constraints.anchor = GridBagConstraints.WEST;
	    constraints.insets = new Insets(10, 10, 10, 10);
	    constraints.gridx = 0;
	    constraints.gridy = 0;    
	   
	    leftPanel.add(Views,constraints);
	    this.add(leftPanel);
	    this.setSize(1000,500);
	    this.setVisible(true);
	    this.add(Views,BorderLayout.WEST);
	    leftPanel.add(SoldOut,constraints);
	    this.add(leftPanel);
	    this.setSize(1000,500);
	    this.setVisible(true);
	    this.add(SoldOut,BorderLayout.CENTER);
	    leftPanel.add(boughtProducts,constraints);
	    this.add(leftPanel);
	    this.setSize(1000,500);
	    this.setVisible(true);
	    this.add(SoldOut,BorderLayout.EAST);
	    Views.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				int map=1;
				AddStatCalcuUI addUi= new AddStatCalcuUI (adminControl,map);
				
			}
		});
	    
	    SoldOut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				int map=2;
				AddStatCalcuUI addUi= new AddStatCalcuUI (adminControl,map);
				
			}
		});
	    
	    boughtProducts.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int map=3;
				AddStatCalcuUI addUi= new AddStatCalcuUI (adminControl,map);

			}
		});
	    
	
	}

}

