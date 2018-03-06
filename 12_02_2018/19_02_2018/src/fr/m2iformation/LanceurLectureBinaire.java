package fr.m2iformation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LanceurLectureBinaire {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("nombres.bin");
			// travail de lecture...
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
