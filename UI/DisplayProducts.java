package UI;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import project.ProductInventory;
import project.ProductSpec;

public class DisplayProducts extends JFrame {
	ProductInventory products;
	public DisplayProducts(ProductInventory in)
	{
		this.products=in;
		
		JTextArea display= new JTextArea();
		
		
		ArrayList<ProductSpec> pList=products.productList();
		
		for(ProductSpec product:pList)
		{
			display.append(product.getId()+ " "+product.getName()+" "+product.getCategory()+" "+product.getPrice()+"\n");
		}
		
		this.setSize(1000,500);
		this.setTitle("Products List");
		this.add(display);
		this.setVisible(true);
		
	}
	

}
