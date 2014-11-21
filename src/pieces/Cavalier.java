package pieces;

import plateau.Case;
import visiteur.Visiteur;
import enumeration.Couleur;
import enumeration.TypePiece;

public class Cavalier extends Piece {

	public Cavalier(TypePiece t, Couleur co, Case ca) {
		super(t, co, ca);
		// TODO Auto-generated constructor stub
	}

	@Override
	void appliquer(Visiteur v) {
		v.visite(this);
		
	}
}
