package UI;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import project.BrandFunctions;
import project.IBrand;

public class DisplayBrands extends JFrame {
	
	BrandFunctions brandFun;
	
	public DisplayBrands( BrandFunctions funs)
	{
		this.brandFun= funs;
		
		JTextArea display = new JTextArea();
		ArrayList<IBrand> brands= brandFun.getBrandList();
		
		display.append("ID  Name   Category   Founder"+"\n");
		
		for(IBrand brand:brands)
		{
			display.append(brand.getId()+ "  "+brand.getName()+"   "+brand.getCategory()+"   "+brand.getFounder()+"\n");
		}
		this.add(display);
		this.setSize(1000,500);
		this.setTitle("Brands List");
		this.setVisible(true);
	}
	

	
}
