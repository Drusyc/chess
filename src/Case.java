
/**
 * Created by amadou on 17/11/14.
 */
public class Case {
    private int x;
    private int y;
    private boolean occupee;
    
    	
    
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public boolean isOccupee() {
		return occupee;
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
