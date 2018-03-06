package fr.m2iformation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LanceurLectureBinaire2 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("nombres.bin")) {
			int i = 0;
			while ((i = fis.read()) != -1) {
				System.out.println(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
