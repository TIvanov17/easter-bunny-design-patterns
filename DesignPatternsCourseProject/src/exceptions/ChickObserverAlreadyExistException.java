package exceptions;

public class ChickObserverAlreadyExistException extends RuntimeException {

    public ChickObserverAlreadyExistException(){
        super("! Chick Already Exist In entities.eggs.Egg Storage !");
    }

}
