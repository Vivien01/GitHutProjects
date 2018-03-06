package fr.m2iformation;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class LanceurFile {

	public static void main(String[] args) {
		File rep = new File("haikus");
		File[]fichiers =  rep.listFiles();
		for(File f : fichiers) {
			if(f.getName().endsWith(".odt")) {
				f.delete();
			}
		}
		
		
		

	}

}
