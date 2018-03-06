package fr.m2iformation;

import java.util.Deque;
import java.util.LinkedList;

public class LanceurFilePile {

	public static void main(String[] args) {
		Deque<Integer>integers = new LinkedList<>();
		integers.addLast(10);
		integers.addLast(20);
		System.out.println(integers.removeFirst());
		

	}

}
