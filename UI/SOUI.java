package UI;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controllers.Cart_Controller;
import Controllers.SO_Controller;
import project.Cart;
import project.PersonalInfo;
import project.Statistics;
import project.UserFunctionalities;
import project.UserType;

public class SOUI extends JFrame{
	SO_Controller soCon;
	PersonalInfo user;
	Cart_Controller cartCon;
	UserFunctionalities userFunc;
	Statistics stat;
	
	JButton addStore;
	JButton chooseStore;
	JTextField storeNo;
//	JButton viewStoreItems;
//	JButton addItemToCart;
//	JButton viewCart;
//	JButton checkOutOrder;
	
	JPanel leftPane;
	JPanel rightPane;
	JButton buyProducts;
	
	

	public SOUI(SO_Controller control, PersonalInfo info, Cart_Controller cartcontrol,UserFunctionalities userFunc,Statistics stat)
	{
		//soCon.viewStores();

		this.soCon=control;
		this.user=info;
		this.cartCon=cartcontrol;
		this.stat=stat;
		this.userFunc=userFunc;
		//cartCon.addCart(user.getId());
		soCon.viewStores(user.getId(), user.isCollaborater());
		this.setSize(1000,500);
		this.setVisible(true);
		this.setTitle("Store Owner");
		
		addStore= new JButton("Add Store");
		chooseStore= new JButton("Choose Store");
		addStore.setBounds(50,30, 30, 20);
		chooseStore.setBounds(50,30, 30, 20);
		buyProducts= new JButton("Become a Buyer");
		buyProducts.setBounds(50,30,30,20);
		storeNo= new JTextField(15);
		
		
		leftPane= new JPanel(new GridBagLayout());
		GridBagConstraints leftConstrains= new GridBagConstraints();
		leftConstrains.anchor=GridBagConstraints.WEST;
		leftConstrains.insets=new Insets(10, 10,10,10);
		leftConstrains.gridx=0;
		leftConstrains.gridy=0;
		leftPane.add(storeNo,leftConstrains);
		leftConstrains.gridy=1;
		leftPane.add(chooseStore,leftConstrains);
		if(user.getType()==UserType.STOREOWNER)
		{
			leftConstrains.gridy=2;
			leftPane.add(addStore,leftConstrains);
		}
		
		rightPane= new JPanel(new GridBagLayout());
		GridBagConstraints rightConstrains= new GridBagConstraints();
		rightConstrains.anchor=GridBagConstraints.WEST;
		rightConstrains.insets=new Insets(10, 10,10,10);
		rightConstrains.gridx=0;
		rightConstrains.gridy=0;
		rightPane.add(buyProducts,rightConstrains);	
		this.add(leftPane,BorderLayout.WEST);
		this.add(rightPane,BorderLayout.EAST);
		
		
		
		chooseStore();
		becomeBuyer();
		addstore();
	}
	public void addstore()
	{
		addStore.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int storeOwnerID=user.getId();
				AddStoreUI addstore=new AddStoreUI(soCon,storeOwnerID);
			}
		});
		
	}
	
	public void chooseStore()
	{
		chooseStore.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int storeNum= Integer.parseInt(storeNo.getText());
				StoreUI storeUI= new StoreUI(storeNum,soCon,user,userFunc,stat);
			}
		});
	}
	
	public void becomeBuyer()
	{
		buyProducts.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new BuyerUI(user,soCon.storeCon,cartCon);
				
			}
		});
	}
}
