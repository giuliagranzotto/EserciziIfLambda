/*1 Creare una classe User con due proprieta’ nome e  ruolo.  Costruttore , getter e setter e  metodo toString
2 Creare lista users con 5 user due con ruolo “admin “ e tre con ruolo “member”
3 Voglio creare due liste una con gli admin e l’altra con i member
4 Stampare a video il loro contenuto
Indicazione:
list->stream->filter(user.getRuolo.equals”admin/member”->collect(Collect.toList()*/


package it.betacom.iflambda;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Esercizio2 {

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<User>(); 		
		User user; 		 		
		user = new User("Paolo", "admin"); 		
		users.add(user); 		
		user = new User("Luigi", "member"); 		
		users.add(user); 		
		user = new User("Luca", "member"); 		
		users.add(user); 		
		user = new User("Andrea", "admin"); 		
		users.add(user); 		
		user = new User("Marco", "member"); 		
		users.add(user); 		 		 		
		ArrayList<User> admins = new ArrayList<User>(); 		
		ArrayList<User> members = new ArrayList<User>(); 		 		
		admins = (ArrayList<User>) users.stream().filter((s)->s.getRuolo().equals("admin")).collect(Collectors.toList()); 		
		members = (ArrayList<User>) users.stream().filter((s)->s.getRuolo().equals("member")).collect(Collectors.toList()); 		 		
		System.out.println(admins); 		
		System.out.println(members);

	}

}
