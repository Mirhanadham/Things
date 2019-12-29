package project;

public class Order {
	
	int orderId;
	int buyerId;
	int  productsIds[];
	
	Order(int oId,int bId,int products[]){
		this.orderId=oId;
		this.buyerId=bId;
		this.productsIds=products;
		
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public int[] getProductsIds() {
		return productsIds;
	}

	public void setProductsIds(int[] productsIds) {
		this.productsIds = productsIds;
	}
	

}
