package entities;

import creation.AbstractEggFactory;
import creation.EggFactory;
import entities.decorators.ColorEggDecorator;
import entities.decorators.EggDecorator;
import entities.decorators.StickerEggDecorator;
import entities.eggs.Egg;
import entities.enums.ColorEnum;
import entities.enums.StickerEnum;
import entities.storage.EggStorage;
import entities.storage.Storage;
import utility.EasterRandom;

import java.util.Random;

public class EasterBunny {

    private static EasterBunny instance;
    private final Storage eggStorage;

    private EasterBunny(){
        eggStorage = new EggStorage();
    }

    public static EasterBunny getEasterBunny() {
        if(instance == null){
            instance = new EasterBunny();
        }
        return instance;
    }

    public void saveEgg(EggDecorator eggDecorator){
        this.eggStorage.addEgg(eggDecorator);
    }

    public Storage getEggStorage() {
        return eggStorage;
    }

    public EggDecorator decorateEgg(Egg egg){

        int randNumber = EasterRandom.getRandomNumber(2);

        EggDecorator eggDecorator = null;

        if(randNumber == 0){
            eggDecorator = new ColorEggDecorator(egg, EasterRandom.generateRandomColor());
        }
        if(randNumber == 1){
            eggDecorator = new StickerEggDecorator(egg, EasterRandom.generateRandomSticker());
        }

        return eggDecorator;
    }

}
