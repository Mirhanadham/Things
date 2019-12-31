package project;

public class History {

	int storeID;
	int ID;
	String actionTaken;
	int actionID;
	public History(int storeId2, int id2, String string,int actionId) {
		// TODO Auto-generated constructor stub
		this.storeID=storeId2;
		this.ID=id2;
		this.actionTaken=string;
		this.actionID=actionId;
	}
	public int getActionID() {
		return actionID;
	}
	public void setActionID(int actionID) {
		this.actionID = actionID;
	}
	public int getStoreID() {
		return storeID;
	}
	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getActionTaken() {
		return actionTaken;
	}
	public void setActionTaken(String actionTaken) {
		this.actionTaken = actionTaken;
	}
	
}
