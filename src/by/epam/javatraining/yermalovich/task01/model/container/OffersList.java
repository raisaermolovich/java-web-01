package by.epam.javatraining.yermalovich.task01.model.container;

import by.epam.javatraining.yermalovich.task01.model.entity.TouristTrip;
import by.epam.javatraining.yermalovich.task01.model.exception.IncorrectIndexException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OffersList implements ActualOffer {

    private List<TouristTrip> list;

    public OffersList() {
        list = new ArrayList<>();
    }

    public OffersList(List<TouristTrip> list) {
        this.list = list;
    }

    public List<TouristTrip> getList() {
        return list;
    }

    public void setList(List<TouristTrip> list) {
        this.list = list;
    }

    @Override
    public void addTour(TouristTrip tour) {
        list.add(tour);
    }

    @Override
    public void removeTour(TouristTrip tour) {
        if (list.contains(tour)) list.remove(tour);
    }

    @Override
    public int numberOfTours() {
        return (list.size());
    }

    @Override
    public TouristTrip get(int index) throws IncorrectIndexException {
        if (index >= list.size() || index < 0) {
            throw new IncorrectIndexException("Index out of range.");
        }
        TouristTrip tour = list.get(index);
        return tour;
    }

    @Override  //TRY/CATCH
    public void add(int index, TouristTrip tour) throws IncorrectIndexException {
        if (index >= list.size() || index < 0) {
            throw new IncorrectIndexException("Index out of range.");
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
