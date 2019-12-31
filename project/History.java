package project;

public class History {

	int storeID;
	int ID;
	public enum ActionType
	{
		PRODUCTADD,
		COLLABADD,
		OFFERADD,
		PRODUCTREM
	}
	ActionType actionTaken;
	int actionID;
	public History(int storeId2, int id2, ActionType type,int actionId) {
		// TODO Auto-generated constructor stub
		this.storeID=storeId2;
		this.ID=id2;
		this.actionTaken=type;
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
	public ActionType getActionTaken() {
		return actionTaken;
	}
	public void setActionType(ActionType actionTaken1) {
		this.actionTaken = actionTaken1;
	}
	
}