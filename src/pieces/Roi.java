package pieces;

import model.Visiteur;

/**
 * Created by amadou on 17/11/14.
 */
public class Roi extends Piece {
	void appliquer(Visiteur v) {
		v.visite(this);
		
	}
}
