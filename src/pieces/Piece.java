package pieces;

import enumeration.Couleur;


public abstract class Piece {
	private String type;
	private Couleur color;
	abstract void appliquer (Visiteur v);
}

