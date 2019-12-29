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

public class SOUI extends JFrame{
	SO_Controller soCon;
	PersonalInfo user;
	Cart_Controller cartCon;
	
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
	
	

	public SOUI(SO_Controller control, PersonalInfo info, Cart_Controller cartcontrol)
	{
		//soCon.viewStores();
		this.soCon=control;
		this.user=info;
		this.cartCon=cartcontrol;
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
//		viewStoreItems=new JButton("View Stores Products");
//		viewStoreItems.setBounds(50,30,30,20);
//		addItemToCart=new JButton("Add Item To Cart");
//		addItemToCart.setBounds(50,30,30,20);
//		viewCart= new JButton("View Cart Items");
//		viewCart.setBounds(50,30,30,20);
//		checkOutOrder=new JButton("Check Out Cart");
//		checkOutOrder.setBounds(50,30,30,20);
		
		
		leftPane= new JPanel(new GridBagLayout());
		GridBagConstraints leftConstrains= new GridBagConstraints();
		leftConstrains.anchor=GridBagConstraints.WEST;
		leftConstrains.insets=new Insets(10, 10,10,10);
		leftConstrains.gridx=0;
		leftConstrains.gridy=0;
		leftPane.add(storeNo,leftConstrains);
		leftConstrains.gridy=1;
		leftPane.add(chooseStore,leftConstrains);
		leftConstrains.gridy=2;
		leftPane.add(addStore,leftConstrains);
		
		rightPane= new JPanel(new GridBagLayout());
		GridBagConstraints rightConstrains= new GridBagConstraints();
		rightConstrains.anchor=GridBagConstraints.WEST;
		rightConstrains.insets=new Insets(10, 10,10,10);
		rightConstrains.gridx=0;
		rightConstrains.gridy=0;
		rightPane.add(buyProducts,rightConstrains);
//		rightPane.add(viewStoreItems,rightConstrains);
//		rightConstrains.gridy=1;
//		rightPane.add(addItemToCart,rightConstrains);
//		rightConstrains.gridy=2;
//		rightPane.add(viewCart,rightConstrains);
//		rightConstrains.gridy=3;
//		rightPane.add(checkOutOrder,rightConstrains);
	
		
		this.add(leftPane,BorderLayout.WEST);
		this.add(rightPane,BorderLayout.EAST);
		cartCon.addCart(user.getId());
		
		chooseStore();
		becomeBuyer();
	}
	
	public void chooseStore()
	{
		chooseStore.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int storeNum= Integer.parseInt(storeNo.getText());
				StoreUI storeUI= new StoreUI(storeNum,soCon,user);
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
