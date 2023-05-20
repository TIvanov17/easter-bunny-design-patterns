package exceptions;

public class InvalidEasterInputException extends GeneralEasterException{
    public InvalidEasterInputException(String message) {
        super(message);
    }

    public InvalidEasterInputException(){
        super("! Невалиден Вход !");
    }
}
