package project;

public interface IStoreProduct {

	int getId();
	void setId(int id);
	
	int getProductId();
	void setProductId(int pid);
	
	int getStoreId();
	void setStoreId(int sid);
	
	int getQuantity();
	void setQuantity(int quantity);
	
	IBrand getBrand();
	void setBrand(IBrand brand);
	
	double getPrice();
	void setPrice(double price);
	
	int getOwnerId();
	void setOwnerId(int oid);
	
	String getProductName();
	void setProductName(String prodName);
	
	
	
}
