package main;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

import model.Grille;
import services.dao.Dao;
import services.dao.GrilleDao;

public class Launcher {
	public static void main(String[] args) {
		GrilleDao grilleDao = new GrilleDao();
		Grille test = new Grille("Petite", "50X50");
		grilleDao.save(test);
	}
}
