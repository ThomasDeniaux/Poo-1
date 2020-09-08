package poo1.models;

import poo1.exception.BadPasswordException;

public class User {
	private String login;
	private String password;
	private Group groupe;
	
	public User(String login, Group group){
		
		this.login=login;
		this.groupe= group;
		
	}
	
	public User(Group groupe){
		this("no login",groupe);
	}
	
	public Group getGroupe() {
		return groupe;
	}

	public void setGroupe(Group groupe) {
		this.groupe = groupe;
	}
	public String getLogin(){
		return this.login;
	}
	
	
	public void setLogin(String login){
		this.login=login;	
	}
	public void setPassword(String password, String conf) throws Exception{
		if(password.equals(this.password)||!password.equals(conf)){
			throw new BadPasswordException("bad new password");}
		
		else this.password=password;
		
		}
	
	public Organisation getOrga(){
		
		return groupe.getOrg();
	}
	
	public String toString(){
		if (this.groupe!=null) {
			return login+"("+groupe+")";
		}
		else return login;
	}

	
}
