package UI;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import project.ProductInventory;
import project.ProductSpec;
import project.Statistics;

public class DisplayProducts extends JFrame {
	ProductInventory products;
	Statistics stats;
	public DisplayProducts(ProductInventory in)
	{
		this.products=in;
		
		JTextArea display= new JTextArea();
		
		
		ArrayList<ProductSpec> pList=products.productList();
		
		display.append("ID  Name   Category   Price"+"\n");
		
		for(ProductSpec product:pList)
		{
			display.append(product.getId()+ "  "+product.getName()+"   "+product.getCategory()+"   "+product.getPrice()+"\n");
			int productID=product.getId();
			stats.updateViews(productID);
		}
		
		this.setSize(1000,500);
		this.setTitle("Products List");
		this.add(display);
		this.setVisible(true);
		
	}
	

}
