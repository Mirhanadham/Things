package UI;

import java.awt.BorderLayout;
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

import Controllers.User_Controller;
import project.UserFunctionalities;
import project.UserType;

public class RegistrationGUI extends JFrame {
	
	User_Controller userControl;
	public RegistrationGUI(User_Controller userCon)
	{
		this.userControl=userCon;
		
	
		JLabel name= new JLabel("Name: ");
		JTextField nameField= new JTextField(15);
		JLabel email = new JLabel("Email: ");
		JTextField emailField = new JTextField(15);
		JLabel age = new JLabel("Age: ");
		JTextField ageField = new JTextField(15);
		JLabel pass= new JLabel("Password: ");
		JTextField passField= new JTextField(15);
		JLabel gen= new JLabel("Gender");
		JComboBox<String> genField = new JComboBox<String>(new String[] {"Female","Male"});
		JComboBox<UserType> type = new JComboBox<UserType>(new UserType [] {UserType.BUYER,UserType.STOREOWNER});
		JButton register= new JButton("Register");
	    register.setBounds(50,30, 30, 20);
	
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
	    leftPanel.add(email,constraints);
	    constraints.gridx=1;
	    leftPanel.add(emailField,constraints);
	    constraints.gridx=0;
	    constraints.gridy=2;
	    leftPanel.add(age,constraints);
	    constraints.gridx=1;
	    leftPanel.add(ageField,constraints);
	    
	    JPanel rightPanel= new JPanel(new GridBagLayout());
	    GridBagConstraints constraintsR= new GridBagConstraints();
	    constraintsR.anchor= GridBagConstraints.WEST;
	    constraintsR.insets = new Insets(10, 10, 10, 10);
	    constraintsR.gridx=0;
	    constraintsR.gridy=0;
	    rightPanel.add(pass,constraintsR);
	    constraintsR.gridx=1;
	    rightPanel.add(passField,constraintsR);
	    constraintsR.gridx=0;
	    constraintsR.gridy=1;
	    rightPanel.add(gen,constraintsR);
	    constraintsR.gridx=1;
	    rightPanel.add(genField,constraintsR);
	    constraintsR.gridx=0;
	    constraintsR.gridy=2;
	    rightPanel.add(type,constraintsR);
	    constraintsR.gridx=10;
	    constraintsR.gridy=20;
	    constraintsR.anchor= GridBagConstraints.SOUTHWEST;
	    rightPanel.add(register,constraintsR);
	    
	    this.add(leftPanel,BorderLayout.WEST);
	    this.add(rightPanel,BorderLayout.EAST);
	    register.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 String userName= nameField.getText();
			        String userEmail= emailField.getText();
			        int userAge=Integer.parseInt( ageField.getText());
			        String userPass= passField.getText();
			        String userGen=(String) genField.getSelectedItem();
			        UserType Type =(UserType) type.getSelectedItem();
			        userControl.registrationHandler(userName, userPass, userEmail, userGen, userAge, Type);
				  
			        System.out.println(userGen);
			        register.setEnabled(false);
				
			}
		});
	    this.setSize(1000, 500);
	    this.setVisible(true);
	}
	
	

}
