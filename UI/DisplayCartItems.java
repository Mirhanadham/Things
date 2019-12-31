package UI;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import Controllers.Cart_Controller;
import project.Cart;
import project.CartItem;

import java.util.ArrayList;

public class DisplayCartItems extends JFrame {
	Cart cart;
	double price=0;
	JTextArea display;
	public DisplayCartItems(Cart cartobj) {
		this.cart=cartobj;
		
		this.setTitle("Cart Items");
		this.setSize(1000,500);
		this.setVisible(true);
		
		ArrayList<CartItem> cartitems= cart.getCartItems();
		display= new JTextArea();
		display.append("ID   Quantity   Price"+"\n");
		
		for(CartItem item:cartitems)
		{
			display.append(item.getItemID()+"   "+item.getQuantity()+"   "+item.getPrice()+"\n");
			price+=(item.getPrice()*item.getQuantity());
		}
		
		this.add(display);
		
	}
	
	
}
