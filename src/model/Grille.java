
package model;

import org.json.JSONObject;

import services.Sort;

public class Grille {

	private String nom;
	private String taille;
	
	public Grille(String nom, String taille) {
		super();
		this.nom = nom;
		this.taille = taille;
	}
	public String getNom() {
		return nom;
	}
	public String getTaille() {
		return taille;
	}
	
	public String creationChaine() {
		String[] parts = this.taille.split("x");
		JSONObject jsonString = new JSONObject();
		for(int i = 0; i < Integer.parseInt(parts[0]); i+=1) {
			for(int j = 0; j < Integer.parseInt(parts[1]); j+=1) {
				jsonString.put(""+i+":"+j, "vide");
			}
		}
		String jsonGrille = jsonString.toString();
		System.out.println(jsonGrille);
		
		return jsonGrille;
	}
	
	private String removeLastChar(String s)   
	{  
	//returns the string after removing the last character  
	return s.substring(0, s.length() - 1);  
	}   
	
	@Override
	public String toString() {
		return ""+this.nom+"   "+this.taille;
	}
	
}
