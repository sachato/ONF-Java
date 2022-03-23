package ui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Navigation extends JFrame {
	
	public Navigation() {
		super();
		Elements();
		
	}
	
	public void Elements() {
		
		// Création des éléments
		
        JButton exporterCSV = new JButton("Exporter en CSV");
        JButton exporterBDD = new JButton("Exporter en BDD");
        JButton simulation = new JButton("Simulation");
        JButton init = new JButton("Initialisation");
        JButton arbre = new JButton("Croissance des arbres");
        JButton incendie = new JButton("Incendie");
        JButton insecte = new JButton("Invasion d'insectes");  
        
        // Taille des éléments
        
        simulation.setSize(new Dimension(120,30));
        init.setSize(new Dimension(120,30));
        arbre.setSize(new Dimension(170,30));
        incendie.setSize(new Dimension(100,30));
        insecte.setSize(new Dimension(160,30));
        exporterCSV.setSize(new Dimension(150,30));
        exporterBDD.setSize(new Dimension(150,30));
        
        // Design des éléments
        
        simulation.setBackground(Color.decode("#007b27"));  
        init.setBackground(Color.decode("#aec666"));
        arbre.setBackground(Color.decode("#aec666"));
        incendie.setBackground(Color.decode("#aec666"));
        insecte.setBackground(Color.decode("#aec666"));
        exporterCSV.setBackground(Color.decode("#37e56e"));
        exporterBDD.setBackground(Color.decode("#37e56e"));
        
        // Position des éléments
        
        simulation.setLocation(40,10);
        init.setLocation(20, 75);
        arbre.setLocation(160, 75);
        incendie.setLocation(350, 75);
        insecte.setLocation(470, 75);
        exporterCSV.setLocation(810,50);
        exporterBDD.setLocation(810,90); 
        
        // Ajout des éléments sur la frame
        
		add(exporterCSV);
		add(exporterBDD);
		add(simulation);
		add(init);
		add(arbre);
		add(incendie);
		add(insecte);
	}
}
