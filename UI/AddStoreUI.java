package UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controllers.SO_Controller;
import project.StoreSpec.Type;


public class AddStoreUI extends JFrame{
	
	SO_Controller soCon;
	public AddStoreUI (SO_Controller soCon ,int SOId) {
		
		this.soCon=soCon;
		
		JLabel name= new JLabel("Name: ");
		JTextField nameField= new JTextField(15);
		JLabel Location = new JLabel("Location: ");
		JTextField LocationField = new JTextField(15);
		//JComboBox<Type> type = new JComboBox<Type>(new Type [] {Type.OFFLINE,Type.ONLINE});
		JComboBox<project.StoreSpec.Type> type;
		type=new JComboBox<project.StoreSpec.Type>(new project.StoreSpec.Type [] {project.StoreSpec.Type.OFFLINE,project.StoreSpec.Type.ONLINE});
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
	    leftPanel.add(nameField,constraints);
	    constraints.gridx=0;
	    constraints.gridy=1;
	    leftPanel.add(Location,constraints);
	    constraints.gridx=1;
	    leftPanel.add(LocationField,constraints);
	    constraints.gridx=0;
	    constraints.gridy=2;
	    leftPanel.add(type,constraints); 
	    constraints.gridx=0;
	    constraints.gridy=3;
	    leftPanel.add(add,constraints);
	  
	   
	    this.setSize(1000, 500);
	    this.add(leftPanel);
	    this.setVisible(true);
	    
	    add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String name=nameField.getText();
				String Location= LocationField.getText();
				project.StoreSpec.Type Type =(project.StoreSpec.Type) type.getSelectedItem();
				soCon.addStore(name, Type, Location, SOId);
				add.setEnabled(false);
				
			}
		});
 
		
		
	}
	


	

}