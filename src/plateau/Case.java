package plateau;

import pieces.Piece;

/**
 * Created by amadou on 17/11/14.
 */
public class Case {
    private int x;
    private int y;
    private boolean occupee;
    private Piece piece = null;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setOccupation(boolean occupee) {
        this.occupee = occupee;
    }

    public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public boolean isOccupee() {
		return occupee;
	}

    public void setPiece(Piece piece) {
    }
    
    
  
    
    
    /*
    private ArrayList<Observateur> listeObservateurs = new ArrayList<Observateur>();


    @Override
    public void attach(Observateur obs) {
        this.listeObservateurs.add(obs);
    }

    @Override
    public void detach() {
        //Suppression de tous les observateurs
        this.listeObservateurs = new ArrayList<Observateur>();
    }

    @Override
    public void inform() {
        for (Observateur obs : this.listeObservateurs) {
            obs.mAj();
        }
    }*/
}
