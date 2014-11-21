package pieces;

import java.awt.Image;

import plateau.Case;
import enumeration.Couleur;
import enumeration.TypePiece;
import visiteur.Visiteur;
/**
 * Created by amadou on 17/11/14.
 */
public class Roi extends Piece {
	public Roi(Image img,TypePiece t, Couleur co, Case ca) {
		super(img,t, co, ca);
		// TODO Auto-generated constructor stub
	}

	void appliquer(Visiteur v) {
		v.visite(this);
		
	}
}
