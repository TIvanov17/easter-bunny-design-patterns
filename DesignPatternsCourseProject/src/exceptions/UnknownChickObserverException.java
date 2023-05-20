package exceptions;

public class UnknownChickObserverException extends RuntimeException{
    public UnknownChickObserverException(){
        super("! Chick Not Found In entities.eggs.Egg Storage !");
    }
}
