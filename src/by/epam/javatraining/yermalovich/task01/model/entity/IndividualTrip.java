package by.epam.javatraining.yermalovich.task01.model.entity;

import java.util.Objects;

public class IndividualTrip extends TouristTrip {

    private int numberOfPeople;

    {
        numberOfPeople = 1;
    }

    public IndividualTrip () {
        super();
    }

    public IndividualTrip(int days, Transport transport, Meal meals, String destination) {
        super(days, transport, meals, destination);
    }

    public IndividualTrip(IndividualTrip another) {
        super(another);
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IndividualTrip that = (IndividualTrip) o;
        return numberOfPeople == that.numberOfPeople;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), numberOfPeople);
    }

    @Override
    public String toString() {
        return  super.toString() +
                "numberOfPeople=" + numberOfPeople;
    }
}
