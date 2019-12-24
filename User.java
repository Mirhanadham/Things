package project;

import java.util.ArrayList;
import java.util.Scanner;

public class User extends PersonalInfo {


	
	public User(String name, String pass, String email, String gender, int age, int id, Type type)
	{
		this.setName(name);
		this.setEmail(email);
		this.setPassword(pass);
		this.setAge(age);
		this.setGender(gender);	
		this.setId(id);
		this.setType(type);
	}


	public User() {
		
	}


//	@Override
//	public void register(Object user,Logs log)
//	{
//
//         log.users.add((User) user);
//         
//         for(PersonalInfo i:log.users)
//         {
//        	 System.out.println(i);
//         }
//	
//	}
//
//	@Override
//	public boolean login(String name,String pass,Logs log) {
//		
//		
//		
//
//		boolean n=false;
//		boolean p=false;
//		
//		boolean correct=true;
//		for(User in:log.users)
//		{
//			if((in.getName().contentEquals(name))||(in.getEmail().contentEquals(name)))
//			{	
//				n=true;
//			}
//			
//			if(in.getPassword().contentEquals(pass))
//			{
//				p=true;
//			}
//			
//				
//		}
//		
//	
//		if (n==true && p==true)
//			correct=true;
//		else
//			correct= false;
//		
//		return correct;
//		
//		
//	
//
//}



}
