package logic;

import entities.eggs.Egg;

public interface EasterRenderer {

    void renderWelcomeGreeting();

    void renderMenu();

    void renderCreateEggMenu();

    void renderCreatedEggFirstWord(Egg egg);

    void renderErrorMessage(String message);

    void renderTotalEggs(int eggs);
}
