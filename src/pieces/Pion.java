package pieces;

import plateau.Case;
import enumeration.Couleur;
import enumeration.TypePiece;
import visiteur.Visiteur;
/**
 * Created by amadou on 17/11/14.
 */
public class Pion extends Piece {
	

	public Pion(TypePiece t, Couleur co, Case ca) {
		super(t, co, ca);
		// TODO Auto-generated constructor stub
	}

	public void appliquer(Visiteur v) {
		v.visite(this);
		
	}

}
