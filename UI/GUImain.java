package UI;

import java.awt.BorderLayout;
import java.awt.Font;
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

import Controllers.Admin_Controller;
import Controllers.Brand_Controller;
import Controllers.Cart_Controller;
import Controllers.Collaborater_Controller;
import Controllers.Product_Controller;
import Controllers.SO_Controller;
import Controllers.Stat_Controller;
import Controllers.Store_Controller;
import Controllers.User_Controller;
import Controllers.Verified_Controller;
import project.AdminStatistics;
import project.BrandFunctions;
import project.Cart;
import project.PersonalInfo;
import project.ProductInventory;
import project.Statistics;
import project.StoreFunctionalities;
import project.UserFunctionalities;
import project.UserType;

public class GUImain extends JFrame {
	private JLabel welcome;	
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
	SO_Controller storeOwnerCon;
	StoreFunctionalities storeFunc;
	Store_Controller storeCon;
	Cart_Controller cartCon;
	Verified_Controller verCon;
	Collaborater_Controller colCon;
	Statistics stat;
	Stat_Controller statCon;
	AdminStatistics ADStat;

	
	
	public GUImain()
	{
		this.stat=new Statistics ();
		this.ADStat= new AdminStatistics();
		this.statCon=new Stat_Controller(stat,ADStat);
		this.userFunc= new UserFunctionalities();
		this.colCon=new Collaborater_Controller(userFunc);
		this.userHandler= new User_Controller(userFunc);
		this.productIn= new ProductInventory();
		this.brandFunc= new BrandFunctions();
		this.storeFunc= new StoreFunctionalities();
		this.verCon=new Verified_Controller(storeFunc);
		this.brandCon= new Brand_Controller(brandFunc);
		this.podCon= new Product_Controller(productIn);
		this.adminCon= new Admin_Controller(podCon, brandCon,verCon,statCon);	
		this.storeCon= new Store_Controller(storeFunc,stat);
		this.cartCon= new Cart_Controller(storeCon);
		
		
		this.storeOwnerCon= new SO_Controller(podCon,brandCon,storeCon,colCon);
		
	
		
		
		
		this.setTitle("Home");
		this.setSize(1000,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		welcome= new JLabel("Welcome !!");
		welcome.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		
		
		
		LogIn= new JButton(" Log In");
		LogIn.setBounds(50,30, 30, 20);
		UserSignUp= new JButton("User Sign Up");
		UserSignUp.setBounds(50,30, 30, 20);
		
		
		JPanel pane= new JPanel(new GridBagLayout());
		GridBagConstraints constrains= new GridBagConstraints();
		constrains.anchor= GridBagConstraints.WEST;
		constrains.insets= new Insets(10,10,10,10);
		constrains.gridx=0;
		constrains.gridy=0;
		pane.add(LogIn,constrains);
		constrains.gridy=1;
		pane.add(UserSignUp,constrains);

		
		this.add(pane,BorderLayout.EAST);
		this.add(welcome,BorderLayout.WEST);
		this.setVisible(true);
		
		
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
						 System.out.println(user.getId());
						AdminUI admin= new AdminUI(adminCon,user);
						
					}
					else if (user.getType().equals(UserType.STOREOWNER))
					{
						 System.out.println(user.getId());
						// cartCon.addCart(user.getId());
						SOUI storeOwner= new SOUI(storeOwnerCon,user,cartCon,userFunc,stat);
					}
					else
					{
						 System.out.println(user.getId());
						 	if(user.isCollaborater())
						 	{
						 		//cartCon.addCart(user.getId());
						 		SOUI collab=new SOUI(storeOwnerCon,user,cartCon,userFunc,stat);
						 	}
						 	else
						 	{	//cartCon.addCart(user.getId());
						 		BuyerUI buyer= new BuyerUI(user,storeCon,cartCon);
						 	}
					}
				 				
				
			}
		});
	    
	    
		 
		
	}
	
	
	
	

	public static void main (String[] args)
	{
		new GUImain();
	}
}
