package model;

public class VitesseExecution {
	private String nom;
	private int vitesse;
	
	public VitesseExecution(String nom, int vitesse) {
		super();
		this.nom = nom;
		this.vitesse = vitesse;
	}
	
	
	public String getNom() {
		return nom;
	}
	public int getVitesse() {
		return vitesse;
	}
	
	@Override
	public String toString() {
		return ""+this.nom+"   "+this.vitesse;
	}
}
