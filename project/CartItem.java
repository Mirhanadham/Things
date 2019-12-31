package project;

public class CartItem {
	private int itemID;
	private int quantity;
	private double price;
	
	public CartItem (int id, int quant, double price)
	{
		this.itemID=id;
		this.quantity=quant;
		this.price=price;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
