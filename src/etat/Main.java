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
			

		
			while(!g.getEtat()){
				
			}
			
			Plateau board = Plateau.instance();
			g.setPiece(board);
			//g.paintComponent(g, board);
			

	}

}

