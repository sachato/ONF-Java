package main;

import java.sql.Connection;
import java.sql.DriverManager;

import model.Grille;
import model.Simulation;
import model.VitesseExecution;
import services.dao.Dao;
import services.dao.GrilleDao;
import services.dao.SimulationDao;
import services.dao.VitesseExecutionDao;

public class Launcher {
	public static void main(String[] args) {
		GrilleDao grilleDao = new GrilleDao();
		VitesseExecutionDao vitesseExecutionDao = new VitesseExecutionDao();
		SimulationDao simulationDao = new SimulationDao();
//		Grille test = new Grille("Petite", "50X50");
//		grilleDao.save(test);
		Grille test = grilleDao.getFromNom("Petite");
		VitesseExecution test2 = vitesseExecutionDao.getFromNom("Lent");
		System.out.println(test.toString());
		System.out.println(grilleDao.getAll().toString());
		System.out.println("");
		System.out.println(test2.toString());
		System.out.println(vitesseExecutionDao.getAll().toString());
		Simulation test3 = new Simulation(2, "TestNom3", 1000, "Rapide", "Test de json pour etat des cellules", 0, "Petite");
		test3.wantToSave(test3, test3.getId());
	}
}
