package entities.decorators;

import entities.eggs.Egg;
import entities.enums.ColorEnum;

public class ColorEggDecorator extends EggDecorator {

    private ColorEnum color;

    public ColorEggDecorator(Egg egg, ColorEnum color) {
        super(egg);
        this.color = color;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return super.toString() + " Имам " + this.getColor().toString().toLowerCase() + " цвят !";
    }

}
