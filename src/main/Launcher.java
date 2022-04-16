package main;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JFrame;

import model.Grille;
import model.Simulation;
import model.VitesseExecution;
import services.Fichier;
import services.dao.Dao;
import services.dao.GrilleDao;
import services.dao.SimulationDao;
import services.dao.VitesseExecutionDao;
import ui.Croissance;
import ui.Initialisation;

public class Launcher {
	public static void main(String[] args){
		Dimension size = Toolkit. getDefaultToolkit(). getScreenSize();
		JFrame content = new Croissance();
		content.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    content.setSize(size);
	    content.setVisible(true);
	}
}
