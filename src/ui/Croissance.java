package ui;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.Grille;

public class Croissance extends Navigation  {
	

    private JLabel labelNom ;
    private JComboBox nomInit;
    private String simuInit[] = { "Initialisation A", "Initialisation B", "Initialisation C"};
    private Grid grilleInit;
    private JButton clear;
    private JButton envoyer;
    
	
	public Croissance() {
		// Récupération des méthodes du constructeur parent (nav)
		super();
		// Callback de la fonction de rajout de contenu
		ajoutContenu();
	}
	
	public void ajoutContenu() {
		// Toujours utiliser setLayout et setVisible pour la frame
	    setLayout(null);
	    setVisible(true);
	    
//	     Création d'un élément (bouton & label)
	    labelNom = new JLabel("Nom simulation :");
	    nomInit = new JComboBox(simuInit);
	    grilleInit = new Grid(new Grille("Petite", "10x10"));
	    clear = new JButton("Effacer les données");
        envoyer = new JButton("Envoyer");
	    
	    
	    // Taille d'un élément (X,Y)
        labelNom.setSize(150,30);
        nomInit.setSize(150,30);
	    clear.setSize(150,30);
	    envoyer.setSize(150,30);
	    
	    // Position des éléments (X,Y)
	    labelNom.setLocation(40,120);
	    nomInit.setLocation(150,120);
	    grilleInit.setLocation(420,140);
	    clear.setLocation(40,350);
	    envoyer.setLocation(200,350);
	    
	    // on les ajoute à la frame
	    add(labelNom);
	    add(nomInit);
	    add(grilleInit);
	    add(clear);
	    add(envoyer);
	    
	    
	    //Nom simulation combobox doit etre le nom saisi en iniitialisation
	   // grilleInit devrait être égal à la grille enregistrée en initialisation
	    
	    
	}

	
	

}
