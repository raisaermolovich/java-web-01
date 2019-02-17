package by.epam.javatraining.yermalovich.task01.model.container;

import by.epam.javatraining.yermalovich.task01.model.entity.TouristTrips;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OffersList implements ActualOffers {

    private List<TouristTrips> list;

    public OffersList () {
        list = new ArrayList<>();
    }

    public OffersList (List<TouristTrips> list) {
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

    public void removeTour (TouristTrips tour) {
        if (list.contains(tour)) list.remove(tour);
    }

    public int numberOfTours () {
        return (list.size());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OffersList that = (OffersList) o;
        return Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {

        return Objects.hash(list);
    }

    /*
    @Override
    public String toString() {
        return "OffersList{" +
                "list=" + list +
                '}';
    }*/

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("OffersList: \n");

        for (TouristTrips t : list) {
            builder.append(t).append("\n");
        }
        return builder + "";
    }
}
