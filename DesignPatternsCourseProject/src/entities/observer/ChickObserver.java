package entities.observer;


import entities.storage.Storage;

import java.time.LocalDateTime;

public class ChickObserver implements Observer {

    private Storage storageToObserve;
    private int id;
    private String name;
    private LocalDateTime createdOn;

    private static int nextChickenId;

    public ChickObserver(String name){
        this.name = name;
        this.id = nextChickenId++;
    }

    @Override
    public void setStorageToObserve(Storage storageToObserve){
        this.storageToObserve = storageToObserve;
    }

    @Override
    public void update(){
        System.out.println(this + ": Яйцата са готови");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Пиле с номер " + this.id + " и име " + this.name;
    }
}
