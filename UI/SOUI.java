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

public class SOUI extends JFrame{
	SO_Controller soCon;
	PersonalInfo user;
	JButton addStore;
	JButton chooseStore;
	JTextField storeNo;
	
	JPanel leftPane;
	JPanel rightPane;

	public SOUI(SO_Controller control, PersonalInfo info)
	{
		//soCon.viewStores();
		this.soCon=control;
		this.user=info;
		this.setSize(1000,500);
		this.setVisible(true);
		this.setTitle("Store Owner");
		
		addStore= new JButton("Add Store");
		chooseStore= new JButton("Choose Store");
		addStore.setBounds(50,30, 30, 20);
		chooseStore.setBounds(50,30, 30, 20);
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
		
		rightPane= new JPanel(new GridBagLayout());
		GridBagConstraints rightConstrains= new GridBagConstraints();
		rightConstrains.anchor=GridBagConstraints.WEST;
		rightConstrains.insets=new Insets(10, 10,10,10);
		rightConstrains.gridx=0;
		rightConstrains.gridy=0;
		rightPane.add(addStore,rightConstrains);
	
		
		this.add(leftPane,BorderLayout.WEST);
		this.add(rightPane,BorderLayout.EAST);
		
		chooseStore();
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
}
