package UI;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import Controllers.Admin_Controller;
import Controllers.Verified_Controller;
import project.PersonalInfo;

public class AdminUI extends JFrame{
	Admin_Controller adminControl;
	PersonalInfo user;
	Verified_Controller verCon;
	JButton addProduct;
	JButton addBrand ;
	JButton verifie;
	JButton addNewStatistics;
	public AdminUI(Admin_Controller con,PersonalInfo info,Verified_Controller verCon)
	{
		
		
		this.verCon=verCon;
		this.adminControl=con;
		this.user= info;
		this.setSize(1000, 500);
		this.setVisible(true);
		verifie = new JButton("Verifie waiting stores");
		verifie.setBounds(50,30, 30, 20);
		this.add(verifie,BorderLayout.SOUTH);
		addNewStatistics = new JButton("Add new statistic");
		addNewStatistics.setBounds(50,30, 30, 20);
		this.add(addNewStatistics,BorderLayout.NORTH);
		 addProduct = new JButton("Add Product");
		addProduct.setBounds(50,30, 30, 20);
		this.add(addProduct,BorderLayout.WEST);
		addBrand = new JButton("Add Brand");
		addBrand.setBounds(50,30, 30, 20);
		this.add(addBrand,BorderLayout.EAST);
		addProducts();
		addBrand();
		VerifieStores();
		addNewStat();
		
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
	public void VerifieStores()
	{
		
		verifie.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				VerifiedUI verUi= new VerifiedUI(adminControl);
			
			}
		});
	}
	public void addNewStat()
	{
		
		addNewStatistics.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				AddStatUi addUi= new AddStatUi (adminControl);
			
			}
		});
	}
}
