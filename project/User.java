package project;

import java.util.ArrayList;
import java.util.Scanner;

public class User implements PersonalInfo {

	private String name;
	private String password;
	private String email;
	private String gender;
	private int age ;
	private int id;
	private UserType type;
	private boolean firstOrder;
	private boolean collaborater;
	
	public User(String name, String pass, String email, String gender, int age, UserType type)
	{
		this.setName(name);
		this.setEmail(email);
		this.setPassword(pass);
		this.setAge(age);
		this.setGender(gender);	
		this.setId(0);
		this.setType(type);
		this.setFirstOrder(true);
		this.setCollaborater(false);
		
	}


	public User() {
		
	}


	@Override
	public String getName() {
		return name;
	}


	@Override
	public void setName(String name) {
		this.name=name;
	}


	@Override
	public String getPassword() {
		return password;
	}


	@Override
	public void setPassword(String password) {
		this.password=password;
	}


	@Override
	public String getEmail() {
		return email;
	}


	@Override
	public void setEmail(String email) {
		this.email=email;
	}


	@Override
	public String getGender() {
		return gender;
	}


	@Override
	public void setGender(String gender) {
		this.gender=gender;
	}


	@Override
	public int getAge() {
		return age;
	}


	@Override
	public void setAge(int age) {
		this.age=age;
	}


	@Override
	public int getId() {
		return id;
	}


	@Override
	public void setId(int id) {
		this.id=id;
	}


	@Override
	public UserType getType() {
		return type;
	}


	@Override
	public void setType(UserType type) {
		this.type=type;
	}


	@Override
	public boolean getFirtsOrder() {
		return firstOrder;
	}


	@Override
	public void setFirstOrder(boolean firstOrder) {
		this.firstOrder=firstOrder;
		
	}


	@Override
	public boolean isCollaborater() {
		return collaborater;
	}


	@Override
	public void setCollaborater(boolean collaborater) {
		this.collaborater=collaborater;
		
	}





}
