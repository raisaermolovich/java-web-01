package by.epam.javatraining.yermalovich.task01.controller;

import by.epam.javatraining.yermalovich.task01.model.container.IActualOffers;
import by.epam.javatraining.yermalovich.task01.model.container.*;
import by.epam.javatraining.yermalovich.task01.model.entity.*;

public class Main {
    public static void main(String[] args) {

        Vacation v1 = new Vacation();
        Vacation v2 = new Vacation("Greece");
        Vacation v3 = new Vacation(10, Transport.BUS, Meal.ALL_INCLUSIVE, "Greece");

        /*IActualOffers list = new OffersListI();
        list.addTour(v1);
        list.addTour(v2);
        list.addTour(v3);
        System.out.println(list.toString());

        list.removeTour(v1);
        System.out.println(list.toString());

        System.out.println(list.numberOfTours());*/

        IActualOffers list = new OffersArray();
        list.addTour(v1);
        list.addTour(v2);
        list.addTour(v3);
        System.out.println(list.toString());

        list.removeTour(v2);
        System.out.println(list.toString());

        System.out.println(list.numberOfTours());
    }
}
