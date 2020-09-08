package poo1;

import poo1.models.Group;
import poo1.models.Organisation;
import poo1.models.User;

public class Tests {

	public static void main(String[] args) {
		Organisation o=new Organisation("Sainte Ursule");
		Group g= new Group("Slam",o);
		User u = new User("Michou",g);
		
		try{
			
		u.setPassword("azerty", "azerty");
		System.out.println(u);
		u.setPassword("az", "azerty");
		System.out.println(u);
		}catch (Exception e) {
			System.out.println("Mauvais mot de passe");
		}
		
		
		
		u.setGroupe(g);
		u.setLogin("Bernard");
		
		User i=new User("1234",g);
		i.setLogin("Roger");
		System.out.println(i);
		System.out.println(u);
		
		System.out.println();
	}

}
