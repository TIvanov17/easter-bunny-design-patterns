package entities.decorators;

import entities.eggs.Egg;
import entities.enums.EggTypeEnum;
import entities.enums.StickerEnum;

public class StickerEggDecorator extends EggDecorator {

    private StickerEnum sticker;

    public StickerEggDecorator(Egg egg, StickerEnum sticker) {
        super(egg);
        this.sticker = sticker;
    }

    public StickerEnum getSticker() {
        return sticker;
    }

    public void setSticker(StickerEnum sticker) {
        this.sticker = sticker;
    }

    @Override
    public String toString() {
        return super.toString() + " Също така имам " +  this.getSticker().toString().toLowerCase() + " стикер !";
    }
}
