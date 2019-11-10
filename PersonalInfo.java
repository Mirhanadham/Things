package project;

import java.io.Serializable;

public class PersonalInfo implements Serializable{
	
    private String name;
	private String password;
	private String email;
	private String gender;
	private int age ;
	
	public PersonalInfo()
	{
		
	}
 	public PersonalInfo(String N,String pw, String EM,  String G,int a){
		this.name=N;
		this.password=pw;
		this.email=EM;
		this.gender=G;
		this.age=a ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	@Override
	public String toString()
	{
		return "Name: "+this.getName()+"\n"+"Age: "+this.getAge()+"\n"+"Email: "+this.getEmail()+"\n"+"Password: "+this.getPassword()+"\n"+"Gender: "+this.getGender()+"\n";
	

	}
	
}