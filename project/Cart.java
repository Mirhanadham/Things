package project;

import java.util.ArrayList;

public class Cart {
	private int cartID;
	private boolean doubleSameProduct;
	ArrayList<CartItem> cartItems;
	
	public Cart(int userId)
	{
		this.cartID=userId;
		this.setDoubleSameProduct(false);
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
	
	public void addItemToCart(int id, int quantity,double price)
	{
		if(quantity>=2)
		{
			this.setDoubleSameProduct(true);
		}
		CartItem item= new CartItem(id,quantity,price);
		cartItems.add(item);
	}
	
	public ArrayList<CartItem> getCartItems()
	{
		return cartItems;
	}
	
	public CartItem getCartItem(int itemId)
	{
		for(CartItem item:cartItems)
		{
			if(item.getItemID()==itemId)
				return item;
			
		}
		return null;
	}
	
	public void deleteCart()
	{
		cartItems= new ArrayList<CartItem>();
	}

	public boolean isDoubleSameProduct() {
		return doubleSameProduct;
	}

	public void setDoubleSameProduct(boolean doubleSameProduct) {
		this.doubleSameProduct = doubleSameProduct;
	}
	

}
