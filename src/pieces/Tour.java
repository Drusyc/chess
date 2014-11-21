package pieces;

import plateau.Case;
import visiteur.Visiteur;
import enumeration.Couleur;
import enumeration.TypePiece;
/**
 * Created by amadou on 17/11/14.
 */
public class Tour extends Piece {
	public Tour(TypePiece t, Couleur co, Case ca) {
		super(t, co, ca);
		// TODO Auto-generated constructor stub
	}

	public void appliquer(Visiteur v) {
		v.visite(this);
		
	}
}
