package model;

public enum EnumTailleGrille {
	Petite("10x10", 10),
	Moyenne("50x50", 50),
	Grande("100x100", 100);
	
	 public final String label;
	 public final int taille;

	    private EnumTailleGrille(String label, int taille) {
	        this.label = label;
	        this.taille = taille;
	    }
}
