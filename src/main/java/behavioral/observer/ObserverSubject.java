package behavioral.observer;

public class ObserverSubject implements Observer {
    
    private Observable observable;
    private int i = 0;
    
    public ObserverSubject(final Observable observable) {
        this.observable = observable;
        this.observable.add(this);
    }

    public void update() {
        System.out.println("State Change: ".concat(String.valueOf(i++)));
    }

}
