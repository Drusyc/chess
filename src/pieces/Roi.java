package pieces;

import plateau.Case;
import visiteur.Visiteur;
import enumeration.Couleur;
import enumeration.TypePiece;


public class Roi extends Piece {
	public Roi(TypePiece t, Couleur co, Case ca) {
		super(t, co, ca);
		// TODO Auto-generated constructor stub
	}

	void appliquer(Visiteur v) {
		v.visite(this);
		
	}
}
