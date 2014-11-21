package plateau;

import java.util.Observable;

import pieces.Piece;


public class Case extends Observable {
    private int x;
    private int y;
    private boolean occupee;
    private Piece piece = null;
    
    public Case(int x, int y) {
        this.x = x;
    }
    
    private Plateau board;
    
    public Case() {
    }

    public void setX(int x) {
        this.x = x;
    }

    public Plateau getBoard() {
		return board;
	}

	public void setBoard(Plateau board) {
		this.board = board;
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
    	this.piece = piece;
    }
    
    public void detruirePiece () {
    	if (this.piece != null) {
    		board.add_Detruite(this.piece);
    	}
    }
    
    public Piece getPiece () {
    	return this.piece;
    }
    
    public void informe () {
    	this.board.maj();
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
    public void informe() {
        for (Observateur obs : this.listeObservateurs) {
            obs.mAj();
        }
    }*/
}
