package observer;

import java.util.Observable;
import java.util.Observer;

/**
 *     A customer.
 * @author campbell
 */
public class Customer implements Observer {
    
    /** This observer.Customer's name. */
    private String name;
    
    /**
     * Constructs a new observer.Customer named named.
     * @param name The new observer.Customer's name.
     */
    public Customer(String name) {
        this.name = name;
    }
    
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("observer.Customer " + this.name
                + " observed a change in " + o);
        System.out.println("   The notification said: " + arg);
    }
    
    @Override
    public String toString() {
        return name;
    }

}
