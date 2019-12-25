package project;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddBrandUI extends JFrame{
	Brand_Controller brandCon;
	
	public AddBrandUI(Brand_Controller controller)
	{
		this.brandCon=controller;
		
		JLabel name= new JLabel("Name: ");
		JTextField nameField= new JTextField(15);
		JLabel category = new JLabel("Category: ");
		JTextField catField = new JTextField(15);
		JLabel founder = new JLabel("Founder: ");
		JTextField founderField = new JTextField(15);
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
	    leftPanel.add(catField,constraints);
	    constraints.gridx=0;
	    constraints.gridy=2;
	    leftPanel.add(founder,constraints);
	    constraints.gridx=1;
	    leftPanel.add(founderField,constraints);
	    constraints.gridx=0;
	    constraints.gridy=3;
	    leftPanel.add(add,constraints);
	    this.add(leftPanel);
	    this.setSize(1000,500);
	    this.setVisible(true);
	    
	    add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String name=nameField.getText();
				String cat= catField.getText();
				String found=founderField.getText();
				
				brandCon.addBrand(name, found, cat);
				
			}
		});
	    
	    
		
	}
	
	public static void main(String [] args)
	{
		BrandFunctions funcs= new BrandFunctions();
		Brand_Controller con= new Brand_Controller(funcs);
		new AddBrandUI(con);
		
	}

}
