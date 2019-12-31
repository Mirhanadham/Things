package UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controllers.Cart_Controller;
import project.PersonalInfo;

public class AddProductToCartUI extends JFrame {
	Cart_Controller cartCon;
	PersonalInfo user;
	
	JLabel prodIDlabel;
	JLabel quantLabel;
	
	JTextField prodIDField;
	JTextField quantField;
	
	JButton add;
	
	
	public AddProductToCartUI(Cart_Controller cartcontrol,PersonalInfo info) {
		this.cartCon=cartcontrol;
		this.user=info;
		cartCon.addCart(user.getId());
		
		prodIDlabel= new JLabel("Enter Store Product ID: ");
		quantLabel= new JLabel("Enter Quantity: ");
		
		prodIDField= new JTextField(15);
		quantField= new JTextField(15);
		
		add= new JButton("ADD");
		add.setBounds(50,30,30,20);
		
		JPanel pane= new JPanel(new GridBagLayout());
		GridBagConstraints constrains= new GridBagConstraints();
		constrains.anchor= GridBagConstraints.WEST;
		constrains.insets= new Insets(10,10,10,10);
		constrains.gridx=0;
		constrains.gridy=0;
		pane.add(prodIDlabel,constrains);
		constrains.gridx=1;
		pane.add(prodIDField,constrains);
		constrains.gridx=0;
		constrains.gridy=1;
		pane.add(quantLabel,constrains);
		constrains.gridx=1;
		pane.add(quantField,constrains);
		constrains.gridx=0;
		constrains.gridy=2;
		pane.add(add,constrains);
		
		this.add(pane);
		this.setSize(1000,500);
		this.setTitle("Add Item To Cart");
		this.setVisible(true);
		
		add();
		
	}
	
	public void add()
	{
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			int pid= Integer.parseInt(prodIDField.getText());
			int quantity= Integer.parseInt(quantField.getText());
			boolean added= cartCon.addToCart(user.getId(), pid, quantity);
			if (added== true)
			{
				JOptionPane.showMessageDialog(null, "Your Item has been successfully added to your cart.","CarttMsg",JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Either the Quantity or the Product you have entered is wrong.","CartMsg",JOptionPane.INFORMATION_MESSAGE);
			}
			
				
			}
		});
	}

}
