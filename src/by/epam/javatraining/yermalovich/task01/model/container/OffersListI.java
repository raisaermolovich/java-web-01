package by.epam.javatraining.yermalovich.task01.model.container;

import by.epam.javatraining.yermalovich.task01.model.entity.TouristTrips;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OffersListI implements IActualOffers {

    private List<TouristTrips> list;

    public OffersListI() {
        list = new ArrayList<>();
    }

    public OffersListI(List<TouristTrips> list) {
        this.list = list;
    }

    public List<TouristTrips> getList() {
        return list;
    }

    public void setList(List<TouristTrips> list) {
        this.list = list;
    }

    public void addTour(TouristTrips tour) {
        list.add(tour);
    }

    public void removeTour(TouristTrips tour) {
        if (list.contains(tour)) list.remove(tour);
    }

    public int numberOfTours() {
        return (list.size());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OffersListI that = (OffersListI) o;
        return Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {

        return Objects.hash(list);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("OffersListI: \n");

        for (TouristTrips t : list) {
            builder.append(t).append("\n");
        }
        return builder + "";
    }
}
