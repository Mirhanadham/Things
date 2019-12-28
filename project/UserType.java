package project;

public enum UserType {
	BUYER,ADMIN,STOREOWNER;
	
	public String toString()
	{
		if (this.equals(BUYER))
			return "Buyer";
		else if (this.equals(ADMIN))
			return "Admin";
		else if(this.equals(STOREOWNER))
			return "Store Owner";
		else 
			return "wrong choice";
	}

}
