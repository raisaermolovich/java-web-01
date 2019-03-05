package by.epam.javatraining.yermalovich.task01.model.exception;

public class IncorrectArrayIndexException extends TechnicalTouristTripException {

    public IncorrectArrayIndexException() {
        super();
    }

    public IncorrectArrayIndexException(String message) {
        super(message);
    }

    public IncorrectArrayIndexException(Throwable cause) {
        super(cause);
    }

    public IncorrectArrayIndexException(String message, Throwable cause) {
        super(message, cause);
    }
}
