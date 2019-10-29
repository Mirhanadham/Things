package sw;

import java.io.Serializable;
import java.util.List;

public class Product implements Serializable{
	private  ProductSpec spec;
	
	
	
	public Product(ProductSpec specs)
	{
		this.spec=specs;
	}



	public   ProductSpec getSpec() {
		return spec;
	}



	public void setSpec(ProductSpec spec) {
		this.spec = spec;
	}
	
	

}