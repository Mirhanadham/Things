package project;

import project.PersonalInfo;
import project.UserType;
import java.util.ArrayList;
import java.util.Scanner;


public class UserFunctionalities {
	ArrayList<PersonalInfo> users;
	
	public UserFunctionalities()
	{
		users= new ArrayList<PersonalInfo>();
		
		User storeOwner= new User("Hanem","hanem123","hanemamgad@gmail.com","female",20,UserType.STOREOWNER);
		register(storeOwner);
		
		User admin2= new User("Mirhan","mirhan123","mirhan@gmail.com","female",20,UserType.ADMIN);
		register(admin2);
		
		User admin3= new User("Hager","hager123","hager@gmail.com","female",20,UserType.ADMIN);
		register(admin3);
		
		User buyer= new User("hanem","hanem1234","hanem@gmail.com","female",20,UserType.BUYER);
		register(buyer);
	}
	
	public void register(PersonalInfo user)
	{
		user.setId(users.size());
		users.add(user);
	}
	
	
	
	public PersonalInfo login(String name, String pass)
	{
		
		for (PersonalInfo us:users)
		{
			if (((us.getEmail().equals(name)) || (us.getName().equals(name)))&& us.getPassword().equals(pass))
			{
				return us;
			}
			

				
		}
		return null;
	}
	

	
}
