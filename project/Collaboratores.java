package project;

public class Collaboratores {

	String userName;
	int storeOwnerID;
	int storeID;
	
	public Collaboratores(String userName, int storeOwnerID, int storeID) {
		// TODO Auto-generated constructor stub
		this.userName=userName;
		this.storeID=storeID;
		this.storeOwnerID=storeOwnerID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userID) {
		this.userName = userID;
	}
	public int getStoreOwnerID() {
		return storeOwnerID;
	}
	public void setStoreOwnerID(int storeOwnerID) {
		this.storeOwnerID = storeOwnerID;
	}
	public int getStoreID() {
		return storeID;
	}
	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}
}
