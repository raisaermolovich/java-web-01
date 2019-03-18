package by.epam.javatraining.yermalovich.task01.model.exception;

public class IncorrectMaxNumberOfPeople extends LogicalTouristTripException {

    public IncorrectMaxNumberOfPeople () {
        super();
    }

    public IncorrectMaxNumberOfPeople (String message) {
        super(message);
    }
}
