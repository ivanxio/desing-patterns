package behavioral.observer;
/**
 * This interface establishes the conditions to be met by observer object.
 *
 * @author Ivan Garcia &lt;ivancho.ieg@outlook.com&gt;
 * @version 1.0.0
 */
public interface Observer {
    /**
     * This method performs an operation when the observable object changes state.
     */
    public void update() ;
}
