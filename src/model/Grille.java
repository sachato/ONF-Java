package model;

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
	
	@Override
	public String toString() {
		return ""+this.nom+"   "+this.taille;
	}
	
	
	
}
