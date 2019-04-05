package behavioral.observer;

public final class DesingPatternObserverDemo {

    public static void main(String[] args) {

        final ObservableSubject subject = new ObservableSubject();
        final ObserverSubject observer = new ObserverSubject(subject);
        
        final Thread thread = new Thread(subject);
        thread.start();
        
    }

}
