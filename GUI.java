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
	
	private JButton UserLogIn;
	private JButton SOLogIn;
	private JButton AdminLogIn;
	private JButton SOSignUp;
	private JButton UserSignUp;
	
	public void UserLogin(User user)
	{
		JFrame UserLoginUI= new JFrame("User Log In");
		UserLoginUI.setSize(1000,500);
		UserLoginUI.setLocationRelativeTo(null);
		UserLoginUI.setVisible(true);
		
		JLabel name= new JLabel("Name: ");
		JTextField nameField= new JTextField(20);
		JLabel pass= new JLabel ("Password: ");
		JTextField passField = new JTextField(20);
		JButton loginbtn= new JButton("Log In");
        loginbtn.setBounds(50,30, 30, 20);
        JComboBox type= new JComboBox(new String [] {"User","Store Owner","Admin"});
        
		
		
		
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
        constraints.gridx=0;
        constraints.gridy=2;
        loginPanel.add(type,constraints);
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        loginPanel.add(loginbtn,constraints);
        
        		
        
        loginbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String myname= nameField.getText();
				String pas= passField.getText();
				Logs log= new Logs();
				
				boolean answer=user.login(myname, pas, log);
				if (answer==true)
				{
					//UserWindows();
				}
				else 
				{
					int trials=0;
					boolean ans=false;
					do
					
					{
						String mytrialname= nameField.getText();
						String pastrial= passField.getText();
						
						
						ans=user.login(mytrialname, pastrial, log);
					}while(trials<2 && ans==false);
					
					if (trials==2)
					{
						JOptionPane.showMessageDialog(null, "You Can't LogIn at the moment. You have wasted your trials","LoginMsg",JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
        
        
        
		UserLoginUI.add(loginPanel,BorderLayout.CENTER);
		
		
		
		
	}
	
	public void UserSignup()
	{
		JLabel name= new JLabel("Name: ");
		JTextField nameField= new JTextField(15);
		JLabel email = new JLabel("Email: ");
		JTextField emailField = new JTextField(15);
		JLabel age = new JLabel("Age: ");
		JTextField ageField = new JTextField(15);
		JLabel pass= new JLabel("Password: ");
		JTextField passField= new JTextField(15);
		JLabel gen= new JLabel("Gender");
		JComboBox genField = new JComboBox(new String[] {"Female","Male"});
		JButton register= new JButton("Register");
        register.setBounds(50,30, 30, 20);
		
		JFrame UserSignupUI= new JFrame("User Registration");
		UserSignupUI.setSize(1000,1000);
		UserSignupUI.setVisible(true);
		UserSignupUI.setLocationRelativeTo(null);
		UserSignupUI.setLayout(new GridLayout(1, 2));
		
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
        constraintsR.gridx=10;
        constraintsR.gridy=20;
        constraintsR.anchor= GridBagConstraints.SOUTHWEST;
        rightPanel.add(register,constraintsR);
        		
        UserSignupUI.add(leftPanel,BorderLayout.EAST);
        UserSignupUI.add(rightPanel,BorderLayout.WEST);
        
        
       
        
       
        register.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 String userName= nameField.getText();
			        String userEmail= emailField.getText();
			        int userAge=Integer.parseInt( ageField.getText());
			        String userPass= passField.getText();
			        String userGen=(String) genField.getSelectedItem();
				 User user= new User(userName,userPass,userEmail,userGen,userAge);
			        Logs log = new Logs();
			        user.register(user, log);
			        System.out.println(user.getName()+" "+user.getEmail()+" "+user.getAge()+" "+user.getPassword()+" "+user.getGender()+"\n");
			        System.out.println(userGen);
				
			}
		});
       
	
		
		
		
		
	}
	
	public void SOSignup()
	{

		JLabel name= new JLabel("Name: ");
		JTextField nameField= new JTextField(15);
		JLabel email = new JLabel("Email: ");
		JTextField emailField = new JTextField(15);
		JLabel age = new JLabel("Age: ");
		JTextField ageField = new JTextField(15);
		JLabel pass= new JLabel("Password: ");
		JTextField passField= new JTextField(15);
		JLabel gen= new JLabel("Gender");
		JComboBox genField = new JComboBox(new String[] {"Female","Male"});
		JButton register= new JButton("Register");
        register.setBounds(50,30, 30, 20);
		
		JFrame UserSignupUI= new JFrame("Store Owner Registration");
		UserSignupUI.setSize(1000,1000);
		UserSignupUI.setVisible(true);
		UserSignupUI.setLocationRelativeTo(null);
		UserSignupUI.setLayout(new GridLayout(1, 2));
		
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
        constraintsR.gridx=10;
        constraintsR.gridy=20;
        constraintsR.anchor= GridBagConstraints.SOUTHWEST;
        rightPanel.add(register,constraintsR);
        		
        UserSignupUI.add(leftPanel,BorderLayout.EAST);
        UserSignupUI.add(rightPanel,BorderLayout.WEST);
        
        
       
        
       
        register.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 String userName= nameField.getText();
			        String userEmail= emailField.getText();
			        int userAge=Integer.parseInt( ageField.getText());
			        String userPass= passField.getText();
			        String userGen=(String) genField.getSelectedItem();
				 StoreOwner user= new StoreOwner(userName,userPass,userEmail,userGen,userAge);
			        Logs log = new Logs();
			        user.register(user, log);
			        System.out.println(user.getName()+" "+user.getEmail()+" "+user.getAge()+" "+user.getPassword()+" "+user.getGender()+"\n");
			        System.out.println(userGen);
				
			}
		});
       
	}
	
	public GUI()
	{
		
		home= new JFrame("Hello");
		home.setSize(1000, 1000);
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
		homeLoginPanel.setBounds(50,50,200,300);
		homeLoginPanel.add(UserLogIn,gbc);
		homeLoginPanel.add(AdminLogIn,gbc);
		homeLoginPanel.add(SOLogIn,gbc);
		homeLoginPanel.setVisible(true);
		homeSignupPanel= new JPanel();
		homeSignupPanel.setBounds(50,50,200,300);
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
				JOptionPane.showMessageDialog(null, "You Can't LogIn at the moment. You have wasted your trials","LoginMsg",JOptionPane.INFORMATION_MESSAGE);
				User user= new User();
				UserLogin(user);
			}

			
		});
		
		UserSignUp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				UserSignup();
				
			}
		});
		
		SOSignUp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SOSignup();
				
			}
		});
		
		
		

		
	}
	
	
	
	

	public static void main (String[] args)
	{
		new GUI();
	}
}
