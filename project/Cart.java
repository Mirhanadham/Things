package project;

import java.util.ArrayList;

public class Cart {
	int cartID;
	ArrayList<CartItem> cartItems;
	
	public Cart(int userId)
	{
		this.cartID=userId;
		cartItems= new ArrayList<CartItem>();
	}
	
	public void setcartID(int id)
	{
		this.cartID=id;
	}
	
	public int getCartID()
	{
		return this.cartID;
	}
	
	public void addItemToCart(int id, int quantity)
	{
		CartItem item= new CartItem(id,quantity);
		cartItems.add(item);
	}
	
	public ArrayList<CartItem> getCartItems()
	{
		return cartItems;
	}
	
	public void deleteCart()
	{
		cartItems= new ArrayList<CartItem>();
	}
	

}
