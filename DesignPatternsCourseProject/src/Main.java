import creation.AbstractEggFactory;
import creation.EggFactory;
import entities.EasterBunny;
import entities.eggs.Egg;
import entities.observer.ChickObserver;
import entities.observer.Observer;
import entities.storage.Storage;
import logic.EasterManager;
import logic.EasterManagerImpl;

public class Main {

    public static void main(String[] args) {


        EasterManager easterManager = new EasterManagerImpl();
        easterManager.start();


//        AbstractEggFactory factory = EggFactory.getEggFactory();
//        EasterBunny easterBunny = EasterBunny.getEasterBunny();
//
//        Storage eggStorage = easterBunny.getEggStorage();
//
//        Observer first = new ChickObserver("ChickOne");
//        Observer second = new ChickObserver("ChickTwo");
//        Observer last = new ChickObserver("ChickThree");
//
//        eggStorage.attach(first);
//        eggStorage.attach(second);
//        eggStorage.attach(last);
//
//        Egg egg1 = factory.createChickenEgg();
//        easterBunny.saveEgg(easterBunny.decorateEgg(egg1));
//
//        Egg egg2 = factory.createDinosaurEgg();
//        easterBunny.saveEgg(easterBunny.decorateEgg(egg2));
//
//        Egg egg3 = factory.createQuailEgg();
//        easterBunny.saveEgg(easterBunny.decorateEgg(egg3));
//
//        Egg egg4 = factory.createChickenEgg();
//        easterBunny.saveEgg(easterBunny.decorateEgg(egg4));
//
//        Egg egg5 = factory.createDinosaurEgg();
//        easterBunny.saveEgg(easterBunny.decorateEgg(egg5));
//
//        Egg egg6 = factory.createQuailEgg();
//        easterBunny.saveEgg(easterBunny.decorateEgg(egg6));
//

    }
}
