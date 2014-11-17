package etat;

import enumeration.Couleur;

public class Joueur {
	private Couleur color;
	private String nom;
	
	/*
	 * Constructeur
	 */
	public Joueur (Couleur c, String n){
		this.color = c;
		this.nom = n;
	}

	@SuppressWarnings("unused")
	private Couleur getColor() {
		return color;
	}

	@SuppressWarnings("unused")
	private void setColor(Couleur color) {
		this.color = color;
	}

	@SuppressWarnings("unused")
	private String getNom() {
		return nom;
	}

	@SuppressWarnings("unused")
	private void setNom(String nom) {
		this.nom = nom;
	}
	
}