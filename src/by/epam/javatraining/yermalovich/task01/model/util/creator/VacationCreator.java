package by.epam.javatraining.yermalovich.task01.model.util.creator;

import by.epam.javatraining.yermalovich.task01.model.entity.*;

public class VacationCreator implements TripCreator {

    @Override
    public TouristTrip createTrip() {
        return new Vacation();
    }

    @Override
    public TouristTrip createTrip(int days, Transport transport, Meal meals, String destination) {
        return new Vacation(days, transport, meals, destination);
    }

    @Override
    public String toString() {
        return "VacationCreator";
    }
}
