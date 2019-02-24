package by.epam.javatraining.yermalovich.task01.model.entity;

import java.util.Objects;

public class Vacation extends TouristTrip {

    private String description;

    {
        description = "No description";
    }

    public Vacation() {
        super();
    }

    public Vacation(int days, Transport transport, Meal meals, String destination) {
        super(days, transport, meals, destination);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String destination) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vacation vacation = (Vacation) o;
        return Objects.equals(description, vacation.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), description);
    }

    @Override
    public String toString() {
        return "Vacation{" +
                "days=" + getDays() +
                ", transport=" + getTransport() +
                ", meals=" + getMeals() +
                ", destination=" + getDestination() +
                ", description=" + getDescription() +
                '}';
    }
}
