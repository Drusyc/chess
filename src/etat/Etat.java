package etat;

public abstract class Etat {
	static Etat initial() {
		return jeuOFF.initial();	
	}
	
	Etat lancerPartie() {
		return this;
	}
	
	Etat stopperPartie() {
		return this;
	}
}

