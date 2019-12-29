package UI;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import project.BrandFunctions;
import project.IBrand;
import project.PersonalInfo;
import project.UserFunctionalities;

public class DisplayUsers extends JFrame {
	UserFunctionalities userFun;
	
	public DisplayUsers( UserFunctionalities userFun)
	{
		this.userFun=userFun;
		ArrayList<PersonalInfo> users=userFun.getUsers();
		JTextArea display = new JTextArea();
		
		
		for(PersonalInfo info:users)
		{
			display.append("Email:"+info.getEmail()+ " Name: "+info.getName()+" Age:"+info.getAge()+" Gender: "+info.getGender()+"\n");
		}
		this.add(display);
		this.setSize(1000,500);
		this.setTitle("Brands List");
		this.setVisible(true);
	}
	

	public static void main(String []args)
	{
		BrandFunctions funs= new BrandFunctions();
		new DisplayBrands(funs);
	}
}


