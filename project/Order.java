package project;

import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;

public class Order {

	PersonalInfo user;
	int orderId;
	Date date;
	String address;
	Cart cart;
	double totalPrice;
	Offers offers;
	
	public Order(String address,Cart cart,PersonalInfo info) {
		this.date=Calendar.getInstance().getTime();
		this.address=address;
		this.cart=cart;
		this.user=info;
		this.orderId=user.getId();
		this.totalPrice=0;
		this.offers= new Offers();
	}

	public void calculateTotalPrice(double total)
	{
		
//		ArrayList<CartItem> items= cart.getCartItems();
//		for(CartItem item: items)
//		{
//			total=total+(item.getPrice()*item.getQuantity());
//		}
		if(user.getType().equals(UserType.STOREOWNER))
		{
			double storeOwnerDisc= total*offers.getStoreOwnerDiscount();
			total-=storeOwnerDisc;
		}
		if(user.getFirtsOrder()==true)
		{
			user.setFirstOrder(false);
			double firstOrderDisc=total*offers.getFirstOrderDiscount();
			total-=firstOrderDisc;
		}
		if(cart.isDoubleSameProduct()==true)
		{
			double cartDisc= total*offers.getDoubleSameProductDisc();
			total-=cartDisc;
		}
		
		this.setTotalPrice(total);
	}
	public PersonalInfo getUser() {
		return user;
	}

	public void setUser(PersonalInfo user) {
		this.user = user;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	
	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}