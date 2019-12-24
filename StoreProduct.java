package project;

public class StoreProduct implements IStoreProduct {
	
	private int id;
	private int storeId;
	private int productId;
	private int quantity;
	
	public StoreProduct(int id, int pid, int sid, int quant)
	{
		this.id=id;
		this.productId=pid;
		this.quantity=quant;
		this.storeId=sid;
	}
	
	
	@Override
	public int getId() {
		
		return id;
	}
	@Override
	public void setId(int id) {
		this.id=id;
	}
	@Override
	public int getProductId() {
		return productId;
	}
	@Override
	public void setProductId(int pid) {
		this.productId=pid;
		
	}
	@Override
	public int getStoreId() {
		return storeId;
	}
	@Override
	public void setStoreId(int sid) {
		this.storeId=sid;
	}
	@Override
	public int getQuantity() {
		return quantity;
	}
	@Override
	public void setQuantity(int quantity) {
		this.quantity=quantity;
		
	}
	
	

}
