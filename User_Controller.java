package project;

public class User_Controller {
	public User user;
	public Logs logs;
	public User_Controller()
	{
		logs = new Logs();
	}
	
	public void loging()
	{
		
	}
	
	public void register(String name, String pass, String email, String gender, int age)
	{
		 user= new User(name,pass,email,gender,age);
		 user.register(gender, log);
	}
	

}
