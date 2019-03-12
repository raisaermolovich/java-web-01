package by.epam.javatraining.yermalovich.task01.model.container;

import by.epam.javatraining.yermalovich.task01.model.entity.TouristTrip;
import by.epam.javatraining.yermalovich.task01.model.exception.ArrayOverflowException;
import by.epam.javatraining.yermalovich.task01.model.exception.IncorrectArrayIndexException;


public interface ActualOffer {

    void addTour(TouristTrip tour) throws ArrayOverflowException;

    void removeTour(TouristTrip tour);

    int numberOfTours();

    TouristTrip get(int index) throws IncorrectArrayIndexException;

    void add(int index, TouristTrip tour)throws IncorrectArrayIndexException;
}
