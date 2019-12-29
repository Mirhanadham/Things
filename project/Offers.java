package project;

public class Offers {
	private double storeOwnerDiscount = 0.15;
	private double firstOrderDiscount=0.05;
	private double doubleSameProductDisc=0.10;
	
	public Offers()
	{
		
	}

	public double getStoreOwnerDiscount() {
		return storeOwnerDiscount;
	}

	public void setStoreOwnerDiscount(double storeOwnerDiscount) {
		this.storeOwnerDiscount = storeOwnerDiscount;
	}

	public double getDoubleSameProductDisc() {
		return doubleSameProductDisc;
	}

	public void setDoubleSameProductDisc(double doubleSameProductDisc) {
		this.doubleSameProductDisc = doubleSameProductDisc;
	}

	public double getFirstOrderDiscount() {
		return firstOrderDiscount;
	}

	public void setFirstOrderDiscount(double firstOrderDiscount) {
		this.firstOrderDiscount = firstOrderDiscount;
	}
	

}
