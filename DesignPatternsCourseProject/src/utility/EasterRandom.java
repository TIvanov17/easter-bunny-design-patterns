package utility;

import entities.enums.ColorEnum;
import entities.enums.StickerEnum;

import java.util.Random;

public class EasterRandom {

    private static Random random = new Random();

    private EasterRandom(){

    }

    public static int getRandomNumber(int upperBound){
        return random.nextInt(upperBound);
    }

    public static ColorEnum generateRandomColor(){
        ColorEnum[] allColors = ColorEnum.values();
        return allColors[getRandomNumber(allColors.length)];
    }

    public static StickerEnum generateRandomSticker(){
        StickerEnum[] allStickers = StickerEnum.values();
        return allStickers[getRandomNumber(allStickers.length)];
    }

}
