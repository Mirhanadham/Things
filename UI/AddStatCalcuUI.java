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
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controllers.Admin_Controller;

public class AddStatCalcuUI extends JFrame{


	Admin_Controller adminCon;
	int map;
	public AddStatCalcuUI(Admin_Controller adminControl,int mapNO) {

		
		this.adminCon=adminCon;
		this.map=mapNO;
		
		
		
		JButton max= new JButton("Maximum");
		max.setBounds(50,30, 30, 20);
		
		JButton min= new JButton("Minimun");
		min.setBounds(50,30, 30, 20);
	
		
		JButton Average= new JButton("Average");
		Average.setBounds(50,30, 30, 20);

	
		
		
		JPanel leftPanel= new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
	    constraints.anchor = GridBagConstraints.WEST;
	    constraints.insets = new Insets(10, 10, 10, 10);
	    constraints.gridx = 0;
	    constraints.gridy = 0;    
	   
	    leftPanel.add(max,constraints);
	    this.add(leftPanel);
	    this.setSize(1000,500);
	    this.setVisible(true);
	    this.add(max,BorderLayout.WEST);
	    leftPanel.add(min,constraints);
	    this.add(leftPanel);
	    this.setSize(1000,500);
	    this.setVisible(true);
	    this.add(min,BorderLayout.CENTER);
	    leftPanel.add(Average,constraints);
	    this.add(leftPanel);
	    this.setSize(1000,500);
	    this.setVisible(true);
	    this.add(Average,BorderLayout.EAST);
	    max.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				adminCon.max(map);
				
			}
		});
	    
	    min.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				adminCon.min(map);
			}
		});
	    
	    Average.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				adminCon.avg(map);
			}
		});
	    
	
	}

}
