package observer;

/**
 * Created by amadou on 17/11/14.
 */
public interface Observateur {
    public void attach(Observateur obs);
    public void detach();
    public void inform();
}
