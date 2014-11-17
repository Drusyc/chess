package etat;
import enumeration.Couleur;

public class jeuON extends Etat{
	private static jeuON state = new jeuON();
	
	static private Joueur joueur1;
	static private Joueur joueur2;
	
	
	
	
	static Etat initial (String name1, String name2) {
		joueur1 = new Joueur(Couleur.COLOR_WHITE, "joueur_1");	
		joueur2 = new Joueur(Couleur.COLOR_BLACK, "joueur_2");
		return state;
	}
	
	Etat stopperPartie() {
		return jeuOFF.initial();
	}
	
	
	

}

