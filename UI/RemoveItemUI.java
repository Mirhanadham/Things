package UI;

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

import Controllers.SO_Controller;

public class RemoveItemUI extends JFrame {
	SO_Controller control;
	
	public RemoveItemUI(SO_Controller control)
	{
		this.control=control;
	
		JLabel pID= new JLabel("Product ID: ");
		JTextField PID= new JTextField(15);
		
		
		JButton remove= new JButton("Remove");
	    remove.setBounds(50,30, 30, 20);
		
		JPanel leftPanel= new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
	    constraints.anchor = GridBagConstraints.WEST;
	    constraints.insets = new Insets(10, 10, 10, 10);
	    constraints.gridx = 0;
	    constraints.gridy = 0;    
	    leftPanel.add(pID,constraints);
	    constraints.gridx=1;
	    leftPanel.add(PID,constraints);
	    constraints.gridx=0;
	    constraints.gridy=1;
	    leftPanel.add(remove,constraints);
	    this.add(leftPanel);
	    this.setSize(1000,500);
	    this.setVisible(true);
	    
	    remove.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int ID=Integer.parseInt(PID.getText());
				
				control.removeItem(ID);			 
				
			}
	    });
			
	    }
	}
