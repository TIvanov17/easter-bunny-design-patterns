package entities.storage;

import entities.observer.Observer;

public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyAllChickObservers();
}
