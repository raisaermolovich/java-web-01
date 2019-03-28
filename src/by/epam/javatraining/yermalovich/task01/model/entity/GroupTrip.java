package by.epam.javatraining.yermalovich.task01.model.entity;

import by.epam.javatraining.yermalovich.task01.model.exception.IncorrectMaxNumberOfPeople;
import by.epam.javatraining.yermalovich.task01.model.exception.IncorrectMinNumberOfPeople;

import java.util.Objects;

public class GroupTrip extends TouristTrip {

    private int minNumberOfPeople;
    private int maxNumberOfPeople;

    public GroupTrip () {
        super();
    }

    public GroupTrip(int days, Transport transport, Meal meals, String destination, double price, int minNumberOfPeople,
                     int maxNumberOfPeople) {
        super(days, transport, meals, destination, price);
        if (minNumberOfPeople > 0) {
            this.minNumberOfPeople = minNumberOfPeople;
        }
        if (maxNumberOfPeople >= minNumberOfPeople) {
            this.maxNumberOfPeople = maxNumberOfPeople;
        }
    }

    public GroupTrip(GroupTrip another) {
        super(another);
        this.minNumberOfPeople = another.minNumberOfPeople;
        this.maxNumberOfPeople = another.maxNumberOfPeople;
    }

    public int getMinNumberOfPeople() {
        return minNumberOfPeople;
    }

    public void setMinNumberOfPeople(int minNumberOfPeople) throws IncorrectMinNumberOfPeople {
        if (minNumberOfPeople > 0 && minNumberOfPeople <= maxNumberOfPeople) {
            this.minNumberOfPeople = minNumberOfPeople;
        } else {
            throw new IncorrectMinNumberOfPeople();
        }
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) throws IncorrectMaxNumberOfPeople {
        if (maxNumberOfPeople >= minNumberOfPeople) {
            this.maxNumberOfPeople = maxNumberOfPeople;
        } else {
            throw new IncorrectMaxNumberOfPeople();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GroupTrip groupTrip = (GroupTrip) o;
        return minNumberOfPeople == groupTrip.minNumberOfPeople &&
                maxNumberOfPeople == groupTrip.maxNumberOfPeople;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), minNumberOfPeople, maxNumberOfPeople);
    }

    @Override
    public String toString() {
        return
                super.toString() +
                ", minNumberOfPeople=" + minNumberOfPeople +
                ", maxNumberOfPeople=" + maxNumberOfPeople;
    }
}
