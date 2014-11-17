package etat;
import enumeration.Couleur;
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
	
	static public Joueur joueurActif;
	
	
	static Etat initial (String name1, String name2) {
		joueur1 = new Joueur(Couleur.COLOR_WHITE, "joueur_1");	
		joueur2 = new Joueur(Couleur.COLOR_BLACK, "joueur_2");
		
		board = Plateau.instance();
		
		joueurActif = joueur1;
		return state;
	}
	
	Etat stopperPartie() {
		return jeuOFF.initial();
	}
	
	public void switchJoueur () {
		if (joueurActif.getNom() == "joueur_1") {
			this.joueurActif = this.joueur2;
		} else {
			this.joueurActif = this.joueur1;
		}
	}
	
	
	

}

