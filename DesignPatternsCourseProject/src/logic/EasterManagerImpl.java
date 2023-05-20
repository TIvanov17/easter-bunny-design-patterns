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

public class EasterManagerImpl implements EasterManager{

    private AbstractEggFactory factory;

    private EasterBunny easterBunny;

    private final EasterRenderer easterRenderer;

    private boolean isGameEnd;

    public EasterManagerImpl(){
        this.easterRenderer = new EasterRendererImpl();
    }

    @Override
    public void start(){
        this.initStart();
        this.easterRenderer.renderWelcomeGreeting();
        this.easterLoop();
    }

    private void easterLoop(){

        while (!isGameEnd){

            this.easterRenderer.renderMenu();
            boolean isGameExitChoose = this.chooseOption();

            isGameEnd = this.checkIsGameEnd(isGameExitChoose);
            int totalEggs = this.easterBunny.getEggStorage().getTotalSavedEggs();
            this.easterRenderer.renderTotalEggs(totalEggs);
        }

    }

    private boolean checkIsGameEnd(boolean isGameExitChoose){
        return isGameExitChoose || this.easterBunny.getEggStorage().getTotalSavedEggs() > 5;
    }

    private boolean chooseOption(){

        int input = InputScanner.read();

        if(input == 1){
            this.createEgg();
            return false;
        }
        if(input == 2){
            return true;
        }

        this.easterRenderer.renderErrorMessage("Невалиден Вход");
        return false;
    }

    private void createEgg(){

        try {
            this.easterRenderer.renderCreateEggMenu();
            int input = InputScanner.read();
            Egg egg = this.createEggBasedOnInputChoice(input);
            EggDecorator eggDecorator = this.easterBunny.decorateEgg(egg);
            this.easterRenderer.renderCreatedEggFirstWord(eggDecorator);
            this.easterBunny.saveEgg(eggDecorator);
        }
        catch (InvalidEasterInputException e){
            this.easterRenderer.renderErrorMessage(e.getMessage());
        }
    }

    private Egg createEggBasedOnInputChoice(int inputChoice){

        if(inputChoice == 1){
            return factory.createQuailEgg();
        }
        if (inputChoice == 2){
            return factory.createChickenEgg();
        }
        if(inputChoice == 3){
            return factory.createDinosaurEgg();
        }

        throw new InvalidEasterInputException();
    }


    private void initStart(){

        easterBunny = EasterBunny.getEasterBunny();
        factory = EggFactory.getEggFactory();

        Observer firstChick = new ChickObserver("Малкото Пиле");
        Observer secondChick = new ChickObserver("Средното Пиле");
        Observer lastChick = new ChickObserver("Голямото Пиле");

        easterBunny.getEggStorage().attach(firstChick);
        easterBunny.getEggStorage().attach(secondChick);
        easterBunny.getEggStorage().attach(lastChick);
    }

}
