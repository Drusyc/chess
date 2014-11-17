package model;

import enumeration.Couleur;
import pieces.Cavalier;
import pieces.Fou;
import pieces.Piece;
import pieces.Pion;
import pieces.Reine;
import pieces.Roi;
import pieces.Tour;
import plateau.*;

public class Deplacement implements Visiteur {
    
	Case dest;
    
    
    public void deplace (Piece p){
    	
    }
    
	@Override
	public void visite(Pion p) {
		
		Case init = p.getCase();
		
		if(p.getColor()==Couleur.COLOR_WHITE){
			if(init.getX()==dest.getX()){ // mouvement
				if((init.getY()+1)==dest.getY()&& dest.getY()<=63){ //coordonées valides
					if(dest.getPiece()==null) //on peut déplacer
						dest.setPiece(p);
				}
			}
			else{
				
			}
		}
		else{
		}
		
	}

	@Override
	public void visite(Tour p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visite(Fou p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visite(Reine p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visite(Roi p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visite(Cavalier p) {
		// TODO Auto-generated method stub
		
	}

}
