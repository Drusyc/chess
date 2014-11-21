package pieces;

import java.awt.Image;

import javax.swing.ImageIcon;

import visiteur.Visiteur;
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
	
	public Piece (TypePiece t, Couleur co, Case ca) {
		this.type = t;
		this.color = co;
		this.actual_case = ca;
		this.img = getImageForPiece(co, t);
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
	
	/**
	 * load image for given color and type. This method translates the color and
	 * type information into a filename and loads that particular file.
	 * 
	 * @param color color constant
	 * @param type type constant
	 * @return image
	 */
	private Image getImageForPiece(Couleur color, TypePiece type) {
		String filename = "";

		filename += (color == Couleur.COLOR_WHITE ? "w" : "b");
		switch (type) {
			case TYPE_BISHOP:
				filename += "b";
				break;
			case TYPE_KING:
				filename += "k";
				break;
			case TYPE_KNIGHT:
				filename += "n";
				break;
			case TYPE_PAWN:
				filename += "p";
				break;
			case TYPE_QUEEN:
				filename += "q";
				break;
			case TYPE_ROOK:
				filename += "r";
				break;
		}
		filename += ".png";
		return new ImageIcon("img/" + filename).getImage();
	}
	
	
}

