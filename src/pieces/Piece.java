package pieces;

import model.Visiteur;
import enumeration.Couleur;
import plateau.Case;


public abstract class Piece {
	private String type;
	private Couleur color;
	abstract void appliquer (Visiteur v);
	
	private Case actual_case;
	
	public Piece (String t, Couleur co, Case ca) {
		this.type = t;
		this.color = co;
		this.actual_case = ca;
	}


	public Case getCase() {
		return actual_case;
	}

	public String getType() {
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
	
	
}

