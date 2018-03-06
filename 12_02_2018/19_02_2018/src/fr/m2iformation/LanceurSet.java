package fr.m2iformation;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class LanceurSet {

	public static void main(String[] args) {
		Set<String>strings = new HashSet<>();
		Collections.addAll(strings, "un", "deux","trois", "un");
		for(String str : strings) {
			System.out.print(str + " ");
		}
		System.out.println();
		strings = new LinkedHashSet<>();
		Collections.addAll(strings, "un", "deux","trois", "un");
		for(String str : strings) {
			System.out.print(str + " ");
		}

	}

}
