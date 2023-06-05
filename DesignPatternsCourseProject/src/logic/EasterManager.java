package logic;

import creation.AbstractEggFactory;
import creation.EggFactory;
import entities.EasterBunny;
import entities.decorators.EggDecorator;
import entities.eggs.Egg;
import entities.observer.ChickObserver;
import entities.observer.Observer;
import exceptions.InvalidEasterInputException;
import utility.InputScanner;

public interface EasterManager {
    void start();
}
