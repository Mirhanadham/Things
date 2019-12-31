package Controllers;

import java.util.ArrayList;

import project.Cart;
import project.IStoreProduct;
import project.StoreOffer;

public class Cart_Controller {
	ArrayList<Cart> cartsList;
	Store_Controller storeCon;
	
	public Cart_Controller(Store_Controller storecontrol) {
		this.cartsList= new ArrayList<Cart>();
		this.storeCon=storecontrol;
	}
	public void addCart(int cartId)
	{
		for (Cart cart:cartsList)
		{
			if(cart.getCartID()==cartId)
			{
				return;
			}
		}
		Cart basket= new Cart(cartId);
		cartsList.add(basket);
		System.out.println("Cart num:" +basket.getCartID());
	}
	
	public boolean addToCart(int cartId,int pid, int quantity)
	{
		
		boolean quantitySuitable=checkQuantity(pid, quantity);
		boolean added=false;
		IStoreProduct prod=storeCon.getStoreProdWithID(pid);
		
		if(quantitySuitable == true && prod!= null)
		{
			//cartsList.get(cartId).addItemToCart(pid, quantity,prod.getPrice());
			for(Cart cart:cartsList)
			{
				if(cart.getCartID()==cartId)
				{
					StoreOffer offer=storeCon.getStoreOffer(prod.getStoreId());
					double price=prod.getPrice();
					if(offer!=null)
					{
						double disc=offer.getOfferPercentage();
						double discPrice=prod.getPrice()*disc;
						price=prod.getPrice()-discPrice;
					}
					cart.addItemToCart(pid, quantity, price);
				}
			}
			int quant= storeCon.getStoreProdWithID(pid).getQuantity();
			int newquant=quant-quantity;
			storeCon.updateQuantity(pid, newquant);
			storeCon.updateBoughtProducts(prod.getStoreId(), quantity);
			storeCon.checkSoldOut(pid);
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
		if(prod!=null &&(prod.getQuantity()>= quantity))
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	public void deleteCart(Cart cart)
	{
		cart.deleteCart();
	}
	

}
