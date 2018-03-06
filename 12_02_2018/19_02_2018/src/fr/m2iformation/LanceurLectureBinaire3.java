package fr.m2iformation;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LanceurLectureBinaire3 {

	public static void main(String[] args) {
		try (DataInputStream fis = new DataInputStream(new FileInputStream("personnes.bin"))) {
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < 25; i++) {
				builder.append(fis.readChar());
			}
			String nom = builder.toString().trim();
			builder.setLength(0);

			for (int i = 0; i < 25; i++) {
				builder.append(fis.readChar());
			}
			String prenom = builder.toString().trim();
			int age = fis.readInt();

			System.out.printf("nom: %s, prénom: %s, age: %d", nom, prenom, age);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
