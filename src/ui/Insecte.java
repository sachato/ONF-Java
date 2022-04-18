package ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Grille;

public class Insecte extends Navigation {
	
    private Grid grilleM;
    
	public Insecte() {
		// Récupération des méthodes du constructeur parent (nav)
		super();
		// Callback de la fonction de rajout de contenu
		ajoutContenu();
	}
	
	public void ajoutContenu() {
		// Toujours utiliser setLayout et setVisible pour la frame
	    setLayout(null);
	    setVisible(true);

	    grilleM = new Grid(new Grille("Moyenne", "25x25"));
	    grilleM.setLocation(220,250);
	    grilleM.setSize(1290,380);
	    add(grilleM);
	    grilleM.setVisible(true);
	}
	
	public static void main (String[] args) {
		JFrame content = new Insecte();
		content.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    content.setSize(1024, 768);
	    content.setVisible(true);
	}
}
