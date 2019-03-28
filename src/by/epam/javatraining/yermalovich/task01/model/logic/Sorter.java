package by.epam.javatraining.yermalovich.task01.model.logic;

import by.epam.javatraining.yermalovich.task01.model.container.*;
import by.epam.javatraining.yermalovich.task01.model.entity.TouristTrip;
import by.epam.javatraining.yermalovich.task01.model.exception.IncorrectArrayIndexException;

public class Sorter {

    public static ActualOffer sortByDaysAsc(ActualOffer list) {
        TouristTrip tmp;

        if (list != null) {
            try {
                for (int j = 0; j < list.size() - 1; j++) {
                    for (int i = 0; i < list.size() - 1; i++) {
                        if (list.get(i).getDays() > list.get(i + 1).getDays()) {
                            tmp = list.get(i);
                            list.add(i, list.get(i + 1));
                            list.add(i + 1, tmp);
                        }
                    }
                }
            } catch (IncorrectArrayIndexException e) {
                //LOG System.out.println(e.getMessage()); //REMOVE
            }
        }
        return list;
    }

    public static ActualOffer sortByDaysDesc(ActualOffer list) {
        TouristTrip tmp;

        if (list != null) {
            try {
                for (int j = 0; j < list.size() - 1; j++) {
                    for (int i = 0; i < list.size() - 1; i++) {
                        if (list.get(i).getDays() < list.get(i + 1).getDays()) {
                            tmp = list.get(i);
                            list.add(i, list.get(i + 1));
                            list.add(i + 1, tmp);
                        }
                    }
                }
            } catch (IncorrectArrayIndexException e) {
                //LOG    System.out.println(e.getMessage());
            }
        }
        return list;
    }

    public static ActualOffer sortByDestinationAsc(ActualOffer list) {
        TouristTrip tmp;

        if (list != null) {
            try {
                for (int j = 0; j < list.size() - 1; j++) {
                    for (int i = 0; i < list.size() - 1; i++) {
                        if (list.get(i).getDestination().charAt(0) > list.get(i + 1).getDestination().charAt(0)) {
                            tmp = list.get(i);
                            list.add(i, list.get(i + 1));
                            list.add(i + 1, tmp);
                        }
                    }
                }
            } catch (IncorrectArrayIndexException e) {
                //LOG System.out.println(e.getMessage()); //REMOVE
            }
        }
        return list;
    }

    public static ActualOffer sortByDestinationDesc(ActualOffer list) {
        TouristTrip tmp;

        if (list != null) {
            try {
                for (int j = 0; j < list.size() - 1; j++) {
                    for (int i = 0; i < list.size() - 1; i++) {
                        if (list.get(i).getDestination().charAt(0) < list.get(i + 1).getDestination().charAt(0)) {
                            tmp = list.get(i);
                            list.add(i, list.get(i + 1));
                            list.add(i + 1, tmp);
                        }
                    }
                }
            } catch (IncorrectArrayIndexException e) {
                //LOG System.out.println(e.getMessage()); //REMOVE
            }
        }
        return list;
    }

    public static ActualOffer sortByPriceAsc(ActualOffer list) { /////////
        TouristTrip tmp;

        if (list != null) {
            try {
                for (int j = 0; j < list.size() - 1; j++) {
                    for (int i = 0; i < list.size() - 1; i++) {
                        if (list.get(i).getPrice() > list.get(i + 1).getPrice()) {
                            tmp = list.get(i);
                            list.add(i, list.get(i + 1));
                            list.add(i + 1, tmp);
                        }
                    }
                }
            } catch (IncorrectArrayIndexException e) {
                //LOG System.out.println(e.getMessage()); //REMOVE
            }
        }
        return list;
    }

    public static ActualOffer sortByPriceDesc(ActualOffer list) {
        TouristTrip tmp;

        if (list != null) {
            try {
                for (int j = 0; j < list.size() - 1; j++) {
                    for (int i = 0; i < list.size() - 1; i++) {
                        if (list.get(i).getPrice() < list.get(i + 1).getPrice()) {
                            tmp = list.get(i);
                            list.add(i, list.get(i + 1));
                            list.add(i + 1, tmp);
                        }
                    }
                }
            } catch (IncorrectArrayIndexException e) {
                //LOG    System.out.println(e.getMessage());
            }
        }
        return list;
    }
}
