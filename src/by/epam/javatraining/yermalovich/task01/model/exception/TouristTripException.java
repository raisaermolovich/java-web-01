package by.epam.javatraining.yermalovich.task01.model.exception;

public class TouristTripException extends Exception {

    public TouristTripException () {
        super();
    }

    public TouristTripException (String message) {
        super(message);
    }

    public TouristTripException (Throwable cause) {
        super(cause);
    }

    public TouristTripException (String message, Throwable cause) {
        super(message, cause);
    }

}
