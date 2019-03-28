package by.epam.javatraining.yermalovich.task01.model.entity;

import java.util.Objects;

public class TouristTrip {

    private int days;
    private Transport transport;
    private Meal meals;
    private String destination;
    private double price;

    public TouristTrip() {
        days = 0;
        transport = Transport.NO_TRANSPORT;
        meals = Meal.NO_MEAL;
        destination = "Not specified";
        price = 0;
    }

    public TouristTrip(int days, Transport transport, Meal meals, String destination, double price) {
        this.days = 0;
        if (days > 0) {
            this.days = days;
        }
        this.transport = transport;
        this.meals = meals;
        this.destination = "Not specified";
        if (destination != null) {
            this.destination = destination;
        }
        this.price = 0;
        if (price > 0) {
            this.price = price;
        }
    }

    public TouristTrip (TouristTrip another) {
        this();
        if (another != null) {
            this.days = another.getDays();
            this.transport = another.getTransport();
            this.meals = another.getMeals();
            this.destination = another.getDestination();
            this.price = price;
        }
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        if (days > 0) {
            this.days = days;
        }
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
        if (destination != null) {
            this.destination = destination;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TouristTrip that = (TouristTrip) o;
        return days == that.days &&
                Double.compare(that.price, price) == 0 &&
                transport == that.transport &&
                meals == that.meals &&
                Objects.equals(destination, that.destination);
    }

    @Override
    public int hashCode() {

        return Objects.hash(days, transport, meals, destination, price);
    }

    @Override
    public String toString() {
        return  "days=" + days +
                ", transport=" + transport +
                ", meals=" + meals +
                ", price=" + price +
                ", destination=" + destination;
    }
}
