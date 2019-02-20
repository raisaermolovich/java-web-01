package by.epam.javatraining.yermalovich.task01.model.entity;

import java.util.Objects;

public class TouristTrips {

    public static int totalOffers; //паблик ли?

    private int days;
    private Transport transport;
    private Meal meals;

    static {
        totalOffers = 0;
    }

    {
        totalOffers++;
    }

    public TouristTrips() {
        days = 0;
        transport = Transport.NO_TRANSPORT;
        meals = Meal.NO_MEAL;
    }

    public TouristTrips(int days, Transport transport, Meal meals) {
        this.days = days;
        this.transport = transport;
        this.meals = meals;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TouristTrips that = (TouristTrips) o;
        return days == that.days &&
                transport == that.transport &&
                meals == that.meals;
    }

    @Override
    public int hashCode() {

        return Objects.hash(days, transport, meals);
    }

    @Override
    public String toString() {
        return "TouristTrips{" +
                "days=" + days +
                ", transport=" + transport +
                ", meals=" + meals +
                '}';
    }
}
