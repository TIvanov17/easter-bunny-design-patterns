package entities.eggs;

import entities.enums.EggTypeEnum;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Egg {

    private EggTypeEnum type;
    private String greeting;
    private LocalDate createdOn;

    public Egg(EggTypeEnum type, String greeting){
        this.type = type;
        this.greeting = greeting;
        this.createdOn = LocalDate.now();
    }

    public Egg(){

    }

    public String getGreeting() {
        return greeting;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    @Override
    public String toString() {
        return this.getGreeting() + " Създадено съм на " + this.getCreatedOn() + ".";
    }

}
