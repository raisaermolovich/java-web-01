package by.epam.javatraining.yermalovich.task01.model.entity;

import java.util.Objects;

public class TouristTrip {

    public static int totalOffers; //Should be public?

    private int days;
    private Transport transport;
    private Meal meals;
    private String destination;

    public TouristTrip() {
        days = 0;
        transport = Transport.NO_TRANSPORT;
        meals = Meal.NO_MEAL;
        destination = "Not specified.";
    }

    public TouristTrip(int days, Transport transport, Meal meals, String destination) {
        this.days = days;
        this.transport = transport;
        this.meals = meals;
        this.destination = destination;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Meal getMeals() {
        return meals;
    }

    public void setMeals(Meal meals) {
        this.meals = meals;
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
        TouristTrip that = (TouristTrip) o;
        return days == that.days &&
                transport == that.transport &&
                meals == that.meals &&
                Objects.equals(destination, that.destination);
    }

    @Override
    public int hashCode() {

        return Objects.hash(days, transport, meals, destination);
    }

    @Override
    public String toString() {
        return "TouristTrip{" +
                "days=" + days +
                ", transport=" + transport +
                ", meals=" + meals +
                ", destination=" + destination +
                '}';
    }
}
