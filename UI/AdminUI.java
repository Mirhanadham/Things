package UI;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import Controllers.Admin_Controller;
import project.PersonalInfo;

public class AdminUI extends JFrame{
	Admin_Controller adminControl;
	PersonalInfo user;
	JButton addProduct;
	JButton addBrand ;
	public AdminUI(Admin_Controller con,PersonalInfo info )
	{
		this.adminControl=con;
		this.user= info;
		this.setSize(1000, 500);
		this.setVisible(true);
		 addProduct = new JButton("Add Product");
		addProduct.setBounds(50,30, 30, 20);
		this.add(addProduct,BorderLayout.WEST);
		addBrand = new JButton("Add Brand");
		addBrand.setBounds(50,30, 30, 20);
		this.add(addBrand,BorderLayout.EAST);
		addProducts();
		addBrand();
		
	}
	public void addProducts()
	{
		
		addProduct.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				AddProductUI addP= new AddProductUI(adminControl);
				addP.adding();
			}
		});
	}
	
	public void addBrand( )
	{
		
		addBrand.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				AddBrandUI brandui= new AddBrandUI(adminControl);
			}
		});
	}

}
