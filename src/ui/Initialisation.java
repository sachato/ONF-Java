package ui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Initialisation extends Navigation {
	
	public Initialisation() {
		// Récupération des méthodes du constructeur parent (nav)
		super();
		// Callback de la fonction de rajout de contenu
		ajoutContenu();
		System.out.println("je suis dans l'initialisation");
	}
	
	public void ajoutContenu() {
		// Toujours utiliser setLayout et setVisible pour la frame
	    setLayout(null);
	    setVisible(true);
	    
	    //creation des choix combobox
	    String tailleGrille[] = { "Petite", "Moyenne", "Grande"};
	    String vitesseExecution[] = { "Lent", "Moyen", "Rapide"};
//	     Création d'un élément (bouton & label)
	    JButton button = new JButton("Bouton ajouté");
	    JLabel labelNom = new JLabel("Nom simulation :");
	    JLabel labelGrille = new JLabel("Choix grille :");
	    JLabel labelPas = new JLabel("Nombre de pas :");
	    JLabel labelVitesse = new JLabel("Vitesse D'execution :");
	    JTextField nomField = new JTextField(16);
	    JTextField pasField = new JTextField(16);
	    JComboBox grilleField = new JComboBox(tailleGrille);
	    JComboBox vitesseField = new JComboBox(vitesseExecution);
	    Grid grille = new Grid();
	    JButton clear = new JButton("Effacer les données");
        JButton envoyer = new JButton("Envoyer");
	    
	    //Style des textBox (border)
	    nomField.setBorder(BorderFactory.createLineBorder(Color.decode("#d7e5af"),3));
	    pasField.setBorder(BorderFactory.createLineBorder(Color.decode("#d7e5af"),3));
	    clear.setBackground(Color.decode("#c0d681"));
	    envoyer.setBackground(Color.decode("#c0d681"));

	    
	    // Taille d'un élément (X,Y)
//	    button.setSize(150,40); 
	    labelNom.setSize(150,30);
	    labelGrille.setSize(150,30);
	    labelPas.setSize(150,30);
	    labelVitesse.setSize(150,30);
	    nomField.setSize(150,30);
	    pasField.setSize(150,30);
	    grilleField.setSize(150,30);
	    vitesseField.setSize(150,30);
	    clear.setSize(150,30);
	    envoyer.setSize(150,30);
	    
	    // Position des éléments (X,Y)
//	    button.setLocation(100,150);
	    labelNom.setLocation(40,150);
	    nomField.setLocation(150,150);
	    labelGrille.setLocation(40,200);
	    grilleField.setLocation(150,200);
	    labelPas.setLocation(40,250);
	    pasField.setLocation(150,250);
	    labelVitesse.setLocation(40,300);
	    vitesseField.setLocation(180,300);
	    grille.setLocation(30,350);
	    clear.setLocation(30,650);
	    envoyer.setLocation(810,650);
	    
	    // & on les ajoute à la frame
//	    add(button);
	    add(labelNom);
	    add(nomField);
	    add(labelGrille);
	    add(labelPas);
	    add(labelVitesse);
	    add(pasField);
	    add(grilleField);
	    add(vitesseField);
	    add(grille);
	    add(clear);
	    add(envoyer);
	    
	    
	}
	
//	public static void main (String[] args) {
//		JFrame content = new Initialisation();
//		content.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	    content.setSize(1024, 768);
//	    content.setVisible(true);
//	}
	
}
