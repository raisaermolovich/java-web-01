package by.epam.javatraining.yermalovich.task01.model.container;

import by.epam.javatraining.yermalovich.task01.model.entity.TouristTrip;
import by.epam.javatraining.yermalovich.task01.model.exception.ArrayOverflowException;
import by.epam.javatraining.yermalovich.task01.model.exception.IncorrectArrayIndexException;


public interface ActualOffer {

    TouristTrip[] getArray();

    void setArray(TouristTrip[] array);

    void addTour(TouristTrip tour) throws ArrayOverflowException;

    void removeTour(TouristTrip tour);

    void add(int index, TouristTrip tour)throws IncorrectArrayIndexException;

    TouristTrip get(int index) throws IncorrectArrayIndexException;

    int size();

    boolean isEmpty();
}
