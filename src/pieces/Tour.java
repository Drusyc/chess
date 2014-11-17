package pieces;

import plateau.Case;
import enumeration.Couleur;
import model.Visiteur;

/**
 * Created by amadou on 17/11/14.
 */
public class Tour extends Piece {
	public Tour(String t, Couleur co, Case ca) {
		super(t, co, ca);
		// TODO Auto-generated constructor stub
	}

	void appliquer(Visiteur v) {
		v.visite(this);
		
	}
}
