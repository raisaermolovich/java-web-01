package by.epam.javatraining.yermalovich.task01.model.logic;

import by.epam.javatraining.yermalovich.task01.model.container.ActualOffer;
import by.epam.javatraining.yermalovich.task01.model.container.OffersArray;
import by.epam.javatraining.yermalovich.task01.model.entity.*;
import by.epam.javatraining.yermalovich.task01.model.exception.ArrayOverflowException;
import by.epam.javatraining.yermalovich.task01.model.exception.InvalidSearchParametersOrderException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchTest {

    private ActualOffer list;

    private TouristTrip firstTour;
    private TouristTrip secondTour;
    private TouristTrip thirdTour;
    private TouristTrip fourthTour;
    private TouristTrip fifthTour;
    private TouristTrip sixthTour;

    @Before
    public void setUp() throws ArrayOverflowException {
        list = new OffersArray();

        firstTour = new Vacation();
        secondTour = new Vacation(10, Transport.BUS, Meal.ALL_INCLUSIVE, "Greece");
        thirdTour = new Vacation(20, Transport.TRAIN, Meal.ONE_TIME, "France");
        fourthTour = new Vacation(15, Transport.NO_TRANSPORT, Meal.TWO_TIMES, "Spain");
        fifthTour = new FamilyTrip(3, Transport.TRAIN, Meal.THREE_TIMES, "Ukraine",
                3, 5, true);
        sixthTour = new FamilyTrip(7, Transport.BUS, Meal.ALL_INCLUSIVE, "Bulgaria",
                2, 5, true);

        list.addTour(firstTour);
        list.addTour(secondTour);
        list.addTour(thirdTour);
        list.addTour(fourthTour);
        list.addTour(fifthTour);
        list.addTour(sixthTour);
    }

    @Test
    public void testValidSearchByDays() throws ArrayOverflowException, InvalidSearchParametersOrderException {
        ActualOffer expectedList = new OffersArray();
        expectedList.addTour(secondTour);
        expectedList.addTour(thirdTour);
        expectedList.addTour(fourthTour);

        ActualOffer sortedList = Search.searchByDays(list, 10, 20);
        assertEquals(expectedList, sortedList);
    }

    @Test
    public void testValidSearchByEqualsDays() throws ArrayOverflowException, InvalidSearchParametersOrderException {
        ActualOffer expectedList = new OffersArray();
        expectedList.addTour(fourthTour);

        ActualOffer sortedList = Search.searchByDays(list, 15, 15);
        assertEquals(expectedList, sortedList);
    }

    @Test
    public void testEmptySearchByDays() throws ArrayOverflowException, InvalidSearchParametersOrderException {
        ActualOffer expectedList = new OffersArray();

        ActualOffer sortedList = Search.searchByDays(list, 100, 120);
        assertEquals(expectedList, sortedList);
    }

    @Test (expected = InvalidSearchParametersOrderException.class)
    public void testInvalidSearchByDays() throws ArrayOverflowException, InvalidSearchParametersOrderException {

        ActualOffer sortedList = Search.searchByDays(list, 30, 20);
    }

    @Test
    public void testInvalidSearchWithNullListByDays() throws ArrayOverflowException, InvalidSearchParametersOrderException {
        ActualOffer expectedList = new OffersArray();
        list = null;

        ActualOffer sortedList = Search.searchByDays(list, 10, 20);
        assertEquals(expectedList, sortedList);
    }


    @Test
    public void testValidSearchByTransport() throws ArrayOverflowException, InvalidSearchParametersOrderException {
        ActualOffer expectedList = new OffersArray();
        expectedList.addTour(thirdTour);
        expectedList.addTour(fifthTour);

        ActualOffer sortedList = Search.searchByTransport(list, Transport.TRAIN);
        assertEquals(expectedList, sortedList);
    }

    @Test
    public void testEmptyValidSearchByTransport() throws ArrayOverflowException, InvalidSearchParametersOrderException {
        ActualOffer expectedList = new OffersArray();

        ActualOffer sortedList = Search.searchByTransport(list, Transport.PLANE);
        assertEquals(expectedList, sortedList);
    }

    @Test
    public void testInvalidSearchWithNullListByTransport() throws ArrayOverflowException, InvalidSearchParametersOrderException {
        ActualOffer expectedList = new OffersArray();
        list = null;

        ActualOffer sortedList = Search.searchByTransport(list, Transport.BUS);
        assertEquals(expectedList, sortedList);
    }


    @Test
    public void testValidSearchByDestination() throws ArrayOverflowException, InvalidSearchParametersOrderException {
        ActualOffer expectedList = new OffersArray();
        expectedList.addTour(fourthTour);

        ActualOffer sortedList = Search.searchByDestination(list, "Spain");
        assertEquals(expectedList, sortedList);
    }

    @Test
    public void testEmptyValidSearchByDestination() throws ArrayOverflowException, InvalidSearchParametersOrderException {
        ActualOffer expectedList = new OffersArray();

        ActualOffer sortedList = Search.searchByDestination(list, "Belarus");
        assertEquals(expectedList, sortedList);
    }

    @Test
    public void testInvalidSearchWithNullStringByDestination() throws ArrayOverflowException, InvalidSearchParametersOrderException {
        ActualOffer expectedList = new OffersArray();

        ActualOffer sortedList = Search.searchByDestination(list, null);
        assertEquals(expectedList, sortedList);
    }

    @Test
    public void testInvalidSearchWithNullListByDestination() throws ArrayOverflowException, InvalidSearchParametersOrderException {
        ActualOffer expectedList = new OffersArray();
        list = null;

        ActualOffer sortedList = Search.searchByDestination(list, "Spain");
        assertEquals(expectedList, sortedList);
    }


    @Test
    public void testValidSearchBySpecialOffer() throws ArrayOverflowException, InvalidSearchParametersOrderException {
        ActualOffer expectedList = new OffersArray();
        expectedList.addTour(fifthTour);

        ActualOffer sortedList = Search.searchBySpecialOffer(list, true);
        assertEquals(expectedList, sortedList);
    }

    @Test
    public void testValidEmptySearchBySpecialOffer() throws ArrayOverflowException, InvalidSearchParametersOrderException {
        ActualOffer expectedList = new OffersArray();

        ActualOffer sortedList = Search.searchBySpecialOffer(list, false);
        assertEquals(expectedList, sortedList);
    }

    @Test
    public void testInvalidSearchBySpecialOffer() throws ArrayOverflowException, InvalidSearchParametersOrderException {
        ActualOffer expectedList = new OffersArray();
        list = null;

        ActualOffer sortedList = Search.searchBySpecialOffer(list, true);
        assertEquals(expectedList, sortedList);
    }
}
