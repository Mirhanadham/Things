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
	JButton SoldOut;
	JButton boughtProducts;
	public AddStatUi(Admin_Controller adminControl) {

		this.adminCon=adminControl;
		
		SoldOut= new JButton("SoldOut Products");
		SoldOut.setBounds(50,30, 30, 20);
	
		
		boughtProducts= new JButton("Number of bought products");
		boughtProducts.setBounds(50,30, 30, 20);

	
		
		
		JPanel leftPanel= new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
	    constraints.anchor = GridBagConstraints.WEST;
	    constraints.insets = new Insets(10, 10, 10, 10);
	    constraints.gridx = 0;
	    constraints.gridy = 0;    
	   
	   
	    this.add(leftPanel);
	    this.setSize(1000,500);
	    this.setVisible(true);
	    constraints.gridy = 1;
	    leftPanel.add(SoldOut,constraints);
	   
	    constraints.gridy = 2;
	    leftPanel.add(boughtProducts,constraints);
	   
	
	soldout();
	boughtproducts();
	} 
	
	 public void soldout() {   
	    SoldOut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				int map=2;
				
				AddStatCalcuUI addUi= new AddStatCalcuUI (adminCon,map);
				
			}
		});
	 }
	
	 public void boughtproducts() {
	 boughtProducts.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int map=3;
				AddStatCalcuUI addUi= new AddStatCalcuUI (adminCon,3);

			}
		});
	    
	
	}

}