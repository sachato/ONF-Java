package main;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

import model.Grille;
import model.VitesseExecution;
import services.dao.Dao;
import services.dao.GrilleDao;
import services.dao.VitesseExecutionDao;

public class Launcher {
	public static void main(String[] args) {
		GrilleDao grilleDao = new GrilleDao();
		VitesseExecutionDao vitesseExecutionDao = new VitesseExecutionDao();
//		Grille test = new Grille("Petite", "50X50");
//		grilleDao.save(test);
		Grille test = grilleDao.getFromNom("Petite");
		VitesseExecution test2 = vitesseExecutionDao.getFromNom("Lent");
		System.out.println(test.toString());
		System.out.println(grilleDao.getAll().toString());
		System.out.println("");
		System.out.println(test2.toString());
		System.out.println(vitesseExecutionDao.getAll().toString());
	}
}
