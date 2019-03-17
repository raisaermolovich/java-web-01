package by.epam.javatraining.yermalovich.task01.model.exception;

public class IncorrectOutputPathInFilePrinter extends TechnicalTouristTripException {

    public IncorrectOutputPathInFilePrinter () {
        super();
    }

    public IncorrectOutputPathInFilePrinter (String message) {
        super(message);
    }

    public IncorrectOutputPathInFilePrinter (Throwable cause) {
        super(cause);
    }

    public IncorrectOutputPathInFilePrinter (String message, Throwable cause) {
        super(message, cause);
    }

}
