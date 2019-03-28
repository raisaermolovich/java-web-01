package by.epam.javatraining.yermalovich.task01.controller;

import by.epam.javatraining.yermalovich.task01.model.container.ActualOffer;
import by.epam.javatraining.yermalovich.task01.model.entity.*;
import by.epam.javatraining.yermalovich.task01.model.logic.Calculator;
import by.epam.javatraining.yermalovich.task01.model.logic.Search;
import by.epam.javatraining.yermalovich.task01.model.logic.Sorter;
import by.epam.javatraining.yermalovich.task01.util.creator.*;

public class Main {
    public static void main(String[] args) {

        VacationCreator vacation = new VacationCreator();

        TouristTrip v1 = vacation.createTrip();
        TouristTrip v2 = vacation.createTrip(30, Transport.BUS, Meal.ALL_INCLUSIVE, "Greece", 1100);
        TouristTrip v3 = vacation.createTrip(20, Transport.TRAIN, Meal.ONE_TIME, "France", 20);
        TouristTrip v4 = vacation.createTrip(15, Transport.PLANE, Meal.TWO_TIMES, "Spain", 300);
        TouristTrip v5 = vacation.createTrip(10, Transport.TRAIN, Meal.TWO_TIMES, "Spain", 400);
        TouristTrip f1 = new FamilyTrip(3, Transport.TRAIN, Meal.THREE_TIMES, "Ukraine", 700,
                3, 5, true);
        TouristTrip f2 = new FamilyTrip(7, Transport.PLANE, Meal.ALL_INCLUSIVE, "Bulgaria", 650,
                2, 5, false);


        //OffersArray CHECK

        //ActualOffer list = new OffersArray();
        OffersArrayStaticCreator arrayCreator = new OffersArrayStaticCreator();
        ActualOffer list = arrayCreator.createContainer(8);
        try {
            list.addTour(v1);
            list.addTour(v2);
            list.addTour(v3);
            list.addTour(v4);
            list.addTour(v5);
            list.addTour(f1);
            list.addTour(f2);
            System.out.println(list.toString());
        } catch (Exception e) {
            System.out.println("Exceed array.");//
        }

        list.removeTour(v4);
        System.out.println(list.toString());

        System.out.println(list.size());


        /*//TripComparator CHECK
        TripComparatorByDays comparator = new TripComparatorByDays();
        System.out.println("comparator: " + v4.equals(v4));*/

        System.out.println("Sorted by Day Asc: " + Sorter.sortByDaysAsc(list));

        ActualOffer foundList = Search.searchByMeal(list, Meal.ALL_INCLUSIVE);
        System.out.println("Found by meal: " + foundList);
        System.out.println(foundList.size());

        ActualOffer foundList2 = Search.searchByDestination(list, "Spain");
        System.out.println("Found by destination: " + foundList2);
        System.out.println(foundList2.size());

       /* ActualOffer foundList3 = Search.searchByAllParams(list, 10, 30, Transport.BUS, Meal.ALL_INCLUSIVE,
                "Greece");
        System.out.println("Found by ALL: " + foundList3);
        System.out.println(foundList3.size());*/

        System.out.println("Sorted by Day Asc: " + Sorter.sortByDaysAsc(list));

        try {
        ActualOffer foundList7 = Search.searchByPrice(list, 200, 400);
        System.out.println("Found by price: " + foundList7);
        System.out.println(foundList7.size());
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            ActualOffer foundList4 = Search.searchByDays(list, -1, -2);
            System.out.println("Found by -1: " + foundList4);
            System.out.println(foundList4.size());
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            ActualOffer foundList5 = Search.searchByPeopleNumber(list, 2, 4);
            System.out.println("searchByPeopleNumber: " + foundList5);
            System.out.println(foundList5.size());
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            ActualOffer foundList6 = Search.searchBySpecialOffer(list, true);
            System.out.println("searchBySpecialOffer: " + foundList6);
            System.out.println(foundList6.size());
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Sorted by Price Asc: " + Sorter.sortByPriceAsc(list));

        System.out.println("Sorted by Price Desc: " + Sorter.sortByPriceDesc(list));

        System.out.println("Calculator: " + Calculator.calculateTotalPrice(list));
    }
}
