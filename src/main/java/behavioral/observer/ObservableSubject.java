package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ivan
 * @version 1.0.0
 */
public class ObservableSubject implements Observable, Runnable {

    private List<Observer> observers = new ArrayList<Observer>();

    public void run() {
        try {
            int i = 0;
            while (i < 10) {
                Thread.sleep(1000);
                this.notifyAllObservers();
                i++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void add(final Observer observer) {
        this.observers.add(observer);
    }

    public void delete(final Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }
}