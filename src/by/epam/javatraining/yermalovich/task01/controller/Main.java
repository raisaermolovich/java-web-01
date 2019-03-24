package by.epam.javatraining.yermalovich.task01.controller;

import by.epam.javatraining.yermalovich.task01.model.container.ActualOffer;
import by.epam.javatraining.yermalovich.task01.model.entity.*;
import by.epam.javatraining.yermalovich.task01.model.logic.Search;
import by.epam.javatraining.yermalovich.task01.model.logic.Sorter;
import by.epam.javatraining.yermalovich.task01.util.creator.*;

public class Main {
    public static void main(String[] args) {

        VacationCreator vacation = new VacationCreator();

        TouristTrip v1 = vacation.createTrip();
        TouristTrip v2 = vacation.createTrip(30, Transport.BUS, Meal.ALL_INCLUSIVE, "Greece");
        TouristTrip v3 = vacation.createTrip(20, Transport.TRAIN, Meal.ONE_TIME, "France");
        TouristTrip v4 = vacation.createTrip(15, Transport.PLANE, Meal.TWO_TIMES, "Spain");
        TouristTrip v5 = vacation.createTrip(10, Transport.TRAIN, Meal.TWO_TIMES, "Spain");


                //OffersList CHECK
        /*ActualOffer list = new OffersList();
        list.addTour(v1);
        list.addTour(v2);
        list.addTour(v3);
        System.out.println(list.toString());

        list.removeTour(v1);
        System.out.println(list.toString());

        System.out.println(list.numberOfTours());*/


        //OffersArray CHECK

        //ActualOffer list = new OffersArray();
        OffersArrayStaticCreator arrayCreator = new OffersArrayStaticCreator();
        ActualOffer list = arrayCreator.createContainer(7);
        try {
            list.addTour(v1);
            list.addTour(v2);
            list.addTour(v3);
            list.addTour(v4);
            list.addTour(v5);
            System.out.println(list.toString());
        } catch (Exception e) {
            System.out.println("Exceed array.");
        }

        list.removeTour(v4);
        System.out.println(list.toString());

        System.out.println(list.size());


        /*//TripComparator CHECK
        TripComparator comparator = new TripComparator();
        System.out.println("comparator: " + comparator.compare(v4, v4));*/

        System.out.println("Sorted by Day Asc: " + Sorter.sortByDaysAsc(list));

        ActualOffer foundList = Search.searchByMeal(list, Meal.ALL_INCLUSIVE);
        System.out.println("Found by meal: " + foundList);
        System.out.println(foundList.size());

        ActualOffer foundList2 = Search.searchByDestination(list, "Spain");
        System.out.println("Found by destination: " + foundList2);
        System.out.println(foundList2.size());

        ActualOffer foundList3 = Search.searchByAllParams(list, 10, 30, Transport.BUS, Meal.ALL_INCLUSIVE,
                "Greece");
        System.out.println("Found by ALL: " + foundList3);
        System.out.println(foundList3.size());

        try {
            ActualOffer foundList4 = Search.searchByDays(list, -1, -2);
            System.out.println("Found by -1: " + foundList4);
            System.out.println(foundList3.size());
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
