package by.epam.javatraining.yermalovich.task01.controller;

import by.epam.javatraining.yermalovich.task01.model.container.ActualOffers;
import by.epam.javatraining.yermalovich.task01.model.container.OffersList;
import by.epam.javatraining.yermalovich.task01.model.entity.*;

public class Main {
    public static void main (String[] args) {

        Vacation v1 = new Vacation();
        Vacation v2 = new Vacation("Greece");
        Vacation v3 = new Vacation(10, Transport.BUS, Meals.ALL_INCLUSIVE, "Greece");

        ActualOffers list = new OffersList();
        list.addTour(v1);
        list.addTour(v2);
        list.addTour(v3);
        System.out.println(list.toString());

        list.removeTour(v1);
        System.out.println(list.toString());

        System.out.println(list.numberOfTours());
    }
}
