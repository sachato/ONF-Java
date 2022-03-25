package services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Fichier {
	
	
	
	public Fichier() {
		
	}
	
	public String ecrireDansUnFichier(String json, String nom){
		String path = fileCreator(nom);
		PrintWriter writer;
		try {
			writer = new PrintWriter(path);
			writer.println(json);
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
	}
	
	public String fileCreator(String nom) {
		String path = "C:\\ONF-SAVE\\" + nom + ".txt";
		try {
			// Recevoir le fichier 
	        File f = new File(path);
	  
	        // Créer un nouveau fichier
	        // Vérifier s'il n'existe pas
	        if (f.createNewFile())
	            System.out.println("File created");
	        else
	            System.out.println("File already exists");
	    }
	    catch (Exception e) {
	        System.err.println(e);
	    }
		return path;
	}
}
