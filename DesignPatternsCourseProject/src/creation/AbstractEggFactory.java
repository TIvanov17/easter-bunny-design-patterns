package creation;

import entities.eggs.Egg;

public interface AbstractEggFactory {

    Egg createQuailEgg();
    Egg createChickenEgg();
    Egg createDinosaurEgg();

}
