package project;

import java.util.Date;

public class Brand implements IBrand {
	private String name;
	private String category;
	private String founder;
	private int id;
	
	public Brand(String name, String category, String founder)
	{
		this.name=name;
		this.category=category;
		this.founder=founder;
		this.id=0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
