package observer;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by amadou on 17/11/14.
 */
abstract public class Observable {

    private Set<Observateur> listeObservateurs;

    public Observable () {
    	this.listeObservateurs = new HashSet<Observateur>();
    }
    
    public void attach(Observateur o) {
        this.listeObservateurs.add(o);
    }

    public void detach(Observateur o) {
        //Suppression de tous les observateurs
        this.listeObservateurs.remove(o); 
    }

    public void inform() {
        for (Observateur obs : this.listeObservateurs) {
            obs.mAj();
        }
    }
}