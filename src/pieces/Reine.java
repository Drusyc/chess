package pieces;

import java.awt.Image;

import plateau.Case;
import enumeration.Couleur;
import enumeration.TypePiece;
import model.Visiteur;

/**
 * Created by amadou on 17/11/14.
 */
public class Reine extends Piece {
	
	public Reine(Image img,TypePiece t, Couleur co, Case ca) {
		super(img,t, co, ca);
		// TODO Auto-generated constructor stub
	}

	void appliquer(Visiteur v) {
		v.visite(this);
		
	}
}
