package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


@SuppressWarnings("serial")
public class RulesPannel extends JPanel {

	public RulesPannel() {
		this.setLayout(new BorderLayout());
		this.setBackground(Color.white);
		
		JLabel intro = new JLabel("Rules !");
		intro.setHorizontalAlignment(JLabel.CENTER);
		Font fIntro = new Font("Serif", Font.BOLD,20);
		intro.setFont(fIntro);
		
		JTextArea corpus = new JTextArea("Le joueur ayant les pièces blanches commence la partie."
				+ "L’objectif de chaque joueur est de mettre le roi adverse ‘‘en échec’’; c’est à dire de l’attaquer; de telle manière que l’adversaire n’ait pas de coup légal qui puisse éviter la prise du roi au coup suivant."
				+ "Aucune pièce ne peut se déplacer sur une case occupée par une pièce de même couleur. Si une pièce se déplace sur une case occupée par une pièce adverse, cette dernière est capturée et retirée de l’échiquier comme partie intégrante du même coup."
				+"Mouvement des pièces :"
				+ " Le fou se déplace sur toute case de l’une ou de l’autre diagonale sur laquelle il se trouve."
				+ " La tour se déplace sur toute case de la colonne ou de la traverse sur laquelle elle se trouve."
				+ "La dame se déplace sur toute case de la colonne, de la traverse ou de la diagonale sur laquelle elle se trouve."
				+ "Le cavalier se déplace sur une des cases la plus proche de celle sur laquelle il se trouve, mais pas sur la même colonne, traverse ou diagonale."
				+ " Le pion peut se déplacer en avant sur la case immédiatement inoccupée en face de lui sur la même colonne, ou à son premier coup, il peut avancer "
				+ "de deux cases sur la même colonne à condition qu’elles soient inoccupées, ou il peut se déplacer sur une case occupée par une pièce adverse, située "
				+ "diagonalement en face de lui sur la colonne adjacente, et capture ainsi cette pièce.");
		corpus.setLineWrap(true);
		Font fCorpus = new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 18);
		corpus.setFont(fCorpus);
		
		this.add(intro, BorderLayout.NORTH);
		this.add(corpus, BorderLayout.CENTER);
	}

}
