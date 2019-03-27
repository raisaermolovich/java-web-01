package by.epam.javatraining.yermalovich.task01.model.logic;

import by.epam.javatraining.yermalovich.task01.model.container.ActualOffer;
import by.epam.javatraining.yermalovich.task01.model.container.OffersArray;
import by.epam.javatraining.yermalovich.task01.model.entity.*;
import by.epam.javatraining.yermalovich.task01.model.exception.ArrayOverflowException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SorterTest {

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
        secondTour = new Vacation(30, Transport.BUS, Meal.ALL_INCLUSIVE, "Greece");
        thirdTour = new Vacation(20, Transport.TRAIN, Meal.ONE_TIME, "France");
        fourthTour = new Vacation(15, Transport.NO_TRANSPORT, Meal.TWO_TIMES, "Spain");
        fifthTour = new FamilyTrip(3, Transport.TRAIN, Meal.THREE_TIMES, "Ukraine",
                3, 5, true);
        sixthTour = new FamilyTrip(7, Transport.PLANE, Meal.ALL_INCLUSIVE, "Bulgaria",
                2, 5, false);

        list.addTour(firstTour);
        list.addTour(secondTour);
        list.addTour(thirdTour);
        list.addTour(fourthTour);
        list.addTour(fifthTour);
        list.addTour(sixthTour);
    }

    @Test
    public void testSortByDaysAsc() throws ArrayOverflowException{
        ActualOffer expectedList = new OffersArray();
        expectedList.addTour(firstTour);
        expectedList.addTour(fifthTour);
        expectedList.addTour(sixthTour);
        expectedList.addTour(fourthTour);
        expectedList.addTour(thirdTour);
        expectedList.addTour(secondTour);

        ActualOffer sortedList = Sorter.sortByDaysAsc(list);
        assertEquals(expectedList, sortedList);
    }

    @Test
    public void testSortByDaysDesc() throws ArrayOverflowException{
        ActualOffer expectedList = new OffersArray();
        expectedList.addTour(secondTour);
        expectedList.addTour(thirdTour);
        expectedList.addTour(fourthTour);
        expectedList.addTour(sixthTour);
        expectedList.addTour(fifthTour);
        expectedList.addTour(firstTour);

        ActualOffer sortedList = Sorter.sortByDaysDesc(list);
        assertEquals(expectedList, sortedList);
    }

    @Test
    public void testSortByDestinationAsc() throws ArrayOverflowException{
        ActualOffer expectedList = new OffersArray();
        expectedList.addTour(sixthTour);
        expectedList.addTour(thirdTour);
        expectedList.addTour(secondTour);
        expectedList.addTour(firstTour);
        expectedList.addTour(fourthTour);
        expectedList.addTour(fifthTour);
        ActualOffer sortedList = Sorter.sortByDestinationAsc(list);
        assertEquals(expectedList, sortedList);
    }

    @Test
    public void testSortByDestinationDesc() throws ArrayOverflowException{
        ActualOffer expectedList = new OffersArray();
        expectedList.addTour(fifthTour);
        expectedList.addTour(fourthTour);
        expectedList.addTour(firstTour);
        expectedList.addTour(secondTour);
        expectedList.addTour(thirdTour);
        expectedList.addTour(sixthTour);

        ActualOffer sortedList = Sorter.sortByDestinationDesc(list);
        assertEquals(expectedList, sortedList);
    }
}
