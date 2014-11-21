package plateau;


import enumeration.Couleur;
import enumeration.TypePiece;
import pieces.*;

import java.util.ArrayList;
import java.util.List;

public class Plateau {
    // unique instance de la classe plateau
    final private static Plateau plateau = new Plateau();

    // les cases du plateau
    private Case[][] matriceCases = new Case[8][8];

    // renvoit l'instance unique de la classe Plateau
    public static Plateau instance() {
        return plateau;
    }

    public Case[][] getMatriceCases() {
        return matriceCases;
    }

    private List<Piece> pieces_detruites = new ArrayList<Piece>();
    public List<Piece> pieces = new ArrayList<Piece>();
    
    private Boolean todo_maj;
  
    /* constructeur privé de la classe Plateau pour interdire
        l'instanciation de la classe Plateau depuis une autre classe
         */

    private Plateau() {
        matriceCases = new Case[8][8];

        // Placement des pions noirs (1,0) -> (1,7)
        for (int j = 0; j < 8; j++) {
            Case caze = new Case(1, j);
            caze.setOccupation(true);
            Piece piece = new Pion(TypePiece.TYPE_PAWN, Couleur.COLOR_BLACK, caze);
            piece.setCase(caze);
            matriceCases[1][j] = caze;
            this.pieces.add(piece);
        }
        // Placement des pions blancs (6,0) -> (6,7)
        for (int j = 0; j < 8; j++) {
            Case caze = new Case(6, j);
            caze.setOccupation(true);
            Piece piece = new Pion(TypePiece.TYPE_PAWN, Couleur.COLOR_WHITE, caze);
            piece.setCase(caze);
            matriceCases[6][j] = caze;
            this.pieces.add(piece);
        }

        // Mis en place des rois
        Case caze = new Case(0, 3);
        caze.setOccupation(true);
        Piece piece = new Roi(TypePiece.TYPE_KING, Couleur.COLOR_BLACK, caze);
        piece.setCase(caze);
        matriceCases[0][3] = caze;
        this.pieces.add(piece);

        caze = new Case(7, 3);
        caze.setOccupation(true);
        piece = new Roi(TypePiece.TYPE_KING, Couleur.COLOR_WHITE, caze);
        piece.setCase(caze);
        matriceCases[7][3] = caze;
        this.pieces.add(piece);

        // Mis en place des reines
        caze = new Case(0, 4);
        caze.setOccupation(true);
        piece = new Reine(TypePiece.TYPE_QUEEN, Couleur.COLOR_BLACK, caze);
        piece.setCase(caze);
        matriceCases[0][4] = caze;
        this.pieces.add(piece);

        caze = new Case(7, 4);
        caze.setOccupation(true);
        piece = new Reine(TypePiece.TYPE_QUEEN, Couleur.COLOR_WHITE, caze);
        piece.setCase(caze);
        matriceCases[7][4] = caze;
        this.pieces.add(piece);

        // Mis en place des cavaliers
        caze = new Case(0, 1);
        caze.setOccupation(true);
        piece = new Cavalier(TypePiece.TYPE_KNIGHT, Couleur.COLOR_BLACK, caze);
        piece.setCase(caze);
        matriceCases[0][1] = caze;
        this.pieces.add(piece);

        caze = new Case(0, 6);
        caze.setOccupation(true);
        piece = new Cavalier(TypePiece.TYPE_KNIGHT, Couleur.COLOR_BLACK, caze);
        piece.setCase(caze);
        matriceCases[0][6] = caze;
        this.pieces.add(piece);

        caze = new Case(7, 1);
        caze.setOccupation(true);
        piece = new Cavalier(TypePiece.TYPE_KNIGHT, Couleur.COLOR_WHITE, caze);
        piece.setCase(caze);
        matriceCases[7][1] = caze;
        this.pieces.add(piece);

        caze = new Case(7, 6);
        caze.setOccupation(true);
        piece = new Cavalier(TypePiece.TYPE_KNIGHT, Couleur.COLOR_WHITE, caze);
        piece.setCase(caze);
        matriceCases[7][6] = caze;
        this.pieces.add(piece);


        // Mis en place des Fous
        caze = new Case(0, 2);
        caze.setOccupation(true);
        piece = new Fou(TypePiece.TYPE_BISHOP, Couleur.COLOR_BLACK, caze);
        piece.setCase(caze);
        matriceCases[0][2] = caze;
        this.pieces.add(piece);

        caze = new Case(0, 5);
        caze.setOccupation(true);
        piece = new Fou(TypePiece.TYPE_BISHOP, Couleur.COLOR_BLACK, caze);
        piece.setCase(caze);
        matriceCases[0][5] = caze;
        this.pieces.add(piece);

        caze = new Case(7, 2);
        caze.setOccupation(true);
        piece = new Fou(TypePiece.TYPE_BISHOP, Couleur.COLOR_WHITE, caze);
        piece.setCase(caze);
        matriceCases[7][2] = caze;
        this.pieces.add(piece);

        caze = new Case(7, 5);
        caze.setOccupation(true);
        piece = new Fou(TypePiece.TYPE_BISHOP, Couleur.COLOR_WHITE, caze);
        piece.setCase(caze);
        matriceCases[7][5] = caze;
        this.pieces.add(piece);

        // Mis en place des Tours
        caze = new Case(0, 0);
        caze.setOccupation(true);
        piece = new Tour(TypePiece.TYPE_ROOK, Couleur.COLOR_BLACK, caze);
        piece.setCase(caze);
        matriceCases[0][0] = caze;
        this.pieces.add(piece);

        caze = new Case(0, 7);
        caze.setOccupation(true);
        piece = new Tour(TypePiece.TYPE_ROOK, Couleur.COLOR_BLACK, caze);
        piece.setCase(caze);
        matriceCases[0][7] = caze;
        this.pieces.add(piece);

        caze = new Case(7, 0);
        caze.setOccupation(true);
        piece = new Tour(TypePiece.TYPE_ROOK, Couleur.COLOR_WHITE, caze);
        piece.setCase(caze);
        matriceCases[7][0] = caze;
        this.pieces.add(piece);

        caze = new Case(7, 7);
        caze.setOccupation(true);
        piece = new Tour(TypePiece.TYPE_ROOK, Couleur.COLOR_WHITE, caze);
        piece.setCase(caze);
        matriceCases[7][7] = caze;
        this.pieces.add(piece);
        
        this.todo_maj = true;
    }

    public void add_Detruite(Piece piece) {
        this.pieces_detruites.add(piece);
    }

    public Case getIJ(int i, int j) {
        return this.matriceCases[i][j];
    }
    
    public void maj () {
    	this.todo_maj = true;
    }
   
    public void maj_done () {
    	this.todo_maj = false;
    }
    
    public boolean get_todoMaj () {
    	return this.todo_maj;
    }

}
