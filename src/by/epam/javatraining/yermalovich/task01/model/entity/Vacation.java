package by.epam.javatraining.yermalovich.task01.model.entity;

import java.util.Objects;

public class Vacation extends TouristTrips {
    private String destination;

    public Vacation() {
        super();
        destination = "Not specified.";
    }

    public Vacation(String destination) {
        super();
        this.destination = destination;
    }

    public Vacation(int days, Transport transport, Meal meals, String destination) {
        super(days, transport, meals);
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vacation vacation = (Vacation) o;
        return Objects.equals(destination, vacation.destination);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), destination);
    }

    @Override
    public String toString() {
        return "Vacation{" +
                "destination='" + destination + '\'' +
                "days=" + getDays() +
                ", transport=" + getTransport() +
                ", meals=" + getMeals() +
                '}';
    }
}
