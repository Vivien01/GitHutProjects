package fr.m2iformation;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LanceurLectureBinaire4 {

	public static void main(String[] args) {
		File f = new File("personnes.bin");
		try (DataInputStream fis = new DataInputStream(new FileInputStream(f))) {
			long nombrePersonnes = f.length() / 104;
			StringBuilder builder = new StringBuilder();
			for (int p = 0; p < nombrePersonnes; p++) {

				for (int i = 0; i < 25; i++) {
					builder.append(fis.readChar());
				}
				String nom = builder.toString().trim();
				builder.setLength(0);

				for (int i = 0; i < 25; i++) {
					builder.append(fis.readChar());
				}
				String prenom = builder.toString().trim();
				builder.setLength(0);
				int age = fis.readInt();

				System.out.printf("nom: %s, prénom: %s, age: %d%n", nom, prenom, age);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
