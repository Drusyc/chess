package etat;
import plateau.Plateau;
import enumeration.Couleur;

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
	
	@Override
	public void switchJoueur (Joueur j) {
		if (j.getNom() == "joueur_1") {
			j = jeuON.joueur2;
		} else {
			j = jeuON.joueur1;
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
	
}

