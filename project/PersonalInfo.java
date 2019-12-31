package project;


public  interface PersonalInfo {
	
     boolean getFirtsOrder();
     void setFirstOrder(boolean firstOrder);
     
	 String getName() ;
	 void setName(String name);
	
	 String getPassword();
	 void setPassword(String password) ;
	
	 String getEmail() ;
	 void setEmail(String email);
	
	 String getGender() ;
	 void setGender(String gender) ;
	
	 int getAge() ;
	 void setAge(int age) ;
	

	 int getId() ;
	 void setId(int id) ;

	 UserType getType() ;
	 void setType(UserType type);
	 
	 boolean isCollaborater() ;
	 void setCollaborater(boolean collaborater) ;
	
}