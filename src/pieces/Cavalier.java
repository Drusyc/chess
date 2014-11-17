package pieces;

import model.Visiteur;

/**
 * Created by amadou on 17/11/14.
 */
public class Cavalier extends Piece {

	@Override
	void appliquer(Visiteur v) {
		v.visite(this);
		
	}
}
