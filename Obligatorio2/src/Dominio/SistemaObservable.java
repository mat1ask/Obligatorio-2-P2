package dominio; 

import java.util.Observable;


public class SistemaObservable extends Observable {
    
    public void notificar(){
        setChanged();
        notifyObservers();        
    }
}
