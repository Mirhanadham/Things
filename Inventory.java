package sw;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.List;


public class Inventory implements Serializable{
	private ArrayList<Product> products;
	public static String source ="C:\\Users\\user\\eclipse-workspace\\Software Eng2\\products.txt"; 
	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList products) {
		this.products = products;
	}
	
	public Inventory()
	{
		products = new ArrayList();
	}
	
	public void addToInventory(ProductSpec specs)  
	{
		try {
		Product product= new Product(specs);
		
		 products.add(product);
		 
		 ProductSpec spec = new ProductSpec(product.getSpec().getName(),product.getSpec().getPrice(),product.getSpec().getBrand(),product.getSpec().getCategory(),product.getSpec().getDescription(),product.getSpec().getRate());
		 
		 
		 
			
			FileOutputStream fos= new FileOutputStream(source);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(product);
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		
	}
	 

}