package poo1.models;

import java.util.ArrayList;
import java.util.List;

public class Organisation {

	private String name;
	
	private List<User> users;
	
	private List<Group> groups;
	
	public Organisation(String name){
		this.name = name;
		users = new ArrayList<User>();
		groups = new ArrayList<Group>();
	
	}
	
	public void setName(String name){
		
		this.name=name;
		
	}
	
	public String getName(){
		
		return this.name;
	}
	
	public String toString() {
		return name;
	}
	
}
