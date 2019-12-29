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
import javax.swing.JTextArea;
import javax.swing.JTextField;

import project.Cart;
import project.Order;
import project.PersonalInfo;

public class CheckOutUI extends JFrame {
	Cart cart;
	PersonalInfo user;
	
	JLabel address;
	JTextField addressField;
	JLabel totalPricelabel;
	JTextArea totalPrice;
	JButton checkout;
	
	public CheckOutUI(Cart cart, PersonalInfo info)
	{
		this.cart=cart;
		this.user=info;
		
		address= new JLabel("Address: ");
		addressField= new JTextField(30);
		totalPrice= new JTextArea();
		totalPrice.setBounds(50,30,30,20);
		totalPricelabel= new JLabel("Total Price: ");
		checkout= new JButton("Checkout");
		checkout.setBounds(50,30,30,20);
		
		JPanel pane = new JPanel(new GridBagLayout());
		GridBagConstraints constrains= new GridBagConstraints();
		constrains.anchor= GridBagConstraints.WEST;
		constrains.insets= new Insets(10,10,10,10);
		constrains.gridx=0;
		constrains.gridy=0;
		pane.add(address,constrains);
		constrains.gridx=1;
		pane.add(addressField,constrains);
		constrains.gridx=0;
		constrains.gridy=1;
		pane.add(totalPricelabel,constrains);
		constrains.gridx=1;
		pane.add(totalPrice,constrains);
		constrains.gridx=0;
		constrains.gridy=2;
		pane.add(checkout,constrains);
		
		this.add(pane);
		this.setSize(1000,500);
		this.setTitle("Checkout");
		this.setVisible(true);
		
	}
	
	public void checkout()
	{
		checkout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String address= addressField.getText();
				Order order= new Order(address,cart,user);
				totalPrice.append(Double.toString(order.getTotalPrice()));
				JFrame orderDetails= new JFrame("Order Details");
				orderDetails.setSize(1000,500);
				JTextArea details= new JTextArea();
				details.append("ID:  "+order.getOrderId()+"\n"+"Total Price:   "+order.getTotalPrice()+"\n");
				details.append("Address:   "+order.getAddress()+"\n"+"Date:   "+order.getDate()+"\n");
				
			}
		});
	}
}
