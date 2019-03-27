package by.epam.javatraining.yermalovich.task01.util.creator;

import by.epam.javatraining.yermalovich.task01.model.entity.*;

public class VacationCreator {


    public TouristTrip createTrip() {
        return new Vacation();
    }

    public TouristTrip createTrip(int days, Transport transport, Meal meals, String destination) {
        return new Vacation(days, transport, meals, destination);
    }

    public TouristTrip createTrip(int days, Transport transport, Meal meals, String destination, String description) {
        return new Vacation(days, transport, meals, destination, description);
    }

    public TouristTrip createTrip(Vacation another) {
        return new Vacation(another);
    }
}
