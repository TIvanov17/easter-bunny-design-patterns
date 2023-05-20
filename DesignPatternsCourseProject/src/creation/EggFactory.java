package creation;

import entities.EasterBunny;
import entities.eggs.ChickenEgg;
import entities.eggs.DinosaurEgg;
import entities.eggs.Egg;
import entities.eggs.QuailEgg;
import entities.enums.EggTypeEnum;
import exceptions.GeneralEasterException;

public class EggFactory implements AbstractEggFactory {

    private static EggFactory eggFactory;

    private EggFactory(){
    }

    public static EggFactory getEggFactory(){
        if(eggFactory == null){
            eggFactory = new EggFactory();
        }

        return eggFactory;
    }

    @Override
    public Egg createQuailEgg() {
        return new QuailEgg();
    }

    @Override
    public Egg createChickenEgg() {
        return new ChickenEgg();
    }

    @Override
    public Egg createDinosaurEgg() {
        return new DinosaurEgg();
    }
}
