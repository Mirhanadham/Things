package project;

public class User_Controller {
	UserFunctionalities userfuncs;
	
	public User_Controller(UserFunctionalities funs)
	{
		this.userfuncs=funs;
	}
	
	
	public PersonalInfo loginHadler(String name, String pass)
	{
		PersonalInfo user= userfuncs.login(name, pass);
		return user;
	}
	
	public void registrationHandler(String name, String pass, String email, String gender, int age, UserType type)
	{
		
		User user= new User(name, pass, email, gender, age, type);

		userfuncs.register(user);
	}
}
