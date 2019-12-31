package project;

public class StoreOffer {
	private String offerName;
	private int storeID;
	private double offerPercentage;
	
	public StoreOffer(String name, int id,double percentage)
	{
		this.setOfferName(name);
		this.setStoreID(id);
		this.setOfferPercentage(percentage);
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public int getStoreID() {
		return storeID;
	}

	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}

	public double getOfferPercentage() {
		return offerPercentage;
	}

	public void setOfferPercentage(double offerPercentage) {
		this.offerPercentage = offerPercentage;
	}

}
