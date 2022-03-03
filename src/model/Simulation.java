package model;

public class Simulation {
	
	private String nom;
	private Grille grille;
	private int nombreDePasMax;
	private int vitesseExecution;
	private Cellules cellules;
	private int nombreDeTours;
	
	
	public Simulation(String nom, Grille grille, int nombreDePasMax, int vitesseExecution, Cellules cellules,
			int nombreDeTours) {
		super();
		this.nom = nom;
		this.grille = grille;
		this.nombreDePasMax = nombreDePasMax;
		this.vitesseExecution = vitesseExecution;
		this.cellules = cellules;
		this.nombreDeTours = nombreDeTours;
	}


	public String getNom() {
		return nom;
	}


	public Grille getGrille() {
		return grille;
	}


	public int getNombreDePasMax() {
		return nombreDePasMax;
	}


	public int getVitesseExecution() {
		return vitesseExecution;
	}


	public Cellules getCellules() {
		return cellules;
	}


	public int getNombreDeTours() {
		return nombreDeTours;
	}
	
	
}
