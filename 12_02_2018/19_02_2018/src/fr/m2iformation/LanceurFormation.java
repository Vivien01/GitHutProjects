package fr.m2iformation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LanceurFormation {

	public static void main(String[] args) {
		Map<Formation, Stagiaire>map = new HashMap<>();
		
		Formation cdi = new Formation("Concepteur Développeur Informatique");
		Stagiaire stagiaire = new Stagiaire("Sparrow", "Jack", 456);
		
		Formation dl = new Formation("Développeur Logiciel");
		Stagiaire stagiaire2 = new Stagiaire("Wayne", "Bruce", 123);
		
		map.put(cdi, stagiaire);
		map.put(dl, stagiaire2);
		
		Set<Formation> keys = map.keySet();
		for(Formation f : keys) {
			System.out.println(f + "" + map.get(f));
		}

	}
	
	

}
