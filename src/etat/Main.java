package etat;

import gui.ChessGui;
import plateau.Plateau;

public class Main {

	public static void main(String[] args) {
			
			Etat e = new jeuOFF();
			ChessGui g = new ChessGui();
			
//			/* tant que l'user ne clique pas sur "new game"*/
//			while(g.getIsOn()) {}
//			
//			e.lancerPartie();
//			while()
			

			/* Tant que l'user ne click pas sur "new game "*/
			while(!g.getEtat()){}
			
			/* L'état passe à jeuON */
			e.lancerPartie();
			
			/* Création du plateau + les pièces */
			Plateau board = Plateau.instance();
			
			
//			g.setPiece(board);
//			//g.paintComponent(g, board);
			

	}

}

