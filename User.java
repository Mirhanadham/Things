package project;

import java.util.ArrayList;
import java.util.Scanner;

public class User extends PersonalInfo implements ILogin, IRegister {

	PersonalInfo personal;
	
	public User()
	{
		
	}
	
	@Override
	public void  register(Logs log)
	{
		System.out.println("Please enter your username");
		String name;
		Scanner sc = new Scanner(System.in); 
		name= sc.nextLine(); 

    
        System.out.println("Enter your password");
        String pw;
        pw= sc.nextLine(); 
        
         System.out.println("Enter your Email");
        String email;
		 email= sc.nextLine(); 

        
         System.out.println("Enter your Gender");
         String gender;
         gender = sc.nextLine(); 

        
         System.out.println("Enter your age");
         int age;
         age = sc.nextInt();
       
          personal=new PersonalInfo(name,pw,email,gender,age);
         log.users.add(personal);
         
         for(PersonalInfo i:log.users)
         {
        	 System.out.println(i);
         }
	
	}

	@Override
	public boolean login(Logs log) {
		
		System.out.println("Enter Admin Username or Email: ");
		Scanner sc= new Scanner(System.in);
		String name;
		name=sc.nextLine();
		
		System.out.println("Enter Admin Password: ");
		Scanner s= new Scanner(System.in);
		String pass;
		pass=s.nextLine();
		
		boolean v=false;
		boolean n=false;
		boolean p=false;
		for(PersonalInfo in:log.users)
		{
			if(((in.getName().contentEquals(name))||(in.getEmail().contentEquals(name)))&&(in.getPassword().contentEquals(pass)))
			{	
				n=true;
				p=true;
			}	
		}
		
		if ((n==true)&&(p==true))
		{
			System.out.println("you have been logged in successfull");
			v=true;
			return v;
		}
		else 
	{
		System.out.println("username or password is incorrect please enter again");
		int count=0;
		while ((count<=2) )
		{
			
			if((n==false)||(p==false))
			{
				System.out.println("Please enter your username or email");
				
				Scanner sn = new Scanner(System.in); 
				name = sn.nextLine(); 
				
			
				System.out.println("Please enter your password");
				Scanner sp = new Scanner(System.in);
				pass = sp.nextLine(); 
				
				for(PersonalInfo in:log.users)
				{
					if((in.getName().equals(name)||in.getEmail().equals(name))&&(in.getPassword().equals(pass)))
					{
						n=true;
						p=true;
					}
	
				}
				if ((n==true)&(p==true))
					break;
				System.out.println("username or password is incorrect please enter again");
				count++;
			}
		}
		if ((n==true)&(p==true))
		{
			System.out.println("you have been logged in successfull");
			v=true;
			return v;
		}
	else {
		
			System.out.println("Sorry you can't login as you've exceded the trial limit. You may try again later.\n");
			v=false	;
			return v;
	}
	}
	

}
}
