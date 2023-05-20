package entities.storage;

import entities.decorators.EggDecorator;
import entities.eggs.Egg;

public interface Storage extends Subject{

    void addEgg(EggDecorator egg);

    int getTotalSavedEggs();
}
