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

import Controllers.SO_Controller;
import project.PersonalInfo;
import project.Statistics;
import project.UserFunctionalities;

public class SOUI extends JFrame{
	SO_Controller soCon;
	PersonalInfo user;
	UserFunctionalities userFunc;
	Statistics stat;
	JButton addStore;
	JButton chooseStore;
	JButton viewStatistics;
	JButton addCol;
	JButton removeItem;
	JButton addItem;

	JTextField storeNo;
	
	
	JPanel leftPane;
	JPanel rightPane;

	public SOUI(SO_Controller control, UserFunctionalities userFunc, PersonalInfo info,Statistics stat)
	{
		//soCon.viewStores();
		this.soCon=control;
		this.user=info;
		this.stat=stat;
		this.userFunc=userFunc;
		this.setSize(1000,500);
		this.setVisible(true);
		this.setTitle("Store Owner");
		
		addStore= new JButton("Add Store");
		
		chooseStore= new JButton("Choose Store");
		removeItem= new JButton("Remove item");
		addItem= new JButton("add item");
		viewStatistics= new JButton("view store statistics");
		addCol= new JButton("Add store collaboraters");
		addStore.setBounds(50,30, 30, 20);
		chooseStore.setBounds(50,30, 30, 20);
		viewStatistics.setBounds(50,30, 30, 20);
		addCol.setBounds(50,30, 30, 20);
		removeItem.setBounds(50,30, 30, 20);
		addItem.setBounds(50,30, 30, 20);
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
		leftPane.add(viewStatistics,leftConstrains);
		leftPane.add(addCol,leftConstrains);
		
		rightPane= new JPanel(new GridBagLayout());
		GridBagConstraints rightConstrains= new GridBagConstraints();
		rightConstrains.anchor=GridBagConstraints.WEST;
		rightConstrains.insets=new Insets(10, 10,10,10);
		rightConstrains.gridx=0;
		rightConstrains.gridy=0;
		rightPane.add(addStore,rightConstrains);
		rightPane.add(removeItem,rightConstrains);
		
	
		this.add(leftPane,BorderLayout.WEST);
		this.add(rightPane,BorderLayout.EAST);
		
		chooseStore();
		addstore();
		addNewCol();
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
	public void addNewCol()
	{
		addCol.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int storeOwnerID=user.getId();
				CollaboretoresUI addcol=new CollaboretoresUI(soCon,userFunc,storeOwnerID);
			}
		});
		removeItem= new JButton("Remove item");
		addItem= new JButton("add item");
		viewStatistics= new JButton("view store statistics");
	
	}
	public void removeItem()
	{
		removeItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			RemoveItemUI remove=new RemoveItemUI(soCon);
			}
		});
	}
	public void addItem()
	{
		addItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int storeOwnerID=user.getId();
				AddItemUI add=new AddItemUI(soCon,storeOwnerID);
			}
		});
	}
	public void viewStatistics()
	{
		viewStatistics.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StatisticsUI sta=new StatisticsUI(soCon,stat);
			}
		});
	}
}
