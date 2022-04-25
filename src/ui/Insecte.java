package ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Insecte extends Navigation {
	public Insecte() {
		// R�cup�ration des m�thodes du constructeur parent (nav)
		super();
		setTitle("Insecte");
		// Callback de la fonction de rajout de contenu
		ajoutContenu();
	}
	
	public void ajoutContenu() {
		// Toujours utiliser setLayout et setVisible pour la frame
	    setLayout(null);
	    setVisible(true);
	    
//	     Cr�ation d'un �l�ment (bouton & label)
	    JButton button = new JButton("Bouton ajout�");
	    JLabel label = new JLabel("Mon nouveau label");
	    
	    // Taille d'un �l�ment (X,Y)
	    button.setSize(150,40); 
	    label.setSize(150,30);
	    
	    // Position des �l�ments (X,Y)
	    button.setLocation(100,150);
	    label.setLocation(200,110);
	    
	    // & on les ajoute � la frame
	    add(button);
	    add(label);
	}
	
	public static void main (String[] args) {
		JFrame content = new Insecte();
		content.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    content.setSize(1024, 768);
	    content.setVisible(true);
	}
}
