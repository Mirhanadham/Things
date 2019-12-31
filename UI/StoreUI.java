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
import javax.swing.JTextArea;

import Controllers.SO_Controller;
import project.PersonalInfo;
import project.Statistics;
import project.UserFunctionalities;

public class StoreUI extends JFrame {
	int storeNum;
	PersonalInfo user;
	SO_Controller soCon;
	UserFunctionalities userFunc;
	Statistics stat;
	
	JButton addStoreProduct;
	JButton viewStatistics;
	JPanel leftPane;
	JPanel rightPane;

	JButton removeItem;
	JButton addCollab;
	JButton history;
	JButton undo;
	
	
	public StoreUI(int num, SO_Controller control,PersonalInfo owner,UserFunctionalities userfuncs,Statistics stats)
	{
		this.storeNum=num;
		this.soCon=control;
		this.user=owner;
		this.userFunc=userfuncs;
		this.stat=stats;
		this.setTitle("Store");
		this.setSize(1000,500);
		this.setVisible(true);
		
		
		
		addStoreProduct= new JButton("Add Product To Store");
		addStoreProduct.setBounds(50,30,30,20);
		viewStatistics= new JButton("Show Statistics");
		viewStatistics.setBounds(50,30,30,20);
		removeItem= new JButton("Remove Store Product");
		removeItem.setBounds(50,30,30,20);
		addCollab= new JButton("Add Collaborator");
		addCollab.setBounds(50,30,30,20);
		history= new JButton("Store History");
		history.setBounds(50,30,30,20);
		undo= new JButton("Undo action");
		undo.setBounds(50,30,30,20);
		
		
		leftPane= new JPanel(new GridBagLayout());
		GridBagConstraints leftConstrains= new GridBagConstraints();
		leftConstrains.anchor=GridBagConstraints.CENTER;
		leftConstrains.insets=new Insets(10, 10,10,10);
		leftConstrains.gridx=0;
		leftConstrains.gridy=0;
		leftPane.add(addStoreProduct,leftConstrains);
		leftConstrains.gridy=1;
		leftPane.add(removeItem,leftConstrains);
		leftConstrains.gridy=2;
		leftPane.add(addCollab,leftConstrains);
		leftConstrains.gridy=3;
		leftPane.add(history,leftConstrains);
		leftConstrains.gridy=4;
		leftPane.add(undo,leftConstrains);
		
		rightPane= new JPanel(new GridBagLayout());
		GridBagConstraints rightConstrains= new GridBagConstraints();
		rightConstrains.anchor=GridBagConstraints.WEST;
		rightConstrains.insets=new Insets(10, 10,10,10);
		rightConstrains.gridx=0;
		rightConstrains.gridy=0;
		rightPane.add(viewStatistics,rightConstrains);
		
		
		
		this.add(leftPane,BorderLayout.WEST);
		this.add(rightPane,BorderLayout.EAST);
		
		addProduct();
		addNewCol();
		viewStatistics();
		viewHistory();
		undo();
		removeItem();
		
		
	}
	public void addProduct()
	{
	addStoreProduct.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AddStoreItemUI additem= new AddStoreItemUI(soCon, user, storeNum);
				additem.additem();
				
			}
		});
	}
	
	public void addNewCol()
	{
		addCollab.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int storeOwnerID=user.getId();
				CollaboretoresUI addcol=new CollaboretoresUI(soCon,userFunc,storeOwnerID);
			}
		});
		
	
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

	public void viewStatistics()
	{
		viewStatistics.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StatisticsUI sta=new StatisticsUI(soCon,stat);
			}
		});
	}

	public void viewHistory()
	{
		history.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				soCon.history(storeNum);
			}
		});
	}

	public void undo()
	{
		undo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				undoUI undo =new undoUI(soCon,userFunc);
			}
		});
	}

}
