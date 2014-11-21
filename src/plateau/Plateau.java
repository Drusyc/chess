package plateau;


import enumeration.Couleur;
import pieces.*;


import java.util.ArrayList;
import java.util.List;

import pieces.Piece;

public class Plateau {
    // unique instance de la classe plateau
    final private static Plateau plateau = new Plateau();

    // les cases du plateau
    private Case[][] matriceCases = new Case[64][64];

    // renvoit l'instance unique de la classe Plateau
    public static Plateau instance () {
        return plateau;
    }

    public Case[][] getMatriceCases() {
        return matriceCases;
    }

    /* constructeur privé de la classe Plateau pour interdire
        l'instanciation de la classe Plateau depuis une autre classe
         */
    private Plateau() {

        for (int j = 0; j < 8; j++) {
            Case caze = new Case(j,6);
            caze.setOccupation(true);
            Piece piece = new Pion("Pion", Couleur.COLOR_WHITE,caze);
            piece.setCase(caze);
            matriceCases[j][6] = caze;
	    /*    l'instanciation de la classe Plateau depuis une autre classe
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
        for (int j = 0; j < 8; j++) {
            Case caze = new Case(j,1);
            caze.setOccupation(true);

            Piece piece = new Pion("Pion",Couleur.COLOR_BLACK,caze);
            piece.setCase(caze);
            matriceCases[j][1] = caze;
        }

        // Mis en place des rois
        Case caze = new Case(3,7);
        caze.setOccupation(true);
        Piece piece = new Roi("Roi", Couleur.COLOR_WHITE,caze);
        piece.setCase(caze);
        matriceCases[3][7] = caze;
        caze = new Case(3,0);
        caze.setOccupation(true);
        piece = new Roi("Roi", Couleur.COLOR_BLACK,caze);
        piece.setCase(caze);
        matriceCases[3][0] = caze;

        // Mis en place des reines
         caze = new Case(4,7);
        caze.setOccupation(true);
        piece = new Reine("Reine", Couleur.COLOR_WHITE,caze);
        piece.setCase(caze);
        matriceCases[4][7] = caze;
        caze = new Case(4,0);
        caze.setOccupation(true);
        piece = new Reine("Reine", Couleur.COLOR_BLACK,caze);
        piece.setCase(caze);
        matriceCases[4][0] = caze;

        // Mis en place des cavaliers
        caze = new Case(1,7);
        caze.setOccupation(true);
        piece = new Cavalier("Cavalier", Couleur.COLOR_WHITE,caze);
        piece.setCase(caze);
        matriceCases[1][7] = caze;
        caze = new Case(6,7);
        caze.setOccupation(true);
        piece = new Cavalier("Cavalier", Couleur.COLOR_WHITE,caze);
        piece.setCase(caze);
        matriceCases[6][7] = caze;

        caze = new Case(1,0);
        caze.setOccupation(true);
        piece = new Cavalier("Cavalier", Couleur.COLOR_BLACK,caze);
        piece.setCase(caze);
        matriceCases[1][0] = caze;
        caze = new Case(6,0);
        caze.setOccupation(true);
        piece = new Cavalier("Cavalier", Couleur.COLOR_BLACK,caze);
        piece.setCase(caze);
        matriceCases[6][0] = caze;

        // Mis en place des Fous
        caze = new Case(2,7);
        caze.setOccupation(true);
        piece = new Fou("Fou", Couleur.COLOR_WHITE,caze);
        piece.setCase(caze);
        matriceCases[3][7] = caze;
        caze = new Case(5,7);
        caze.setOccupation(true);
        piece = new Fou("Fou", Couleur.COLOR_WHITE,caze);
        piece.setCase(caze);
        matriceCases[5][7] = caze;

        caze = new Case(2,0);
        caze.setOccupation(true);
        piece = new Fou("Fou", Couleur.COLOR_BLACK,caze);
        piece.setCase(caze);
        matriceCases[2][0] = caze;
        caze = new Case(5,0);
        caze.setOccupation(true);
        piece = new Fou("Fou", Couleur.COLOR_BLACK,caze);
        piece.setCase(caze);
        matriceCases[5][0] = caze;

        // Mis en place des Tours
        caze = new Case(0,7);
        caze.setOccupation(true);
        piece = new Tour("Tour", Couleur.COLOR_WHITE,caze);
        piece.setCase(caze);
        matriceCases[0][7] = caze;
        caze = new Case(7,7);
        caze.setOccupation(true);
        piece = new Tour("Tour", Couleur.COLOR_WHITE,caze);
        piece.setCase(caze);
        matriceCases[7][7] = caze;

        caze = new Case(0,0);
        caze.setOccupation(true);
        piece = new Tour("Tour", Couleur.COLOR_BLACK,caze);
        piece.setCase(caze);
        matriceCases[0][0] = caze;
        caze = new Case(7,0);
        caze.setOccupation(true);
        piece = new Tour("Tour", Couleur.COLOR_BLACK,caze);
        piece.setCase(caze);
        matriceCases[7][0] = caze;

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
