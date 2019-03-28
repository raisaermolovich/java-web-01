package by.epam.javatraining.yermalovich.task01.controller;

import by.epam.javatraining.yermalovich.task01.model.container.ActualOffer;
import by.epam.javatraining.yermalovich.task01.model.container.OffersArray;
import by.epam.javatraining.yermalovich.task01.model.entity.*;
import by.epam.javatraining.yermalovich.task01.model.exception.ArrayOverflowException;
import by.epam.javatraining.yermalovich.task01.model.exception.InvalidSearchParametersOrderException;
import by.epam.javatraining.yermalovich.task01.model.logic.Calculator;
import by.epam.javatraining.yermalovich.task01.model.logic.Search;
import by.epam.javatraining.yermalovich.task01.model.logic.Sorter;
import by.epam.javatraining.yermalovich.task01.view.ConsolePrinter;
import by.epam.javatraining.yermalovich.task01.view.Printable;

public class Main {
    public static void main(String[] args) {

        TouristTrip v1 = new Vacation();
        TouristTrip v2 = new Vacation(30, Transport.BUS, Meal.ALL_INCLUSIVE, "Greece", 1100);
        TouristTrip v3 = new Vacation(20, Transport.TRAIN, Meal.ONE_TIME, "France", 20);
        TouristTrip v4 = new Vacation(15, Transport.PLANE, Meal.TWO_TIMES, "Spain", 300);
        TouristTrip v5 = new Vacation(10, Transport.TRAIN, Meal.TWO_TIMES, "Spain", 400);
        TouristTrip f1 = new FamilyTrip(3, Transport.TRAIN, Meal.THREE_TIMES, "Ukraine", 700,
                3, 5, true);
        TouristTrip f2 = new FamilyTrip(7, Transport.PLANE, Meal.ALL_INCLUSIVE, "Bulgaria", 650,
                2, 5, false);

        ActualOffer list = new OffersArray();
        //OffersArrayStaticCreator arrayCreator = new OffersArrayStaticCreator();
        //ActualOffer list = arrayCreator.createContainer(8);
        try {
            list.addTour(v1);
            list.addTour(v2);
            list.addTour(v3);
            list.addTour(v4);
            list.addTour(v5);
            list.addTour(f1);
            list.addTour(f2);
        } catch (ArrayOverflowException e) {
            //LOG System.out.println("Exceed array.");//
        }

        Printable printer = new ConsolePrinter();

        printer.print("Source list - " + list);

        list.removeTour(v4);
        printer.print("List with removed item - " + list);

        printer.print("Sorted by Day Asc - " + Sorter.sortByDaysAsc(list));

        printer.print("Found by meal - " + Search.searchByMeal(list, Meal.ALL_INCLUSIVE));

        printer.print("Found by destination (Spain) - " + Search.searchByDestination(list, "Spain"));

        printer.print("Sorted by Day Asc - " + Sorter.sortByDaysAsc(list));

        try {
            printer.print("Found by price (200-400) - " + Search.searchByPrice(list, 200, 400));
        } catch (InvalidSearchParametersOrderException e) {
            // LOG
        }

        try {
            printer.print("Search By People Number (2-4) - " + Search.searchByPeopleNumber(list, 2, 4));
        } catch (InvalidSearchParametersOrderException e) {
            // LOG
        }


        printer.print("Search Special Offer (true) - " + Search.searchBySpecialOffer(list, true));

        printer.print("Sorted by Price Asc - " + Sorter.sortByPriceAsc(list));

        printer.print("Sorted by Price Desc - " + Sorter.sortByPriceDesc(list));

        printer.print("Calculator (total price) - " + Calculator.calculateTotalPrice(list));

    }
}
