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
import project.UserFunctionalities;

public class undoUI extends JFrame {

	JButton undo;
	JPanel leftPane;
	JTextField actionID;
	SO_Controller soCon;
	UserFunctionalities user;
	public undoUI(SO_Controller control,UserFunctionalities user)
	{
		this.soCon=control;
		this.user=user;
		undo= new JButton("Undo");
		undo.setBounds(50,30, 30, 20);
		actionID= new JTextField(15);
		
		this.setSize(1000,500);
		this.setVisible(true);
		this.setTitle("Undo Action");
		
		leftPane= new JPanel(new GridBagLayout());
		GridBagConstraints leftConstrains= new GridBagConstraints();
		leftConstrains.anchor=GridBagConstraints.WEST;
		leftConstrains.insets=new Insets(10, 10,10,10);
		leftConstrains.gridx=0;
		leftConstrains.gridy=0;
		leftPane.add(actionID,leftConstrains);
		
		leftConstrains.gridy=1;
		leftPane.add(undo,leftConstrains);
		this.add(leftPane,BorderLayout.CENTER);
		chooseStore();
	}
	public void chooseStore()
	{
		undo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int actionid= Integer.parseInt(actionID.getText());
				soCon.undoAction(actionid, user);
			}
		});
	}
}