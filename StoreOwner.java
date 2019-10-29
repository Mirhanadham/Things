package sw;

import java.io.IOException;
import java.util.Scanner;

public class StoreOwner extends PersonalInfo implements Ilogin , IRegister  {

	static String sourcedir = System.getProperty("C:\\Users\\lenovo\\Desktop\\StoreOwner.txt");
	
	public static void login (String username,String password) throws IOException
	{
		boolean N;
		boolean P;

		N=file.find(sourcedir,username);
		P=file.find(sourcedir,password);
	
		if ((N==true)&&(P==true))
				System.out.println("you have been logged in successfull");
		else 
		{
			
			int count=0;
			while ((count<=2) )
			{
				System.out.println("username or password is incorrect please enter again");
				if((N==false)||(P==false))
				{
					System.out.println("Please enter your username or email");
					String Name; 
					Scanner sc = new Scanner(System.in); 
					Name = sc.nextLine(); 
					N=file.find(sourcedir,Name);
				
					System.out.println("Please enter your password");
					String pw; 
					Scanner s = new Scanner(System.in);
					pw = s.nextLine(); 
					P=file.find(sourcedir,pw);
					count++;
				}
			}
			if ((N==true)&(P==true))
				System.out.println("you have been logged in successfull");
			else 
				System.out.println("you have exceded your limit of entries ,Account does not exist");

		}
	}
}
