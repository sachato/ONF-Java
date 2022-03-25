package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicPasswordFieldUI;

import model.Grille;
import model.Simulation;
import services.Fichier;
import services.dao.GrilleDao;
import services.dao.SimulationDao;

public class Initialisation extends Navigation implements ActionListener{
	private JTextField pasField;
	private String tailleGrille[] = { "Petite", "Moyenne", "Grande"};
    private String vitesseExecution[] = { "Lent", "Moyen", "Rapide"};
    private JButton button;
    private JLabel labelNom ;
    private JLabel labelGrille ;
    private JLabel labelPas ;
    private JLabel labelVitesse;
    private JTextField nomField;
    private JComboBox grilleField;
    private JComboBox vitesseField = new JComboBox(vitesseExecution);
    private Grid grille;
    private JButton clear;
    private JButton envoyer;
    
	
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
	    
//	     Création d'un élément (bouton & label)
	    button = new JButton("Bouton ajouté");
	    labelNom = new JLabel("Nom simulation :");
	    labelGrille = new JLabel("Choix grille :");
	    labelPas = new JLabel("Nombre de pas :");
	    labelVitesse = new JLabel("Vitesse D'execution :");
	    nomField = new JTextField(16);
	    pasField = new JTextField(16);
	    grilleField = new JComboBox(tailleGrille);
	    vitesseField = new JComboBox(vitesseExecution);
	    grille = new Grid();
	    clear = new JButton("Effacer les données");
        envoyer = new JButton("Envoyer");
	    
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
	    labelNom.setLocation(40,120);
	    nomField.setLocation(150,120);
	    labelGrille.setLocation(40,170);
	    grilleField.setLocation(150,170);
	    labelPas.setLocation(40,220);
	    pasField.setLocation(150,220);
	    labelVitesse.setLocation(40,270);
	    vitesseField.setLocation(180,270);
	    grille.setLocation(30,320);
	    clear.setLocation(30,620);
	    envoyer.setLocation(810,620);
	    
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
	    
	    envoyer.addActionListener(this);
	    clear.addActionListener(this);
	    
	    
	}
	
	public void actionPerformed(ActionEvent e)
    {
		if(e.getSource() == envoyer) {
			GrilleDao grilleDao = new GrilleDao();
			Grille grille = grilleDao.getFromNom(grilleField.getSelectedItem().toString());
			String jsonGrid = grille.creationChaine();
			Fichier fichier = new Fichier();
			String path = fichier.ecrireDansUnFichier(jsonGrid, nomField.getText());
			Simulation simulation = new Simulation(3, nomField.getText(), Integer.parseInt(pasField.getText()), vitesseField.getSelectedItem().toString(), path, 0, grilleField.getSelectedItem().toString());
			SimulationDao simulationDao = new SimulationDao();
			simulationDao.save(simulation);
			System.out.println("Enregisté");
		}
		if(e.getSource() == clear) {
			pasField.setText("");
			nomField.setText("");
			vitesseField.setSelectedIndex(0);
			grilleField.setSelectedIndex(0);
		}
		
		
    }
	
//	public static void main (String[] args) {
//		JFrame content = new Initialisation();
//		content.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	    content.setSize(1024, 768);
//	    content.setVisible(true);
//	}
	
}
