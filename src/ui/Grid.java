package ui;
import java.awt.*;
import javax.swing.*;

import model.EnumTailleGrille;
import model.Grille;

public class Grid extends JPanel{
	
	public int size = 550;
	public int nbCell;
	public int tailleCell;
	

	public int getNbCell() {
		return nbCell;
	}

	public void setNbCell(int nbCell) {
		this.nbCell = nbCell;
	}

	public int getTailleCell() {
		return tailleCell;
	}

	public void setTailleCell(int tailleCell) {
		this.tailleCell = tailleCell;
	}
	
	public void resize(EnumTailleGrille taille) {
		nbCell = taille.taille;
		grandeurCellules(nbCell);
	}

	
	
	public void calculerNbCell(String taille) {
		String[] tailleSplit = taille.split("x");
		nbCell = Integer.parseInt(tailleSplit[0]);
	}
	
	public Grid(Grille grille) {
		String taille = grille.getTaille();
		calculerNbCell(taille);
		grandeurCellules(nbCell);
        setSize(size, size);
        setVisible(true);
    }

    // draw grid
    public void paint(Graphics g) {
    	setOpaque(false);
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
