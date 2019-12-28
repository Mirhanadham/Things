package project;

public class StoreProduct implements IStoreProduct {
	
	private int id;
	private int storeId;
	private int productId;
	private int quantity;
	private IBrand brand;
	private double price;
	private int ownerId;
	private String productName;
	
	public StoreProduct(IBrand bran,int pid, int sid, int quant,double price, int ownId,String prodName)
	{
		this.id=0;
		this.ownerId=ownId;
		this.productId=pid;
		this.quantity=quant;
		this.storeId=sid;
		this.price= price;
		this.productName=prodName;
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


	@Override
	public IBrand getBrand() {
		return brand;
	}


	@Override
	public void setBrand(IBrand brand) {
		this.brand=brand;
	}


	@Override
	public double getPrice() {
		return price;
	}


	@Override
	public void setPrice(double price) {
		this.price=price;
	}


	@Override
	public int getOwnerId() {
		return ownerId;
	}


	@Override
	public void setOwnerId(int oid) {
		this.ownerId=oid;
		
	}


	@Override
	public String getProductName() {
		return productName;
	}


	@Override
	public void setProductName(String prodName) {
		this.productName=prodName;
	}
	
	

}
