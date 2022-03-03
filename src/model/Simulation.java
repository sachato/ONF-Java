package model;

import services.dao.SimulationDao;

public class Simulation {
	
	private int id;
	private String nom;
	private String grille;
	private int nombrePasMax;
	private String vitesseExecution;
	private String cellules;
	private int nombreDeTours;
	
	
	public Simulation(int id,String nom,  int nombrePasMax, String vitesseExecution, String cellules,
			int nombreDeTours, String grille) {
		super();
		this.id = id;
		this.nom = nom;
		this.grille = grille;
		this.nombrePasMax = nombrePasMax;
		this.vitesseExecution = vitesseExecution;
		this.cellules = cellules;
		this.nombreDeTours = nombreDeTours;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}


	public String getGrille() {
		return grille;
	}


	public int getNombrePasMax() {
		return nombrePasMax;
	}


	public String getVitesseExecution() {
		return vitesseExecution;
	}


	public String getCellules() {
		return cellules;
	}


	public int getNombreDeTours() {
		return nombreDeTours;
	}
	
	
	public void wantToSave(Simulation simulation, int id) {
		SimulationDao simulationDao = new SimulationDao();
		Simulation checkIfExist = simulationDao.findById(id);
		if (checkIfExist == null) {
			simulationDao.save(simulation);
		}
		else {
			simulationDao.update(simulation, id);
		}
	}
	
}
