package project;

public class CartItem {
	private int itemID;
	private int quantity;
	
	public CartItem (int id, int quant)
	{
		this.setItemID(id);
		this.setQuantity(quant);
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

}
