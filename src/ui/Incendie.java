package ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Grille;

public class Incendie extends Navigation {
	
	private Grid grilleMoy;
	
	public Incendie() {
		// Récupération des méthodes du constructeur parent (nav)
		super();
		setTitle("Incendie");
		// Callback de la fonction de rajout de contenu
		ajoutContenu();
	}
	
	public void ajoutContenu() {
		
		// Toujours utiliser setLayout et setVisible pour la frame
	    setLayout(null);
	    setVisible(true);
	    
	    //Grille
	    
	    grilleMoy = new Grid(new Grille ("Moyenne","25x25"));
	    grilleMoy.setLocation(220,250);
	    grilleMoy.setSize(1290,380);
	    add(grilleMoy);
	    grilleMoy.setVisible(true);
	    

	}
	
	public static void main (String[] args) {
		JFrame content = new Incendie();
		content.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    content.setSize(1024, 768);
	    content.setVisible(true);
	}
}














//Création d'un élément (bouton & label)
//JButton button = new JButton("Bouton ajouté");
//JLabel label = new JLabel("Mon nouveau label");
//
//// Taille d'un élément (X,Y)
//button.setSize(150,40); 
//label.setSize(150,30);

// Position des éléments (X,Y)
//button.setLocation(100,150);
//label.setLocation(200,110);

// & on les ajoute à la frame
//add(button);
//add(label);
