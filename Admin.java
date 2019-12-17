package project;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Admin extends PersonalInfo implements ILogin,IRegister{
	
	

	
	public Admin()
	{
		
	}
	
	@Override
	public void register(Logs log)
	{
		System.out.println("Please enter your username: ");
		String name;
		Scanner sc = new Scanner(System.in); 
		name= sc.nextLine();
		this.setName(name);

    
        System.out.println("Enter your password");
        String pw;
        pw= sc.nextLine();
        this.setPassword(pw);
        
         System.out.println("Enter your Email");
        String email;
		 email= sc.nextLine(); 
		this.setEmail(email);
        
         System.out.println("Enter your Gender");
         String gender;
         gender = sc.nextLine(); 
		this.setGender(gender);
        
         System.out.println("Enter your age");
         int age;
         age = sc.nextInt();
         this.setAge(age);
       

         log.admins.add(this);
         
         for(PersonalInfo i:log.admins)
         {
        	 System.out.println(i);
         }
	
	}

	@Override
	public void login(Logs log) {
		
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
		for(PersonalInfo in:log.admins)
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
			while (count<=2 )
			{
				
				System.out.println("username or password is incorrect please enter again");
				if((n==false)||(p==false))
				{
					System.out.println("Please enter your username or email");
					String nam,pw;
					Scanner sn = new Scanner(System.in); 
					nam = sn.nextLine(); 
					
				
					System.out.println("Please enter your password");
					Scanner sp = new Scanner(System.in);
					pw = sp.nextLine(); 
					
					for(PersonalInfo in:log.admins)
					{
						if(in.getName().equals(nam)||in.getEmail().equals(nam))
						{	
							n=true;
						}
						
						if(in.getPassword().equals(pw))
						{
							p=true;
						}
						
							
					}
					
					
					
				}
				count++;
			}
			if ((n==true)&&(p==true))
				System.out.println("you have been logged in successfully.");
			else 
				System.out.println("Sorry you can't login as you've exceded the trial limit. You may try again later.\n");
		}
		
		/*if((n==true) && (p==true))
		{
			System.out.println("You have been logged in successfully.\n");
		}
		else
		{
			
			while(count<=2)
			{
				System.out.println("Username or Password is incorrect.\n");
				if((n==false)||(p==false))
				{
				System.out.println("Enter Admin Username or Email: ");
				Scanner sn= new Scanner(System.in);
				name=sn.nextLine();
				
				System.out.println("Enter Admin Password: ");
				Scanner sp= new Scanner(System.in);
				pass=sp.nextLine();
				
				for(PersonalInfo in:info)
				{
					if(in.getName()==name||in.getEmail()==name)
						n=true;
					if(in.getPassword()==pass)
						p=true;
						
				}

				}
				
				count++;

			}
			if((n==true) && (p==true))
			{
				System.out.println("You've been logged in Successfully.\n");
			}
			else
				System.out.println("Sorry you can't login as you've exceded the trial limit. You may try again later.\n");
		}*/
		
	}
	
	public void addProductToSystem(Inventory in) 
	{
		String name,brand,category,description;
		int rate=0;
		double price;
		System.out.println("Enter Product name: ");
		Scanner sc= new Scanner(System.in);
		name=sc.nextLine();
		
		System.out.println("Enter Product brand: ");
		brand=sc.nextLine();
		
		System.out.println("Enter Product category: ");
		category=sc.nextLine();
		
		System.out.println("Enter Product description: ");
		description=sc.nextLine();
		
		System.out.println("Enter Product price: ");
		price=sc.nextDouble();
		
		ProductSpec spec= new ProductSpec(name,brand,price,category,description,rate);
		in.addProductToSystem(spec);
		
		
		
		
	}
	
	public void addBrandToSystem(Inventory in)
	{
		String name, category, founder;
		Date date;
		
		Scanner sc= new Scanner(System.in);
		
	
		
	}
	
	public static void main(String[] args)
	{
		Inventory in= new Inventory();
		Logs log = new Logs();
		Admin ad= new Admin();
		ad.register(log);
		ad.login(log);
		
		ad.addProductToSystem(in);
		
	}

	
}
