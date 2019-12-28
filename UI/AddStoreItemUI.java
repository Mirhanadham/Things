package UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controllers.Admin_Controller;
import Controllers.SO_Controller;
import project.PersonalInfo;
import project.StoreFunctionalities;

public class AddStoreItemUI extends JFrame {
	SO_Controller soCon;
	PersonalInfo user;
	int storeNum;
	
	
	public AddStoreItemUI(SO_Controller con, PersonalInfo info,int storeNo)
	{
		this.soCon= con;
		this.user=info;
		this.storeNum=storeNo;
		soCon.viewProducts();
		soCon.viewBrands();
		
		
		
		
	}
	public void additem()
	{
		
		
		JLabel productId= new JLabel("Product ID: ");
		JTextField prodIdField= new JTextField(15);
		
		JLabel brandId= new JLabel("Brand ID: ");
		JTextField branIdField= new JTextField(15);
		
		JLabel price = new JLabel("Price: ");
		JTextField priceField= new JTextField(15);
		
		JLabel quantity= new JLabel("Quantity: ");
		JTextField quantityField= new JTextField(15);
		
		JButton add= new JButton("ADD");
		add.setBounds(50,30, 30, 20);
		
		
		JPanel panel= new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
	    constraints.anchor = GridBagConstraints.WEST;
	    constraints.insets = new Insets(10, 10, 10, 10);
	    constraints.gridx = 0;
	    constraints.gridy = 0;    
	    panel.add(productId,constraints);
	    constraints.gridx=1;
	    panel.add(prodIdField,constraints);
	    constraints.gridx = 0;
	    constraints.gridy = 1;
	    panel.add(brandId,constraints);
	    constraints.gridx=1;
	    panel.add(branIdField,constraints);
	    constraints.gridx = 0;
	    constraints.gridy = 2;
	    panel.add(price,constraints);
	    constraints.gridx=1;
	    panel.add(priceField,constraints);
	    constraints.gridx = 0;
	    constraints.gridy = 3;
	    panel.add(quantity,constraints);
	    constraints.gridx=1;
	    panel.add(quantityField,constraints);
	    constraints.gridx = 0;
	    constraints.gridy = 4;
	    panel.add(add,constraints);
	   
	    this.add(panel);
	    this.setSize(1000,500);
	    this.setTitle("Add Product To Store");
	    this.setVisible(true);
	    
	    
	    
	    add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				int productId=Integer.parseInt(prodIdField.getText());
				int brandId=Integer.parseInt(branIdField.getText());
				double price=Double.parseDouble(priceField.getText());
				int quantity= Integer.parseInt(quantityField.getText());
				
				String productName=soCon.getProductName(productId);
				
				
				boolean productfound= soCon.findProduct(productId);
				boolean brandfound= soCon.findBrand(brandId);
				if(brandfound==true && productfound==true)
				{
					
					soCon.addItemToStore(storeNum,brandId,productId,price,quantity,user.getId(),productName);
				}
				else
				{
				
					JOptionPane.showMessageDialog(null, "Wrong Product or Brand ID please choose one from the list.","ProductMsg",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
	   
	    
	}
	

}
