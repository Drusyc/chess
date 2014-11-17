package plateau;


import enumeration.Couleur;
import pieces.Piece;
import pieces.Pion;

public class Plateau {
    // unique instance de la classe plateau
    final private static Plateau plateau = new Plateau();

    // les cases du plateau
    private Case[][] matriceCases = new Case[64][64];

    // renvoit l'instance unique de la classe Plateau
    public static Plateau instance () {
        return plateau;
    }
    /* constructeur privé de la classe Plateau pour interdire
    l'instanciation de la classe Plateau depuis une autre classe
     */
    private Plateau() {

        for (int j = 0; j < 8; j++) {
            Case caze = new Case(j,1);
            caze.setOccupation(true);
            Piece piece = new Pion("Pion", Couleur.COLOR_WHITE,caze);
            piece.setCase(caze);
            matriceCases[1][j] = caze;

        }
        for (int j = 0; j < 8; j++) {
            Case caze = new Case(j,6);
            caze.setOccupation(true);
            Piece piece = new Pion("Pion",Couleur.COLOR_BLACK,caze);
            piece.setCase(caze);
            matriceCases[1][j] = caze;
            }



    }


}
