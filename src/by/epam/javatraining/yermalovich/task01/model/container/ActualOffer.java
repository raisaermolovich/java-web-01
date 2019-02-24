package by.epam.javatraining.yermalovich.task01.model.container;

import by.epam.javatraining.yermalovich.task01.model.entity.TouristTrip;
import by.epam.javatraining.yermalovich.task01.model.exception.IncorrectIndexException;


public interface ActualOffer {

    void addTour(TouristTrip tour);

    void removeTour(TouristTrip tour);

    int numberOfTours();

    TouristTrip get(int index) throws IncorrectIndexException;

    void add(int index, TouristTrip tour) throws IncorrectIndexException;
}
