package fr.m2iformation;

import java.util.Comparator;

public class PersonneComparator2 implements Comparator<Personne> {

	@Override
	public int compare(Personne pers1, Personne pers2) {
		// int result = pers1.getNom().compareTo(pers2.getNom());
		// if (result == 0) {
		// result = pers1.getPrenom().compareTo(pers2.getPrenom());
		// if (result == 0) {
		// result = pers1.getAge() - pers2.getAge();
		// }
		// }
		// return result;
		int result = pers1.getNom().compareTo(pers2.getNom());
		if (result != 0) {
			return result;
		}
		result = pers1.getPrenom().compareTo(pers2.getPrenom());
		if (result != 0) {
			return result;
		}
		return pers1.getAge() - pers2.getAge();

	}

}
