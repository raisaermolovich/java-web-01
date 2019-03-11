package by.epam.javatraining.yermalovich.task01.model.container;

import by.epam.javatraining.yermalovich.task01.model.entity.TouristTrip;
import by.epam.javatraining.yermalovich.task01.model.exception.IncorrectArrayIndexException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OffersList implements ActualOffer {

    private List<TouristTrip> list;

    public OffersList() {
        list = new ArrayList<>();
    }

    public OffersList(List<TouristTrip> list) {
        if (list != null) {
            this.list = list;
        } else {
            list = new ArrayList<>();
        }
    }

    public List<TouristTrip> getList() {
        return list; //WRONG
    }

    public void setList(List<TouristTrip> list) {
        if (list != null) {
            this.list = list;
        }
    }

    @Override
    public void addTour(TouristTrip tour) {
        if (tour != null) {
            list.add(tour);
        }
    }

    @Override
    public void removeTour(TouristTrip tour) {
        if (tour != null && list.contains(tour)) {
            list.remove(tour);
        }
    }

    @Override
    public int numberOfTours() {
        return (list.size());
    }

    @Override
    public TouristTrip get(int index) throws IncorrectArrayIndexException {
        if (index >= list.size() || index < 0 || index >= list.size()) {
            throw new IncorrectArrayIndexException("Index out of range.");
        }
        TouristTrip tour = list.get(index);
        return tour;
    }

    @Override
    public void add(int index, TouristTrip tour) throws IncorrectArrayIndexException {
        if (index >= list.size() || index < 0 || index >= list.size()) {
            throw new IncorrectArrayIndexException("Index out of range.");
        }
        list.add(index, tour);
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("OffersList: \n");

        for (TouristTrip t : list) {
            builder.append(t).append("\n");
        }
        return builder + "";
    }
}
