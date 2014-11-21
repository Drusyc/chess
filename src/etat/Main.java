package etat;

import gui.ChessGui;
import gui.GamePannel;
import plateau.Plateau;

public class Main {

	public static void main(String[] args) {
			
		Etat e = new jeuOFF();
		ChessGui g = new ChessGui();
		
		/* Tant que l'user ne click pas sur "new game "*/
		while(!g.getEtat()){}
			
		/* L'état passe à jeuON */
		e.lancerPartie();
			
		/* Création du plateau + les pièces */

		Plateau board = Plateau.instance();
		g.setPiece(board);
		
		g.repaint();
	}

}