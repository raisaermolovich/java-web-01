package by.epam.javatraining.yermalovich.task01.model.exception;

public class TechnicalTouristTripException extends TouristTripException {

    public TechnicalTouristTripException () {
        super();
    }

    public TechnicalTouristTripException (String message) {
        super(message);
    }

    public TechnicalTouristTripException (Throwable cause) {
        super(cause);
    }

    public TechnicalTouristTripException (String message, Throwable cause) {
        super(message, cause);
    }
}
