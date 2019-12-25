package project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AdminUI extends JFrame{
	Admin_Controller adminControl;
	public AdminUI()
	{
		
		this.setSize(1000, 500);
		this.setVisible(true);
		
		
		
	}
	public void addProducts(Product_Controller prodCon)
	{
		JButton addProduct = new JButton("Add Product");
		addProduct.setBounds(50,30, 30, 20);
		this.add(addProduct);
		addProduct.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				AddProductUI addP= new AddProductUI(prodCon);
				addP.adding();
			}
		});
	}
	
	public void addBrand(Brand_Controller brandCon)
	{
		JButton addBrand = new JButton("Add Brand");
		addBrand.setBounds(50,30, 30, 20);
		this.add(addBrand);
		addBrand.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				AddBrandUI brandui= new AddBrandUI(brandCon);
			}
		});
	}

}
