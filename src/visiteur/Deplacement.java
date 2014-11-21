package visiteur;

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
    
    public Deplacement (Case d){
    	dest = d;
    }
    
    public void prendrePiece_deplace (Piece p){
    	if(dest.isOccupee() && dest.getPiece().getColor()!=p.getColor())
			dest.detruirePiece(); //on a pris la piece adverse
		
		dest.setPiece(p);
		dest.informe();
    }
    
    private boolean coord_valide(Case dest){
    	return true;
    }
    
	@Override
	public void visite(Pion p) {
		
		if(coord_valide(dest)){
		Case init = p.getCase();
		
		if(p.getColor()==Couleur.COLOR_WHITE){
			if(init.getX()==dest.getX()){ // mouvement
				if((init.getY()-1)==dest.getY()&& dest.getY()>=0){ //coordonées valides
					if(!dest.isOccupee()){ //on peut déplacer
						dest.setPiece(p);
						dest.informe(); 
					}
				}
			}
			else{
				if( ((init.getX()+1)==dest.getX() || (init.getX()-1)==dest.getX()) 
						&& (init.getY()-1)==dest.getY() )
					
					prendrePiece_deplace(p);
				}
				
			}
		
		else{
			
			if(init.getX()==dest.getX()){ // mouvement
				if((init.getY()+1)==dest.getY()&& dest.getY()<=7){ //coordonées valides
					if(!dest.isOccupee()){ //on peut déplacer
						dest.setPiece(p);
						dest.informe(); 
					}
				}
			}
			else{
				if( ((init.getX()+1)==dest.getX() || (init.getX()-1)==dest.getX()) 
						&& (init.getY()+1)==dest.getY())
					
					prendrePiece_deplace(p);
				}
				
			}
		
		}
	}

	@Override
	public void visite(Tour p) {
		
		if (coord_valide(dest)){
		Case init = p.getCase();
		boolean valid = false;
		Plateau board = dest.getBoard();
		
		if(init.getX()==dest.getX()){ // mouvement vertical
			valid = true;
			
			if (init.getY()>dest.getY()){
				for(int i=init.getY()-1; i>dest.getY(); i--)
					valid = valid & !(board.getIJ(init.getX(),i).isOccupee()); 
			}
			else{
				for(int i=init.getY()+1; i<dest.getY(); i++)
					valid = valid & !(board.getIJ(init.getX(),i).isOccupee()); 
			}
			
		}
		else
			if(init.getY()==dest.getY()){ // mouvement horisontal
				valid = true;
				if (init.getX()>dest.getX()){
					for(int i=init.getX()-1; i>dest.getX(); i--)
						valid = valid & !(board.getIJ(i, init.getY()).isOccupee()); 
				}
				else{
					for(int i=init.getX()+1; i<dest.getX(); i++)
						valid = valid & !(board.getIJ(i, init.getY()).isOccupee()); 
				}
			}
		
		if(valid){
			prendrePiece_deplace(p);
		}}
	}

	@Override
	public void visite(Fou p) {
		
		if (coord_valide(dest)){
		Case init = p.getCase();
		boolean valid = true;
		Plateau board = dest.getBoard();
		
		if(Math.max(init.getX(),dest.getX())-Math.min(init.getX(),dest.getX())==
				Math.max(init.getY(),dest.getY())-Math.min(init.getY(),dest.getY())){
			
		int deplX = (init.getX()<dest.getX())?1:-1;	
		int deplY = (init.getY()<dest.getY())?1:-1;	
		int j = init.getY(); 
			
		for(int i=init.getX(); i!=dest.getX(); i=i+deplX){
				valid = valid & (!(board.getIJ(i+deplX,j+deplY).isOccupee()) || ((i+deplX) == dest.getX())); 
				 j=j+deplY;
		}
		
		if(valid){
			prendrePiece_deplace(p);
		}
	}
		}
		
	}

	@Override
	public void visite(Reine p) {
		// TODO Auto-generated method stub
		visite((Fou)((Piece)p));
		visite((Tour)((Piece)p));
	}

	@Override
	public void visite(Roi p) {
		Case init = p.getCase();
		if (coord_valide(dest)){
			int X = init.getX();
			int Y = init.getY();
			int XX = dest.getX();
			int YY = dest.getY();
			if( dest!=init && Math.abs(XX-X)<=1 && Math.abs(YY-Y)<=1)
				prendrePiece_deplace(p);
		}
		
	}

	@Override
	public void visite(Cavalier p) {
		Case init = p.getCase();
		if (coord_valide(dest)){
			int X = init.getX();
			int Y = init.getY();
			int XX = dest.getX();
			int YY = dest.getY();
			if( (XX==X+1 && ((YY==Y-2)||(YY==Y+2)) ) || (XX==X-1 && ((YY==Y-2)||(YY==Y+2))) )
				prendrePiece_deplace(p);
		}
		
	}



}
