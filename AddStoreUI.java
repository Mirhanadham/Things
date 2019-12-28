package UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import project.StoreType;

public class AddStoreUI extends JFrame{
	
	public AddStoreUI () {
		
		
		
	}
	
	public void adding() {
		
		
		JLabel name= new JLabel("Name: ");
		JTextField nameField= new JTextField(15);
		JLabel Location = new JLabel("Location: ");
		JTextField LocationField = new JTextField(15);
		JComboBox<StoreType> type = new JComboBox<StoreType>(new StoreType [] {StoreType.OFFLINE,StoreType.ONLINE});
		
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
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	public static void main(String [] args)
	{
		AddStoreUI ui=new AddStoreUI();
		ui.adding();
		
		
	}
	

}
