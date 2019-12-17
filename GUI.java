package project;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {
	
	private JFrame home; //first window to sign in/up
	private JPanel homeLoginPanel;
	private JPanel homeSignupPanel;
	private JLabel welcome;
	private Container homeContainer;
	
	private JButton UserLogIn;
	private JButton SOLogIn;
	private JButton AdminLogIn;
	private JButton SOSignUp;
	private JButton UserSignUp;
	
	public void UserLogin()
	{
		JFrame UserLoginUI= new JFrame("User Log In");
		UserLoginUI.setSize(1000,500);
		UserLoginUI.setVisible(true);
		
		
	}
	
	public void UserSignup()
	{
		JFrame UserSignupUI= new JFrame("User Registration");
		UserSignupUI.setSize(1000,500);
		UserSignupUI.setVisible(true);
		
		JPanel userSignupPanel= new JPanel();
		userSignupPanel.setLayout(new GridLayout(1, 2));
		
		JPanel leftPanel= new JPanel();
		leftPanel.setLayout(new GridLayout(1,2));
		JPanel leftLabels= new JPanel();
		
		
		
	}
	
	public GUI()
	{
		
		home= new JFrame("Hello");
		home.setSize(1000, 500);
		home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		home.setLocationRelativeTo(null);
		home.setVisible(true);
		
		homeContainer=home.getContentPane();
		homeContainer.setLayout(new GridLayout(1,2));
		
		welcome= new JLabel("Welcome !!");
		welcome.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		
		
		
		UserLogIn= new JButton("User Log In");
		UserLogIn.setBounds(50,30, 30, 20);
		UserSignUp= new JButton("User Sign Up");
		UserSignUp.setBounds(50,30, 30, 20);
		
		AdminLogIn= new JButton("Admin Log In");
		AdminLogIn.setBounds(50,30, 30, 20);
		
		SOLogIn= new JButton("Store Owner Log In");
		SOLogIn.setBounds(50,30, 30, 20);
		SOSignUp= new JButton("Store Owner Sign Up");
		SOSignUp.setBounds(50,30, 30, 20);
		
		GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
		
		homeLoginPanel= new JPanel();
		homeLoginPanel.setSize(300, 300);
		homeLoginPanel.add(UserLogIn,gbc);
		homeLoginPanel.add(AdminLogIn,gbc);
		homeLoginPanel.add(SOLogIn,gbc);
		homeLoginPanel.setVisible(true);
		homeSignupPanel= new JPanel();
		homeSignupPanel.setSize(300, 300);
		homeSignupPanel.add(UserSignUp);
		homeSignupPanel.add(SOSignUp);
		homeSignupPanel.setVisible(true);
		
		home.add(welcome,BorderLayout.NORTH);
		home.add(homeLoginPanel,BorderLayout.WEST);
		home.add(homeSignupPanel,BorderLayout.EAST);
		
		UserLogIn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				UserLogin();
			}

			
		});
		
		
		

		
	}
	
	
	
	

	public static void main (String[] args)
	{
		new GUI();
	}
}
