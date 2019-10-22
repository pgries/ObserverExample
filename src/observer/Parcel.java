package observer;

import java.util.Observable;

/**
 * An observable parcel with a tracking number and location.
 * @author campbell
 *
 */
public class Parcel extends Observable {
    
    /** This observer.Parcel's tracking number. */
    private String trackingNumber;
    
    /** This observer.Parcel's location. */
    private String location;
    
    /**
     * Constructs a new observer.Parcel with tracking number trackingNumber and
     * location location.
     * @param trackingNumber This observer.Parcel's tracking number.
     * @param location This observer.Parcel's location.
     */
    public Parcel(String trackingNumber, String location) {
        this.trackingNumber = trackingNumber;
        this.location = location;

    }
    
    @Override
    public String toString() {
        return "observer.Parcel " + trackingNumber + ".";
    }

    /**
     * Sets this observer.Parcel's location to newLocation and notifies its Observers.
     * @param newLocation This observer.Parcel's new location.
     */
    public void updateLocation(String newLocation) {
        location = newLocation;
        setChanged();
        notifyObservers("Updated location to " + location + ".");
    }
}
