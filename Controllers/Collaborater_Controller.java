package Controllers;

import java.util.ArrayList;

import UI.DisplayUsers;
import project.Collaboratores;
import project.PersonalInfo;
import project.UserFunctionalities;

public class Collaborater_Controller {
	
	UserFunctionalities userFun;
	
	public Collaborater_Controller(UserFunctionalities userFunc) {
	
		// TODO Auto-generated constructor stub
		this.userFun=userFunc;
		
	}

	public void listUsers()
	{
		DisplayUsers diplay=new DisplayUsers(userFun);
	}
	
}