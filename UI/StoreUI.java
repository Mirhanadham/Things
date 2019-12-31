package UI;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Controllers.SO_Controller;
import project.PersonalInfo;
import project.Statistics;
import project.UserFunctionalities;
import project.UserType;

public class StoreUI extends JFrame {
	int storeNum;
	PersonalInfo user;
	SO_Controller soCon;
	UserFunctionalities userFunc;
	Statistics stat;
	
	JButton addStoreProduct;
	JButton viewStatistics;
	JButton addOffer;
	JLabel offerName;
	JTextField offerNameField;
	JLabel offerPerc;
	JButton removeOffer;
	JTextField offerField;
	JPanel leftPane;
	JPanel rightPane;
	JButton viewMyprods;

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
		addOffer= new JButton("Add Store Offer");
		addOffer.setBounds(50,30,30,20);
		offerPerc= new JLabel("Offer %: ");
		offerField= new JTextField(15);
		offerName= new JLabel("Offer Name: ");
		offerNameField= new JTextField(15);
		removeOffer= new JButton("Remove Offer");
		removeOffer.setBounds(50,30,30,20);
		viewMyprods= new JButton("View My Store's Products");
		viewMyprods.setBounds(50,30,30,20);
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
		leftPane.add(viewMyprods,leftConstrains);
		leftConstrains.gridy=4;
		if(user.getType()==UserType.STOREOWNER)
		{
			leftPane.add(history,leftConstrains);
			leftConstrains.gridy=5;
			leftPane.add(undo,leftConstrains);
		}
		
		
		rightPane= new JPanel(new GridBagLayout());
		GridBagConstraints rightConstrains= new GridBagConstraints();
		rightConstrains.anchor=GridBagConstraints.WEST;
		rightConstrains.insets=new Insets(10, 10,10,10);
		rightConstrains.gridx=0;
		rightConstrains.gridy=0;
		rightPane.add(offerName,rightConstrains);
		rightConstrains.gridx=1;
		rightPane.add(offerNameField,rightConstrains);
		rightConstrains.gridx=0;
		rightConstrains.gridy=1;
		rightPane.add(offerPerc,rightConstrains);
		rightConstrains.gridx=1;
		rightPane.add(offerField,rightConstrains);
		rightConstrains.gridy=2;
		rightPane.add(addOffer,rightConstrains);
		rightConstrains.gridy=3;
		rightPane.add(removeOffer,rightConstrains);
		rightConstrains.gridy=4;
		rightPane.add(viewStatistics,rightConstrains);
		
		
		this.add(leftPane,BorderLayout.WEST);
		this.add(rightPane,BorderLayout.EAST);
		
		addProduct();
		addNewCol();
		removeItem();
		viewStatistics();
		addOffer();
		viewMyprods();
		removeOffer();
		viewHistory();
		undo();
		

		
		
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
				CollaboretoresUI addcol=new CollaboretoresUI(soCon,userFunc,storeOwnerID,storeNum);
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
	public void addOffer()
	{
		addOffer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				double perc= Double.parseDouble(offerField.getText())/100;
				String name=offerNameField.getText();
				boolean added = soCon.addStoreOffer(name, storeNum, perc);
				if(added==true)
				{
					JOptionPane.showMessageDialog(null, "Your offer was added successfully.","OfferMsg",JOptionPane.INFORMATION_MESSAGE);

				}
				else
				{
					JOptionPane.showMessageDialog(null, "You can't add an offer right now as you store already has an offer. Try removing the current offer and adding a new one.","OfferMsg",JOptionPane.INFORMATION_MESSAGE);

				}
				
			}
		});
	}
	public void removeOffer()
	{
		removeOffer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				boolean removed=soCon.removeStoreOffer(storeNum);
				if(removed==true)
				{
					JOptionPane.showMessageDialog(null, "Offer removed Successfully.","OfferMsg",JOptionPane.INFORMATION_MESSAGE);

				}
				else
				{
					JOptionPane.showMessageDialog(null, "There is no offer to remove.","OfferMsg",JOptionPane.INFORMATION_MESSAGE);

				}
				
			}
		});
	}
	public void viewMyprods()
	{
		viewMyprods.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				soCon.viewMyStoreProds(storeNum);
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
