package by.epam.javatraining.yermalovich.task01.model.exception;

public class IncorrectMinNumberOfPeople extends LogicalTouristTripException{

    public IncorrectMinNumberOfPeople () {
        super();
    }

    public IncorrectMinNumberOfPeople (String message) {
        super(message);
    }
}
