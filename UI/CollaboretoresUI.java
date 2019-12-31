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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controllers.SO_Controller;
import project.PersonalInfo;
import project.UserFunctionalities;

public class CollaboretoresUI extends JFrame {

	SO_Controller soCon;
	UserFunctionalities user;
	int storeNum;
	
	public CollaboretoresUI(SO_Controller soCon, UserFunctionalities user,int storeOwnerID,int storNum) {
		// TODO Auto-generated constructor stub

		soCon.listUsers();
		this.soCon=soCon;
		this.user=user;
		this.storeNum=storNum;
		JLabel colID= new JLabel("ID: ");
		JTextField ColID= new JTextField(15);
		
		JButton add= new JButton("Add");
	    add.setBounds(50,30, 30, 20);
	    

	    JPanel leftPanel= new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
	    constraints.anchor = GridBagConstraints.WEST;
	    constraints.insets = new Insets(10, 10, 10, 10);
	    constraints.gridx = 0;
	    constraints.gridy = 0;    
	    leftPanel.add(colID,constraints);
	    constraints.gridx=1;
	    leftPanel.add(ColID,constraints);
	    constraints.gridx=0;
	    constraints.gridy=1;
	    
	
	    leftPanel.add(add,constraints);
	    this.setSize(1000, 500);
	    this.add(leftPanel);
	    this.setVisible(true);
	   
		  
		   
	    this.setSize(1000, 500);
	    this.add(leftPanel);
	    this.setVisible(true);
	    
	    
	    add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int colID=Integer.parseInt(ColID.getText());
				
				PersonalInfo info=user.getUserWithID(colID);
				if(info==null)
				{
					JOptionPane.showMessageDialog(null, "You have entered a wrong user ID. Please choose one from the list.","CollabMsg",JOptionPane.INFORMATION_MESSAGE);

				}
	
				else
				{
				soCon.addCollaberator(colID, storeNum, storeOwnerID,user);
				}
				add.setEnabled(false);
			}
		});
 
		
		
	
	
	    
	}
	
	

}
