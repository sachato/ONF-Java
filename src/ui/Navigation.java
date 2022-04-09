package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Navigation extends JFrame implements MouseListener{
	
	public Navigation() {
		
		super("Jim Forest");
		setResizable(false);
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
        
        simulation.setBackground(Color.decode("#c0d681"));  
        init.setBackground(Color.decode("#d7e5af"));
        arbre.setBackground(Color.decode("#d7e5af"));
        incendie.setBackground(Color.decode("#d7e5af"));
        insecte.setBackground(Color.decode("#d7e5af"));
        exporterCSV.setBackground(Color.decode("#c0d681"));
        exporterBDD.setBackground(Color.decode("#c0d681"));
        
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

	public void mouseClicked(MouseEvent e) {
		System.out.println("click");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("press");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("release");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("enter");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("bye");
		
	}
}
