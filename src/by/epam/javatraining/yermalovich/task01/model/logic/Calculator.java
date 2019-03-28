package by.epam.javatraining.yermalovich.task01.model.logic;

import by.epam.javatraining.yermalovich.task01.model.container.ActualOffer;
import by.epam.javatraining.yermalovich.task01.model.entity.TouristTrip;

public class Calculator {

    public static double calculateTotalPrice (ActualOffer list) {
        double totalPrice = 0;
        if (list != null) {
            for (TouristTrip trip : list.getArray()) {
                if (trip != null) {
                    totalPrice += trip.getPrice();
                }
            }
        } else {
            totalPrice = -1;
        }

        return totalPrice;
    }
}
