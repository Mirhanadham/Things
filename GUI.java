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
	
	PersonalInfo user;
	UserFunctionalities userFunc;
	BrandFunctions brandFunc;
	User_Controller userHandler;
	ProductInventory productIn;
	Admin_Controller adminCon;
	Product_Controller podCon;
	Brand_Controller brandCon;
	
	
	public GUI()
	{
		this.userFunc= new UserFunctionalities();
		this.userHandler= new User_Controller(userFunc);
		this.productIn= new ProductInventory();
		this.brandFunc= new BrandFunctions();
		this.brandCon= new Brand_Controller(brandFunc);
		this.podCon= new Product_Controller(productIn, brandCon);
		this.adminCon= new Admin_Controller(podCon, brandCon);
		
		
		
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
				
				 Login();
			
				
			}
			

			
		});
	    

		
		UserSignUp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				RegistrationGUI regui= new RegistrationGUI(userHandler);
			}
		});
		
		
		
		

		
	}
	public void Login()
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
	    
	    JFrame logIn= new JFrame ("Login");
	    logIn.setSize(1000,500);
	    
	    logIn.add(loginPanel);
	    logIn.setVisible(true);
	    
	    
	    loginbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name= nameField.getText();
				String password= passField.getText();
				 user= userHandler.loginHadler(name, password);
				 if (user==null)
					{
						JOptionPane.showMessageDialog(null, "You Can't LogIn at the moment. Your password, name or email is incorrect.","LoginMsg",JOptionPane.INFORMATION_MESSAGE);
					}
					else if(user.getType().equals(UserType.ADMIN))
					{
						AdminUI admin= new AdminUI(adminCon);
						
					}
				 				
				
			}
		});
	    
	    
		 
		
	}
	
	
	
	

	public static void main (String[] args)
	{
		new GUI();
	}
}
