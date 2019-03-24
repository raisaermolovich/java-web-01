package by.epam.javatraining.yermalovich.task01.model.entity;

import java.util.Objects;

public class Vacation extends IndividualTrip {

    private String description;

    public Vacation() {
        super();
        description = "No description";
    }

    public Vacation(int days, Transport transport, Meal meals, String destination) {
        super(days, transport, meals, destination);
    }


    public Vacation(int days, Transport transport, Meal meals, String destination, String description) {
        super(days, transport, meals, destination);
        this.description = description;
    }

    public Vacation (Vacation another) {
        super(another);
        this.description = another.description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String destination) {
        if (description != null) {
            this.description = description;
        }
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
                super.toString() +
                ", description=" + getDescription() +
                '}';
    }
}
