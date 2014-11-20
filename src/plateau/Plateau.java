package plateau;




import java.util.ArrayList;
import java.util.List;

import pieces.Piece;

public class Plateau {
    // unique instance de la classe plateau
    final private static Plateau plateau = new Plateau();

    // les cases du plateau
    private Case[][] matriceCases;

    // renvoit l'instance unique de la classe Plateau
    public static Plateau instance () {
        return plateau;
    }
    /* constructeur privé de la classe Plateau pour interdire
    l'instanciation de la classe Plateau depuis une autre classe
     */
    
    private List<Piece> pieces_detruites = new ArrayList<Piece>();
    
    private Plateau() {
        matriceCases = new Case[64][64];
        // Placeme
        for (int i = 0; i < 8; i++) {
                Case caze = new Case();
                caze.setX(1); caze.setY(i);
                caze.setOccupation(true);
                //Piece piece = new Pion();
                //caze.setPiece(piece);
                matriceCases[1][i] = caze;

        }
        for (int i = 0; i < 8; i++) {
            Case caze = new Case();
            caze.setX(1); caze.setY(i);
            caze.setOccupation(true);
            //pieces.Piece piece = new Pion();
            //caze.setPiece(piece);
            matriceCases[1][i] = caze;
            }
    }

    public void add_Detruite (Piece piece){
    	this.pieces_detruites.add(piece);
    }
    
    public Case getIJ (int i, int j) {
    	return this.matriceCases[i][j];
    }

}
