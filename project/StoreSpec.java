package project;

import java.util.ArrayList;
import java.util.Date;


public abstract class StoreSpec {

	public String name;

    public enum Type
    {
    	ONLINE,OFFLINE
    }
    public String location;
  

	public Type type;
    public int id;
   int storeOwnerID;
   public int getStoreOwnerID() {
 		return storeOwnerID;
 	}

 	public void setStoreOwnerID(int storeOwnerID) {
 		this.storeOwnerID = storeOwnerID;
 	}
    
    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

  

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	




}
