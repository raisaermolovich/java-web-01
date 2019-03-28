package by.epam.javatraining.yermalovich.task01.util.creator;

import by.epam.javatraining.yermalovich.task01.model.entity.*;

public class VacationCreator {


    public TouristTrip createTrip() {
        return new Vacation();
    }

    public TouristTrip createTrip(int days, Transport transport, Meal meals, String destination, double price) {
        return new Vacation(days, transport, meals, destination, price);
    }

    public TouristTrip createTrip(int days, Transport transport, Meal meals, String destination, String description,
                                  double price) {
        return new Vacation(days, transport, meals, destination, description, price);
    }

    public TouristTrip createTrip(Vacation another) {
        return new Vacation(another);
    }
}
