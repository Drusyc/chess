package Tests;

import plateau.Case;
import plateau.Plateau;

/**
 * Created by amadou on 17/11/14.
 */
public class Main {
    public static void main(String[] args) {
        Plateau board = Plateau.instance();
        Case[][] cases = Plateau.instance().getMatriceCases();
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("("+i+","+j+") " + cases[i][j].getPiece().getColor() + " ");
            }
            System.out.println("");
        }
        for (int i = 6; i <= 7; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("("+i+","+j+") " + cases[i][j].getPiece().getColor() + " ");
            }
            System.out.println("");
        }
    }
}

}
