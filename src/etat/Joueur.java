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

	
	public Couleur getColor() {
		return color;
	}

	
	public void setColor(Couleur color) {
		this.color = color;
	}

	
	public String getNom() {
		return nom;
	}

	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}