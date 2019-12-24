package project;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreOwner extends PersonalInfo implements ILogin, IRegister {
	
	ArrayList<PersonalInfo> owners= new ArrayList<PersonalInfo>();

	ArrayList<Store> stores;
	
	public StoreOwner(String name, String pass, String email, String gen, int age) {
		this.setName(name);
		this.setAge(age);
		this.setEmail(email);
		this.setPassword(pass);
		this.setGender(gen);		
	}

	@Override
	public void register(Object obj,Logs log)
	{
		

         log.owners.add((StoreOwner) obj);
         
         for(PersonalInfo i:log.owners)
         {
        	 System.out.println(i);
         }
	
	}

	public void login(Object user,Logs log) {
		
		System.out.println("Enter Admin Username or Email: ");
		Scanner sc= new Scanner(System.in);
		String name;
		name=sc.nextLine();
		
		System.out.println("Enter Admin Password: ");
		Scanner s= new Scanner(System.in);
		String pass;
		pass=s.nextLine();
		

		boolean n=false;
		boolean p=false;
		for(PersonalInfo in:log.owners)
		{
			if((in.getName().contentEquals(name))||(in.getEmail().contentEquals(name)))
			{	
				n=true;
			}
			
			if(in.getPassword().contentEquals(pass))
			{
				p=true;
			}
			
				
		}
		
		System.out.println(n );
		System.out.println(p );
		
		if ((n==true)&&(p==true))
			System.out.println("you have been logged in successfull");
	else 
	{
		
		int count=0;
		while ((count<=2) )
		{
			System.out.println("username or password is incorrect please enter again");
			if((n==false)||(p==false))
			{
				System.out.println("Please enter your username or email");
				
				Scanner sn = new Scanner(System.in); 
				name = sn.nextLine(); 
				
			
				System.out.println("Please enter your password");
				Scanner sp = new Scanner(System.in);
				pass = sp.nextLine(); 
				
				for(PersonalInfo in:log.owners)
				{
					if(in.getName().equals(name)||in.getEmail().equals(name))
					{	n=true;
					}
					
					if(in.getPassword().equals(pass))
					{
						p=true;
					}
					
						
				}
				
				count++;
			}
		}
		if ((n==true)&(p==true))
			System.out.println("you have been logged in successfull");
		else 
			System.out.println("Sorry you can't login as you've exceded the trial limit. You may try again later.\n");
	}

}

	@Override
	public boolean login(String name, String pass, Logs log) {
		return false;
		// TODO Auto-generated method stub
		
	}
}
