package Controllers;

import java.util.ArrayList;

import project.Cart;
import project.IStoreProduct;

public class Cart_Controller {
	ArrayList<Cart> cartsList;
	Store_Controller storeCon;
	
	public Cart_Controller(Store_Controller storecontrol) {
		this.cartsList= new ArrayList<Cart>();
		this.storeCon=storecontrol;
	}
	public void addCart(int cartId)
	{
		Cart cart= new Cart(cartId);
		cartsList.add(cart);
		System.out.println(cart.getCartID());
	}
	
	public boolean addToCart(int cartId,int pid, int quantity)
	{
		
		boolean quantitySuitable=checkQuantity(pid, quantity);
		boolean added=false;
		IStoreProduct prod=storeCon.getStoreProdWithID(pid);
		
		if(quantitySuitable == true && prod!= null)
		{
			cartsList.get(cartId).addItemToCart(pid, quantity,prod.getPrice());
			int quant= storeCon.getStoreProdWithID(pid).getQuantity();
			int newquant=quant-quantity;
			storeCon.updateQuantity(pid, newquant);
			added=true;
		}
		
		return added;
				
	}
	public Cart getCartByID(int cartID)
	{
		for (Cart cart:cartsList)
		{
			if(cart.getCartID()==cartID)
			{
				return cart;
			}
		}
		return null;
	}
	public boolean checkQuantity(int prodID,int quantity)
	{
		IStoreProduct prod= storeCon.getStoreProdWithID(prodID);
		if(prod!=null &&(prod.getQuantity()<= quantity))
			return true;
		else 
			return false;
		
	}
	

}
