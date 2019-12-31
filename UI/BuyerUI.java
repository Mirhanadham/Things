package UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Controllers.Cart_Controller;
import Controllers.Store_Controller;
import project.Cart;
import project.PersonalInfo;

public class BuyerUI extends JFrame {
	PersonalInfo user;
	Store_Controller storeCon;
	Cart_Controller cartCon;
	
	JButton addToCart;
	JButton viewCart;
	JButton checkoutOrder;
	JButton surfProducts;
	JPanel pane;
	
	public BuyerUI(PersonalInfo buyer, Store_Controller  storecontrol, Cart_Controller cartcontrol)
	{
		this.user=buyer;
		this.storeCon=storecontrol;
		this.cartCon=cartcontrol;
		//cartCon.addCart(user.getId());
		this.setSize(1000,500);
		this.setTitle("Buyer");
		this.setVisible(true);
		
		addToCart= new JButton("Add Item To Your Cart");
		addToCart.setBounds(50,30,30,20);
		viewCart= new JButton("View Item In Your Cart");
		viewCart.setBounds(50,30,30,20);
		checkoutOrder= new JButton("Check Out");
		checkoutOrder.setBounds(50,30,30,20);
		surfProducts=new JButton("View Items");
		surfProducts.setBounds(50,30,30,20);
		
		pane= new JPanel(new GridBagLayout());
		GridBagConstraints constrains= new GridBagConstraints();
		constrains.anchor=GridBagConstraints.WEST;
		constrains.insets= new Insets(10,10,10,10);
		constrains.gridx=0;
		constrains.gridy=0;
		pane.add(surfProducts,constrains);
		constrains.gridy=1;
		pane.add(addToCart,constrains);
		constrains.gridy=2;
		pane.add(viewCart,constrains);
		constrains.gridy=3;
		pane.add(checkoutOrder,constrains);
		
		
		
		this.add(pane);
		viewProducts();
		additemToCart();
		viewCart();
		checkout();
		
	
		
	}
	
	public void viewProducts()
	{
		surfProducts.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				storeCon.viewStoreProducts();
				
			}
		});
	}
	public void additemToCart()
	{
		addToCart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				storeCon.viewStoreProducts();
				new AddProductToCartUI(cartCon,user);
				
			}
		});
	}
	
	public void viewCart()
	{
		viewCart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Cart cart=cartCon.getCartByID(user.getId());
					new DisplayCartItems(cart);
				

				
			}
		});
	}
	
	public void checkout()
	{
		checkoutOrder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Cart cart=cartCon.getCartByID(user.getId());
				new CheckOutUI(cart, user);
				cartCon.deleteCart(cart);
			}
		});
	}

}
