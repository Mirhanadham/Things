package project;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
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

public class GUI {
	
	private JFrame home; //first window to sign in/up
	private JPanel homeLoginPanel;
	private JPanel homeSignupPanel;
	private JLabel welcome;
	private Container homeContainer;
	
	private JButton LogIn;
	
	private JButton UserSignUp;
	
	public GUI()
	{
		UserFunctionalities userFunc= new UserFunctionalities();
		User_Controller userHandler= new User_Controller(userFunc);
		ProductInventory productIn= new ProductInventory();
		
		
		
		home= new JFrame("Hello");
		home.setSize(1000, 500);
		home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		home.setLocationRelativeTo(null);
		home.setVisible(true);
		
		homeContainer=home.getContentPane();
		homeContainer.setLayout(new GridLayout(1,2));
		
		welcome= new JLabel("Welcome !!");
		welcome.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		
		
		
		LogIn= new JButton(" Log In");
		LogIn.setBounds(50,30, 30, 20);
		UserSignUp= new JButton("User Sign Up");
		UserSignUp.setBounds(50,30, 30, 20);
		
		
		
		
		GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
		
		homeLoginPanel= new JPanel();
		homeLoginPanel.setBounds(50,50,200,300);
		homeLoginPanel.add(LogIn,gbc);
		homeLoginPanel.setVisible(true);
		homeSignupPanel= new JPanel();
		homeSignupPanel.setBounds(50,50,200,300);
		homeSignupPanel.add(UserSignUp);
		
		homeSignupPanel.setVisible(true);
		
		home.add(welcome,BorderLayout.NORTH);
		home.add(homeLoginPanel,BorderLayout.WEST);
		home.add(homeSignupPanel,BorderLayout.EAST);
		
	    LogIn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				LoginGUI loginui= new LoginGUI(userHandler);
				PersonalInfo user= loginui.login();
				
				
				
			}

			
		});
		
		UserSignUp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				RegistrationGUI regui= new RegistrationGUI(userHandler);
			}
		});
		
		
		
		

		
	}
	
	
	
	

	public static void main (String[] args)
	{
		new GUI();
	}
}
