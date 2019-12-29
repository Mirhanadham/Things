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

import Controllers.Admin_Controller;
import Controllers.SO_Controller;

public class AddItemUI extends JFrame {
	SO_Controller control;
	int soID;
	public AddItemUI(SO_Controller control,int soID)
	{
		this.control=control;
		this.soID=soID;
		JLabel pID= new JLabel("Product ID: ");
		JTextField PID= new JTextField(15);
		JLabel name= new JLabel("Product name: ");
		JTextField Pname= new JTextField(15);
		JLabel storeID= new JLabel("Store ID: ");
		JTextField sID= new JTextField(15);
		JLabel quan = new JLabel("Quantity: ");
		JTextField quantity = new JTextField(15);
		JLabel bid = new JLabel("Brand ID: ");
		JTextField bID = new JTextField(15);
		JLabel price = new JLabel("Brand ID: ");
		JTextField Price = new JTextField(15);
		
		JButton add= new JButton("Add");
	    add.setBounds(50,30, 30, 20);
		
		JPanel leftPanel= new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
	    constraints.anchor = GridBagConstraints.WEST;
	    constraints.insets = new Insets(10, 10, 10, 10);
	    constraints.gridx = 0;
	    constraints.gridy = 0;    
	    leftPanel.add(pID,constraints);
	    constraints.gridx=1;
	    leftPanel.add(PID,constraints);
	    constraints.gridx=0;
	    constraints.gridy=1;
	    leftPanel.add(quan,constraints);
	    constraints.gridx=1;
	    leftPanel.add(quantity,constraints);
	    constraints.gridx=0;
	    constraints.gridy=2;
	    leftPanel.add(bid,constraints);
	    constraints.gridx=1;
	    leftPanel.add(bID,constraints);
	    constraints.gridx=0;
	    constraints.gridy=3;
	    leftPanel.add(price,constraints);
	    constraints.gridx=1;
	    leftPanel.add(Price,constraints);
	    constraints.gridx=0;
	    leftPanel.add(name,constraints);
	    constraints.gridx=1;
	    leftPanel.add(Pname,constraints);
	    constraints.gridx=0;
	    leftPanel.add(storeID,constraints);
	    constraints.gridx=1;
	    leftPanel.add(sID,constraints);
	    constraints.gridx=0;
	    
	    leftPanel.add(add,constraints);
	    this.add(leftPanel);
	    this.setSize(1000,500);
	    this.setVisible(true);
	    
	    add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int ID=Integer.parseInt(PID.getText());
				int quan= Integer.parseInt(quantity.getText());
				int bid=Integer.parseInt(bID.getText());
				double price=Integer.parseInt(Price.getText());
				int storeID=Integer.parseInt(sID.getText());
				String product=Pname.getText();
				control.addItemToStore(storeID, bid, ID, price, quan, soID, product);			 
				
			}
		});
	    
	    
		
	}
}
