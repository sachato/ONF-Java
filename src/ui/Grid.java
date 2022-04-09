package ui;
import java.awt.*;
import javax.swing.*;

import model.Grille;

public class Grid extends JPanel{
	
	public int size =550;
	public int nbCell;
	public int tailleCell;
	
	public Grid(Grille grille) {
		String taille = grille.getTaille();
		String[] tailleSplit = taille.split("x");
		nbCell = Integer.parseInt(tailleSplit[0]);
		grandeurCellules(nbCell);
        setSize(size, size);
        setVisible(true);
    }

    // draw grid
    public void paint(Graphics g) {
    	System.out.println("test");
    	System.out.println(nbCell);
    	grandeurCellules(nbCell);
        for (int x = 0; x <= size-30 ; x += tailleCell)
            for (int y = 0; y <= size-30; y += tailleCell)
                g.drawRect(x, y, tailleCell, tailleCell);
    }
    
    public void grandeurCellules(int nbCell) {
    	this.tailleCell = this.size/nbCell;
    }
    
    
}
