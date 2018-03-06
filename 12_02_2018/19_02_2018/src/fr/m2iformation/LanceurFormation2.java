package fr.m2iformation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LanceurFormation2 {

	public static void main(String[] args) {
		
		Map<Formation, List<Stagiaire>>map = new HashMap<>();
		
		Formation cdi = new Formation("Concepteur Développeur Informatique");
		Stagiaire stagiaire1 = new Stagiaire("Sparrow", "Jack", 456);
		Stagiaire stagiaire2 = new Stagiaire("Wayne", "Bruce", 123);
		List<Stagiaire>liste1 = new ArrayList<>();
		Collections.addAll(liste1, stagiaire1, stagiaire2);
		
		map.put(cdi, liste1);
		
		Formation dl = new Formation("Développeur Logiciel");
		map.put(dl, new ArrayList<>());
		Stagiaire stagiaire3 = new Stagiaire("Parker", "Peter", 26);
		Stagiaire stagiaire4 = new Stagiaire("Banner", "Bruce", 28);
		Collections.addAll(map.get(dl), stagiaire3, stagiaire4);
		
		for(Formation f : map.keySet()) {
			System.out.print(f);
			for(Stagiaire sta : map.get(f)) {
				System.out.print(sta);
			}
			
		}
		
//		for(Formation f : map.keySet()) {
//			for(Stagiaire sta : map.get(f)) {
//				System.out.println(sta.getPrenom());
//			}
//		}
		
		
		

	}
	
	

}
