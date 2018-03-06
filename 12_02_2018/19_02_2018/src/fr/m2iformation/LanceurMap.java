package fr.m2iformation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LanceurMap {

	public static void main(String[] args) {
		Map<String, Integer> liste = new HashMap<>();
		liste.put("carottes", 15);
		liste.put("navets", 7);
		liste.put("poireaux", 3);
		liste.put("poivrons", 5);
		liste.put("aubergines", 6);

		// if(liste.containsKey("carottes")) {
		// liste.remove("carottes");
		// }

		Set<String> keys = liste.keySet();
		keys.remove("poivrons");
		keys = liste.keySet();
		for (String key : keys) {
			System.out.println(key + " => " + liste.get(key));
		}

		List<Integer> values = new ArrayList<>(liste.values());
		System.out.println(values);

	}

}
