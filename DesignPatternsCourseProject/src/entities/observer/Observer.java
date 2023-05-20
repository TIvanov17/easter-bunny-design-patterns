package entities.observer;

import entities.storage.Storage;

public interface Observer {

    void update();

    void setStorageToObserve(Storage storageToObserve);
}

