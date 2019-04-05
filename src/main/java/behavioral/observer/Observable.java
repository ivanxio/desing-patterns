package behavioral.observer;
/**
 * This interface establishes the conditions to be met by an observable object.
 *
 * @author Ivan Garcia &lt;ivancho.ieg@outlook.com&gt;
 * @version 1.0.0
 */
public interface Observable {
    /**
     * Method used to add observer to observable object.
     * 
     * @param observer
     */
    public void add(final Observer observer);
    /**
     * Method used to delete an observer object from an observable object.
     * 
     * @param observer
     */
    public void delete(final Observer observer);
}
