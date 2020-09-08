package poo1.models;

import java.util.ArrayList;
import java.util.List;


public class Group {
	
	private String name;
	private List<User> users;
	private Organisation organisation;
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Group(Organisation orga){
		this("", orga );
	}
	
	public Group(String name, Organisation organisation){
		this.name=name;
		this.organisation= organisation;
		users=new ArrayList<User>(); //Creation de listes vides
	}
		
	public String toString(){
		return name;
	}
	
	public List<User> getUsers(){
		return users;
	}
	
	
	public Organisation getOrg(){
		
		return this.organisation;
	}
	
	public void addUsers(User u){
		u.setGroupe(this);
		users.add(u);
		
	}

}
