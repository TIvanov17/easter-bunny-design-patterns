package entities.storage;

import entities.decorators.EggDecorator;
import entities.observer.Observer;
import entities.eggs.Egg;
import exceptions.ChickObserverAlreadyExistException;
import exceptions.GeneralEasterException;
import exceptions.UnknownChickObserverException;

import java.util.ArrayList;
import java.util.List;

public class EggStorage implements Storage {

    private final List<EggDecorator> eggsCollection;
    private static final int MAX_NUMBER_OF_EGGS = 5;
    private final List<Observer> chickObserverCollection;

    public EggStorage(){
        this.eggsCollection = new ArrayList<>();
        this.chickObserverCollection = new ArrayList<>();
    }

    @Override
    public void addEgg(EggDecorator egg) {

        this.ensureEggNotNull(egg);

        if(!this.eggsCollection.contains(egg)){
            this.eggsCollection.add(egg);
        }

        this.checkNumberOfEggs();
    }

    @Override
    public int getTotalSavedEggs(){
        return this.eggsCollection.size();
    }

    @Override
    public void attach(Observer chickObserver){

        if(!this.chickObserverCollection.contains(chickObserver)){
            this.chickObserverCollection.add(chickObserver);
            chickObserver.setStorageToObserve(this);
            return;
        }
        throw new ChickObserverAlreadyExistException();
    }

    @Override
    public void detach(Observer chickObserver){

        if(!this.chickObserverCollection.contains(chickObserver)){
            throw new UnknownChickObserverException();
        }
        this.chickObserverCollection.remove(chickObserver);
        chickObserver.setStorageToObserve(null);
    }

    @Override
    public void notifyAllChickObservers(){
        this.chickObserverCollection.forEach(Observer::update);
    }

    private void checkNumberOfEggs(){
        if(this.eggsCollection.size() > MAX_NUMBER_OF_EGGS){
            this.notifyAllChickObservers();
        }
    }

    private void ensureEggNotNull(Egg egg){
        if(egg == null){
            throw new GeneralEasterException("! Egg Is Invalid !");
        }
    }

}
