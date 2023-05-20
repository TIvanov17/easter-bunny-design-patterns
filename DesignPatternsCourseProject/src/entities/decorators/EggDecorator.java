package entities.decorators;

import entities.eggs.Egg;

public abstract class EggDecorator extends Egg {

    private final Egg egg;

    public EggDecorator(Egg egg){
        super();
        this.egg = egg;
    }

    @Override
    public String toString(){
        return this.egg.toString();
    }
}
