package pieces;

import plateau.Case;
import enumeration.Couleur;
import model.Visiteur;

/**
 * Created by amadou on 17/11/14.
 */
public class Cavalier extends Piece {

	public Cavalier(String t, Couleur co, Case ca) {
		super(t, co, ca);
		// TODO Auto-generated constructor stub
	}

	@Override
	void appliquer(Visiteur v) {
		v.visite(this);
		
	}
}
