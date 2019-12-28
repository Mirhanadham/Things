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
		
		User admin1= new User("Hanem","hanem123","hanemamgad@gmail.com","female",20,UserType.STOREOWNER);
		register(admin1);
		
		User admin2= new User("Mirhan","mirhan123","mirhan@gmail.com","female",20,UserType.ADMIN);
		register(admin2);
		
		User admin3= new User("Hager","hager123","hager@gmail.com","female",20,UserType.ADMIN);
		register(admin3);
		
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
	

	public static void main(String [] args)
	{
		UserFunctionalities fun= new UserFunctionalities();

		User us= new User("Mirhan","mirhan123","mirhan2@gmail.com","female",20,UserType.ADMIN);
		fun.register(us);
		System.out.println(us.getName()+" "+us.getEmail()+" "+us.getAge()+" "+us.getGender()+" "+us.getPassword()+" "+us.getId()+" ");
		System.out.println("enter email or name:");
		Scanner in= new Scanner(System.in);
		String name= in.nextLine();
		System.out.println("enter pass:");
		String pass= in.nextLine();
		PersonalInfo us2 = fun.login(name, pass);
		System.out.println(us2.getName()+" "+us2.getEmail()+" "+us2.getAge()+" "+us2.getGender()+" "+us2.getPassword()+" "+us2.getId()+" ");
		
	}
}
