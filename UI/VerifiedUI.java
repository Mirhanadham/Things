package UI;

import java.awt.BorderLayout;
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

import Controllers.Admin_Controller;
import Controllers.Verified_Controller;

public class VerifiedUI extends JFrame{
	
	Admin_Controller adminCon;
	
	
	public VerifiedUI(Admin_Controller adminCon )
	{
		
		this.adminCon=adminCon;
		
		
		JLabel storeId= new JLabel("Store ID: ");
		JTextField storeIdField= new JTextField(15);
		JLabel storeOwnerId= new JLabel("Store owner name: ");
		JTextField storeOwnerIdField= new JTextField(15);
		
		JButton verifie= new JButton("Verifie");
		verifie.setBounds(50,30, 30, 20);
		
		JButton notVerifie= new JButton("Not Verified");
		notVerifie.setBounds(50,30, 30, 20);
	
		
		JButton viewWaitingList= new JButton("View stores waiting to be Verified");
		viewWaitingList.setBounds(50,30, 30, 20);

	
		
		
		JPanel leftPanel= new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
	    constraints.anchor = GridBagConstraints.WEST;
	    constraints.insets = new Insets(10, 10, 10, 10);
	    constraints.gridx = 0;
	    constraints.gridy = 0;    
	    leftPanel.add(storeId,constraints);
	    constraints.gridx=1;
	    leftPanel.add(storeIdField);
	    constraints.gridx=0;
	    constraints.gridy=1;
	    leftPanel.add(storeOwnerId,constraints);
	    constraints.gridx=1;
	    leftPanel.add(storeOwnerIdField,constraints);
	    constraints.gridx=0;
	    constraints.gridy=2;

	    leftPanel.add(verifie,constraints);
	    this.add(leftPanel);
	    this.setSize(1000,500);
	    this.setVisible(true);
	    this.add(verifie,BorderLayout.WEST);
	    leftPanel.add(notVerifie,constraints);
	    this.add(leftPanel);
	    this.setSize(1000,500);
	    this.setVisible(true);
	    this.add(notVerifie,BorderLayout.CENTER);
	    leftPanel.add(viewWaitingList,constraints);
	    this.add(leftPanel);
	    this.setSize(1000,500);
	    this.setVisible(true);
	    this.add(notVerifie,BorderLayout.EAST);
	    verifie.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String storeId=storeIdField.getText();
				String storeOwnerId= storeOwnerIdField.getText();
				
				
				adminCon.verifie(storeId, storeOwnerId);
				
			}
		});
	    
	    notVerifie.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String storeId=storeIdField.getText();
				String storeOwnerId= storeOwnerIdField.getText();
				
				
				adminCon.notVerifie(storeId, storeOwnerId);
				
			}
		});
	    
	    viewWaitingList.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String storeId=storeIdField.getText();
				String storeOwnerId= storeOwnerIdField.getText();
				
				
				adminCon.listOfStoresWaiting();
				
			}
		});
	    
	}
}
