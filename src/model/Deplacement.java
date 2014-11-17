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
				if((init.getY()-1)==dest.getY()&& dest.getY()>=0){ //coordonées valides
					if(dest.getPiece()==null){ //on peut déplacer
						dest.setPiece(p);
						//dest.informe() 
					}
				}
			}
			else{
				if( ((init.getX()+1)==dest.getX() || (init.getX()-1)==dest.getX()) 
						&& (init.getY()-1)==dest.getY() && 
						dest.getY()>=0 && dest.getX()<=7 && dest.getX()>=0
						&& dest.getPiece()!=null && dest.getPiece().getColor()!=p.getColor()){
						dest.detruirePiece(); //on a pris la piece adverse
						dest.setPiece(p);
				}
				
			}
		}
		else{
			
			if(init.getX()==dest.getX()){ // mouvement
				if((init.getY()+1)==dest.getY()&& dest.getY()<=7){ //coordonées valides
					if(dest.getPiece()==null){ //on peut déplacer
						dest.setPiece(p);
						//dest.informe() 
					}
				}
			}
			else{
				if( ((init.getX()+1)==dest.getX() || (init.getX()-1)==dest.getX()) 
						&& (init.getY()+1)==dest.getY() && 
						dest.getY()<=7 && dest.getX()<=7 && dest.getX()>=0
						&& dest.getPiece()!=null && dest.getPiece().getColor()!=p.getColor()){
						dest.detruirePiece(); //on a pris la piece adverse
						dest.setPiece(p);
				}
				
			}
		}
		
	}

	@Override
	public void visite(Tour p) {
		Case init = p.getCase();
		boolean valid = true;
		
		if(init.getX()==dest.getX()){ // mouvement vertical
			Plateau board = dest.getBoard();
			
			if (init.getY()>dest.getY()){
				for(int i=init.getY()-1; i<dest.getY(); i++)
					valid = valid & board.getIJ(init.getX(),i); 
			}
			
		}
		else
			if(init.getY()==dest.getY()){ // mouvement horisontal
				
			}
		
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
