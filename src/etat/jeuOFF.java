package etat;

public class jeuOFF extends Etat {
	private static jeuOFF state = new jeuOFF();
	
	static Etat initial () {
		return state;
	}
	
	Etat lancerPartie() {
		return jeuON.initial();
	}

	@Override
	public void switchJoueur(Joueur j) {
		// TODO Auto-generated method stub
		
	}

}

