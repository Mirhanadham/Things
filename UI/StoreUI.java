package UI;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Controllers.SO_Controller;
import project.PersonalInfo;

public class StoreUI extends JFrame {
	int storeNum;
	PersonalInfo user;
	SO_Controller soCon;
	JButton addStoreProduct;
	JButton showStats;
	JPanel leftPane;
	JPanel rightPane;
	JTextArea stats;
	
	public StoreUI(int num, SO_Controller control,PersonalInfo owner)
	{
		this.storeNum=num;
		this.soCon=control;
		this.user=owner;
		this.setTitle("Store");
		this.setSize(1000,500);
		this.setVisible(true);
		
		
		
		addStoreProduct= new JButton("Add Product To Store");
		addStoreProduct.setBounds(50,30,30,20);
		showStats= new JButton("Show Statistics");
		showStats.setBounds(50,30,30,20);
		
		stats= new JTextArea();
		
		leftPane= new JPanel(new GridBagLayout());
		GridBagConstraints leftConstrains= new GridBagConstraints();
		leftConstrains.anchor=GridBagConstraints.CENTER;
		leftConstrains.insets=new Insets(10, 10,10,10);
		leftConstrains.gridx=0;
		leftConstrains.gridy=0;
		leftPane.add(addStoreProduct,leftConstrains);
		
		rightPane= new JPanel(new GridBagLayout());
		GridBagConstraints rightConstrains= new GridBagConstraints();
		rightConstrains.anchor=GridBagConstraints.WEST;
		rightConstrains.insets=new Insets(10, 10,10,10);
		rightConstrains.gridx=0;
		rightConstrains.gridy=0;
		rightPane.add(showStats,rightConstrains);
		rightConstrains.gridy=1;
		rightPane.add(stats,rightConstrains);
		
		
		this.add(leftPane,BorderLayout.WEST);
		this.add(rightPane,BorderLayout.EAST);
		
		addProduct();
		

		
		
	}
	public void addProduct()
	{
	addStoreProduct.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AddStoreItemUI additem= new AddStoreItemUI(soCon, user, storeNum);
				additem.additem();
				
			}
		});
	}
	
}
