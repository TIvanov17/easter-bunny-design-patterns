package logic;

import entities.eggs.Egg;

public class EasterRendererImpl implements EasterRenderer {

    @Override
    public void renderWelcomeGreeting(){
        System.out.println("ДОБРЕ ДОШЪЛ !");
    }

    @Override
    public void renderMenu(){
        System.out.println("Избери Опция");
        System.out.println("1. Създай Ново Яйце");
        System.out.println("2. Изход");
    }

    @Override
    public void renderCreateEggMenu(){
        System.out.println("Избери Яйце");
        System.out.println("1. Пъдпъдъчи");
        System.out.println("2. Кокоши");
        System.out.println("3. Динозавърски");
    }

    @Override
    public void renderCreatedEggFirstWord(Egg egg){
        if(egg != null){
            System.out.println(egg);
        }
    }

    @Override
    public void renderErrorMessage(String message){
        if(message != null){
            System.out.println(message);
        }
    }

    @Override
    public void renderTotalEggs(int eggs){
        System.out.println("Яйцата са " + eggs + " на брой.");
    }

}
