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

import Controllers.User_Controller;
import project.PersonalInfo;
import project.UserFunctionalities;

public class LoginGUI extends JFrame {
	User_Controller userController;
	PersonalInfo user;
	
	public LoginGUI(User_Controller userControl)
	{
		
		this.userController=userControl;
	
	}

	public PersonalInfo login()
	{
		JLabel name= new JLabel("Name: ");
		JTextField nameField= new JTextField(20);
		JLabel pass= new JLabel ("Password: ");
		JTextField passField = new JTextField(20);
		JButton loginbtn= new JButton("Log In");
	    loginbtn.setBounds(50,30, 30, 20);
	   // JComboBox<UserType> type = new JComboBox<UserType>(new UserType [] {UserType.ADMIN, UserType.BUYER,UserType.STOREOWNER});
	    
		
		
		
		JPanel loginPanel = new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
	    constraints.anchor = GridBagConstraints.WEST;
	    constraints.insets = new Insets(10, 10, 10, 10);
	    constraints.gridx=0;
	    constraints.gridy=0;
	    loginPanel.add(name,constraints);
	    constraints.gridx=1;
	    loginPanel.add(nameField,constraints);
	    constraints.gridx=0;
	    constraints.gridy=1;
	    loginPanel.add(pass,constraints);
	    constraints.gridx=1;
	    loginPanel.add(passField,constraints);
	    constraints.anchor = GridBagConstraints.CENTER;
	    constraints.gridx = 0;
	    constraints.gridy = 2;
	    constraints.gridwidth = 2;
	    loginPanel.add(loginbtn,constraints);
	    
	    this.setSize(1000, 500);
	    this.add(loginPanel);
	    this.setVisible(true);
	    
	    
	    loginbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name= nameField.getText();
				String password= passField.getText();
				 user= userController.loginHadler(name, password);
				 				
				
			}
		});
	    
	    return user;
	}
	
	public static void main (String [] args)
	{
		UserFunctionalities funs= new UserFunctionalities();
		User_Controller control= new User_Controller(funs);
		LoginGUI log=new LoginGUI(control);
		PersonalInfo info=log.login();
	}
}
