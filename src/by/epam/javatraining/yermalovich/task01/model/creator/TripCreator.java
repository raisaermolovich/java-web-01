package by.epam.javatraining.yermalovich.task01.model.creator;

import by.epam.javatraining.yermalovich.task01.model.entity.*;

public interface TripCreator {
    TouristTrip createTrip();

    TouristTrip createTrip(int days, Transport transport, Meal meals, String destination);
}
