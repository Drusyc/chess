package etat;

public class jeuON extends Etat{
	private static jeuON state = new jeuON();
	
	static Etat initial () {
		return state;
	}
	
	Etat stopperPartie() {
		return jeuOFF.initial();
	}

}

