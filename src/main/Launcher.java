package main;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;

import model.Grille;
import model.Simulation;
import model.VitesseExecution;
import services.Fichier;
import services.dao.Dao;
import services.dao.GrilleDao;
import services.dao.SimulationDao;
import services.dao.VitesseExecutionDao;

public class Launcher {
	public static void main(String[] args) throws FileNotFoundException {
		//test enregistrement string grille
		GrilleDao grilleDao = new GrilleDao();
		Grille testGrille = grilleDao.getFromNom("Grande");
		System.out.println(testGrille.getTaille());
		//creation de chaine "petite"
		String chaineGrille = testGrille.creationChaine();
		//affichage de la chainee e ecdsqxsq	qszeer 
		Fichier fichier = new Fichier();
		String path = fichier.ecrireDansUnFichier(chaineGrille, "Premiere Simulation");
		Simulation sim = new Simulation(3,"Premiere Simulation", 1000, "Rapide", path, 0, "Grande");
	}


}
