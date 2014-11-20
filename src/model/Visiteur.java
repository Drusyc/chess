package model;

import pieces.*;


public interface Visiteur {
void visite(Pion p);
void visite(Tour p);
void visite(Fou p);
void visite(Reine p);
void visite(Roi p);
void visite(Cavalier p);

}
