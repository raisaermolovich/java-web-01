package by.epam.javatraining.yermalovich.task01.model.logic;

import by.epam.javatraining.yermalovich.task01.model.container.ActualOffer;
import by.epam.javatraining.yermalovich.task01.model.container.OffersArray;
import by.epam.javatraining.yermalovich.task01.model.entity.FamilyTrip;
import by.epam.javatraining.yermalovich.task01.model.entity.GroupTrip;
import by.epam.javatraining.yermalovich.task01.model.entity.Meal;
import by.epam.javatraining.yermalovich.task01.model.entity.Transport;
import by.epam.javatraining.yermalovich.task01.model.exception.*;

public class Search {

    public static ActualOffer searchByDays(ActualOffer list, int a, int b) throws InvalidSearchParametersOrderException {

        if (a > b) {
            throw new InvalidSearchParametersOrderException("Invalid number range");
        }

        ActualOffer foundList = new OffersArray();
        if (list != null) {
            try {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getDays() >= a && list.get(i).getDays() <= b) {
                        foundList.addTour(list.get(i));
                    }
                }
            } catch (IncorrectArrayIndexException e) {
                System.out.println(e.getMessage());
            } catch (ArrayOverflowException e) {
                System.out.println(e.getMessage());
            }
        }
        return foundList;
    }


    public static ActualOffer searchByTransport(ActualOffer list, Transport transport) {
        ActualOffer foundList = new OffersArray();

        if (list != null) {
            try {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getTransport().equals(transport)) {
                        foundList.addTour(list.get(i));
                    }
                }
            } catch (IncorrectArrayIndexException e) {
                System.out.println(e.getMessage());
            } catch (ArrayOverflowException e) {
                System.out.println(e.getMessage());
            }
        }
        return foundList;
    }


    public static ActualOffer searchByMeal(ActualOffer list, Meal meals) {
        ActualOffer foundList = new OffersArray();

        if (list != null) {
            try {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getMeals().equals(meals)) {
                        foundList.addTour(list.get(i));
                    }
                }
            } catch (IncorrectArrayIndexException e) {
                System.out.println(e.getMessage());
            } catch (ArrayOverflowException e) {
                System.out.println(e.getMessage());
            }
        }
        return foundList;
    }


    public static ActualOffer searchByDestination(ActualOffer list, String destination) {
        ActualOffer foundList = new OffersArray();

        if (list != null) {
            try {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getDestination().equals(destination)) {
                        foundList.addTour(list.get(i));
                    }
                }
            } catch (IncorrectArrayIndexException e) {
                System.out.println(e.getMessage());
            } catch (ArrayOverflowException e) {
                System.out.println(e.getMessage());
            }
        }
        return foundList;
    }


    public static ActualOffer searchByPeopleNumber(ActualOffer list, int a, int b) throws InvalidSearchParametersOrderException {

        if (a > b) {
            throw new InvalidSearchParametersOrderException("Invalid number range");
        }

        ActualOffer foundList = new OffersArray();
        if (list != null) {
            try {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) instanceof GroupTrip) {

                        if (((GroupTrip) list.get(i)).getMinNumberOfPeople() <= b
                                && ((GroupTrip) list.get(i)).getMaxNumberOfPeople() >= a) {
                            foundList.addTour(list.get(i));
                        }
                    }
                }
            } catch (IncorrectArrayIndexException e) {
                //LOG   System.out.println(e.getMessage());
            } catch (ArrayOverflowException e) {
                //LOG  System.out.println(e.getMessage());
            }
        }
        return foundList;
    }


    public static ActualOffer searchBySpecialOffer(ActualOffer list, boolean specialOffer) {
        ActualOffer foundList = new OffersArray();
        if (list != null) {
            try {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) instanceof FamilyTrip) {

                        if (((FamilyTrip) list.get(i)).isSpeacialOffer() == specialOffer) {
                            foundList.addTour(list.get(i));
                        }
                    }
                }
            } catch (IncorrectArrayIndexException e) {
                //LOG   System.out.println(e.getMessage());
            } catch (ArrayOverflowException e) {
                //LOG  System.out.println(e.getMessage());
            }
        }
        return foundList;
    }
    /*
    public static ActualOffer searchByAllParams(ActualOffer list, int a, int b, Transport transport, Meal meals,
                                                String destination) {
        ActualOffer foundList = new OffersArray();

        if (list != null) {
            try {
                foundList = searchByDays(list, a, b);
                foundList = searchByTransport(foundList, transport);
                foundList = searchByMeal(foundList, meals);
                foundList = searchByDestination(foundList, destination);
            } catch (InvalidSearchParametersOrderException e) {
                System.out.println(e.getMessage());
            }
        }
        return foundList;
    }*/
}
