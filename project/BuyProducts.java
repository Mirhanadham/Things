package project;

import java.util.ArrayList;

public class BuyProducts {
	
	ArrayList<Order> orders;
	int orderId=0;// figure tary2a a7san ank t3mly unique ids ll orders 
	int count=0;// 3shan size allist bta3t alproducts aly f every single order(cart)
	int listOfProductsInOrder[]; 
	
	//hyt3mlha call lma ndos 3ala button add product to cart 
	public void cart(int productId)
	{
		listOfProductsInOrder[count]=productId;// list of products aly fl orded
	}
	public void viewCart()
	{
		for(int i=0;i<listOfProductsInOrder.length;i++)
			System.out.println(listOfProductsInOrder[i]);
	}
	//almfrod hna n add ll list orders w nro7 ll checkout w n callculate altotal
	public void buy(int userId)
	{
		
	}
}
