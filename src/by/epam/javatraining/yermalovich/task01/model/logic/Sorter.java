package by.epam.javatraining.yermalovich.task01.model.logic;

import by.epam.javatraining.yermalovich.task01.model.container.*;
import by.epam.javatraining.yermalovich.task01.model.entity.TouristTrip;
import by.epam.javatraining.yermalovich.task01.model.exception.IncorrectIndexException;

public class Sorter {

    public static ActualOffer sortByDaysAsc(ActualOffer list) {
        TouristTrip tmp;

        try {
            for (int j = 0; j < list.numberOfTours() - 1; j++) {
                for (int i = 0; i < list.numberOfTours() - 1; i++) {
                    if (list.get(i).getDays() > list.get(i + 1).getDays()) {
                        tmp = list.get(i);
                        list.add(i, list.get(i + 1));
                        list.add(i + 1, tmp);
                    }
                }
            }
        } catch (IncorrectIndexException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public static ActualOffer sortByDaysDesc(ActualOffer list) {
        TouristTrip tmp;

        try {
            for (int j = 0; j < list.numberOfTours() - 1; j++) {
                for (int i = 0; i < list.numberOfTours() - 1; i++) {
                    if (list.get(i).getDays() < list.get(i + 1).getDays()) {
                        tmp = list.get(i);
                        list.add(i, list.get(i + 1));
                        list.add(i + 1, tmp);
                    }
                }
            }
        } catch (IncorrectIndexException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
