package project;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddProductUI extends JFrame {
	Product_Controller prodCon;
	public AddProductUI(Product_Controller control)
	{
		this.prodCon=control;

	
	}
	public void adding()
	{
		prodCon.viewBrands();
		
		JLabel name= new JLabel("Name: ");
		JTextField nameField= new JTextField(15);
		JLabel category = new JLabel("Category: ");
		JTextField categoryField = new JTextField(15);
		JLabel brand = new JLabel("Brand ID: ");
		JTextField brandField = new JTextField(15);
		JLabel price= new JLabel("Price: ");
		JTextField priceField= new JTextField(15);
		
		JButton add= new JButton("Add");
	    add.setBounds(50,30, 30, 20);
	    
	    
	    JPanel leftPanel= new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
	    constraints.anchor = GridBagConstraints.WEST;
	    constraints.insets = new Insets(10, 10, 10, 10);
	    constraints.gridx = 0;
	    constraints.gridy = 0;    
	    leftPanel.add(name,constraints);
	    constraints.gridx=1;
	    leftPanel.add(nameField);
	    constraints.gridx=0;
	    constraints.gridy=1;
	    leftPanel.add(category,constraints);
	    constraints.gridx=1;
	    leftPanel.add(categoryField,constraints);
	    constraints.gridx=0;
	    constraints.gridy=2;
	    leftPanel.add(brand,constraints);
	    constraints.gridx=1;
	    leftPanel.add(brandField,constraints);
	    constraints.gridx=0;
	    constraints.gridy=3;
	    leftPanel.add(price,constraints);
	    constraints.gridx=1;
	    leftPanel.add(priceField,constraints);
	    constraints.gridx=0;
	    constraints.gridy=4;
	    leftPanel.add(add,constraints);
	    
	    this.setSize(1000, 500);
	    this.add(leftPanel);
	    this.setVisible(true);
	    
	    
	    
	    add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String pName= nameField.getText();
				String cat= categoryField.getText();
				int brandID=Integer.parseInt(brandField.getText());
				double value=Double.parseDouble( priceField.getText());
				
				prodCon.addProduct_Handler(pName, cat, brandID, value);
				
				
			}
		});
	}

	public static void main(String []args)
	{
		ProductInventory in = new ProductInventory();
		BrandFunctions funcs = new BrandFunctions();
		Brand_Controller brandCon= new Brand_Controller(funcs);
		Product_Controller control = new Product_Controller(in,brandCon);
		
		AddProductUI ui=new AddProductUI(control);
		ui.adding();
		
	}
}
