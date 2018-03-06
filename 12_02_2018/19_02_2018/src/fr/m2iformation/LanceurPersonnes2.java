package fr.m2iformation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LanceurPersonnes2 {

	public static void main(String[] args) {
		Personne bach = new Personne("Bach", "Johan", 45);
		Personne bach2 = new Personne("Bach", "Sebastian", 32);
		Personne bach3 = new Personne("Bach", "Sebastian", 96);
		Personne beet = new Personne("Beethoven", "Ludwig", 30);
		Personne beet2 = new Personne("Beethoven", "Von", 35);
		Personne beet3 = new Personne("Beethoven", "Ludwig", 20);
		Personne tchain = new Personne("Tchainkovsky", "Piotr", 63);
		Personne tchain2 = new Personne("Tchainkovsky", "Peter", 25);

		List<Personne> capCFini = new ArrayList<>();
		Collections.addAll(capCFini, beet2, tchain, bach3, beet, bach, beet3, tchain2, bach2);

		Iterator<Personne> it = capCFini.iterator();
		while (it.hasNext()) {
			Personne pers = it.next();
			if(pers.getAge() > 40) {
				it.remove();
				System.out.println(pers.getPrenom() + ", vous êtes viré. ");
			}
		}

	}

}
