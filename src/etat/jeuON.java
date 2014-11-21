package etat;
import enumeration.Couleur;
import gui.ChessGui;
import plateau.Plateau;

/*
 * 
 * jeuON sert ici de contrôlleur
 * Il possède Joueurs et Plateau
 * Il fait la relation entre un click de souris sur l'IG et les cases du plateau (pour les déplacements)
 * 
 */

public class jeuON extends Etat{
	private static jeuON state = new jeuON();
	
	static private Joueur joueur1;
	static private Joueur joueur2;
	static private Plateau board;
		
	
	static Etat initial () {
		joueur1 = new Joueur(Couleur.COLOR_WHITE, "joueur_1");	
		joueur2 = new Joueur(Couleur.COLOR_BLACK, "joueur_2");
		
		board = Plateau.instance();
		
		return state;
	}
	
	Etat stopperPartie() {
		return jeuOFF.initial();
	}
	
	public void switchJoueur (Joueur j) {
		if (j.getNom() == "joueur_1") {
			j = this.joueur2;
		} else {
			j = this.joueur1;
		}
	}
	
	//TODO
	public void deplacerPiece(Joueur j) {
		if (j.getColor() == Couleur.COLOR_WHITE) {
			//deplacer que les blancs
			
			
			//piece_selectionnee.deplace
		} else {
			//..
		}
	}
	
	public static void main(String[] args) {
		
		Etat e = new jeuOFF();
		ChessGui g = new ChessGui();
		
		
}
}

