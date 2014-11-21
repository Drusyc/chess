package pieces;

import java.awt.Image;

import model.Visiteur;
import enumeration.Couleur;
import enumeration.TypePiece;
import plateau.Case;


public abstract class Piece {
	
	private TypePiece type;
	private Couleur color;

	private Image img;
	
	abstract void appliquer (Visiteur v);
	
	private Case actual_case;
	
	public Piece (Image img,TypePiece t, Couleur co, Case ca) {
		this.type = t;
		this.color = co;
		this.actual_case = ca;
		this.img = img;
	}
	
	public Image getImage() {
		return img;
	}

	public Case getCase() {
		return actual_case;
	}

	public TypePiece getType() {
		return type;
	}

	public Couleur getColor() {
		return color;
	}
	
	public void setCase(Case c) {
		this.actual_case.setPiece(null);
		this.actual_case = c;
		this.actual_case.setPiece(this);
	}
	
	public int getWidth() {
		return img.getHeight(null);
	}

	public int getHeight() {
		return img.getHeight(null);
	}
	
	
}

