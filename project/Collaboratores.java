package project;

public class Collaboratores {

	int colID;
	int storeOwnerID;
	int storeID;
	
	public Collaboratores(int id, int storeOwnerID, int storeID) {
		// TODO Auto-generated constructor stub
		this.colID=id;
		this.storeID=storeID;
		this.storeOwnerID=storeOwnerID;
	}
	
	public int getColID() {
		return colID;
	}

	public void setColID(int colID) {
		this.colID = colID;
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