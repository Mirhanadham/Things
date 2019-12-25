package project;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class DisplayBrands extends JFrame {
	
	BrandFunctions brandFun;
	
	public DisplayBrands( BrandFunctions funs)
	{
		this.brandFun= funs;
		
		JTextArea display = new JTextArea();
		ArrayList<IBrand> brands= brandFun.getBrandList();
		
		for(IBrand brand:brands)
		{
			display.append(brand.getId()+ " "+brand.getName()+" "+brand.getCategory()+" "+brand.getFounder()+"\n");
		}
		this.add(display);

		this.setVisible(true);

	}
	

	public static void main(String []args)
	{
		BrandFunctions funs= new BrandFunctions();
		new DisplayBrands(funs);
	}
}
