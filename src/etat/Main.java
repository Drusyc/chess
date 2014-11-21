package etat;

import gui.ChessGui;
import gui.PiecesDragAndDropListener;
import plateau.Plateau;

public class Main {

	public static void main(String[] args) {
			
		Etat e = new jeuOFF();
		ChessGui g = new ChessGui();
		

		Plateau board = Plateau.instance();
		g.setPiece(board);
		PiecesDragAndDropListener aa = new PiecesDragAndDropListener(g.gui_pieces,g);
		g.addMouseListener(aa);
		g.addMouseMotionListener(aa);
		
		/* Tant que l'user ne click pas sur "new game "*/
		while(!g.getEtat()){}
			
		/* L'état passe à jeuON */
		e.lancerPartie();
		
		
		/* Affichage du plateau + les pièces */
		/*
		 
		Joueur joueur_actif;
		 
		/* Tant qu'on est en partie * /
		while( partie en cours ) {
			e.deplacePiece(joueur_actif);
			
			if (Is_echec_mat(White_King)) {
				e.stopperPartie();
				System.out.println("Joueur 2 gagne");
			} else if (Is_echec_mat(Black_King)){
				e.stopperPartie();
				System.out.println("Joueur 1 gagne");
			} else {
				e.switchJoueur(joueur_actif);
			}		
			
		}
		*/
		/* Création du plateau + les pièces */

		//Plateau board = Plateau.instance();
		//g.setPiece(board);
		
		//g.repaint();
	}

}
