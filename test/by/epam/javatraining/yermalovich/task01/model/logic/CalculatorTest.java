package by.epam.javatraining.yermalovich.task01.model.logic;

import by.epam.javatraining.yermalovich.task01.model.container.ActualOffer;
import by.epam.javatraining.yermalovich.task01.model.container.OffersArray;
import by.epam.javatraining.yermalovich.task01.model.entity.*;
import by.epam.javatraining.yermalovich.task01.model.exception.ArrayOverflowException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

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
        secondTour = new Vacation(30, Transport.BUS, Meal.ALL_INCLUSIVE, "Greece", 1450);
        thirdTour = new Vacation(20, Transport.TRAIN, Meal.ONE_TIME, "France", 20);
        fourthTour = new Vacation(15, Transport.NO_TRANSPORT, Meal.TWO_TIMES, "Spain", 250);
        fifthTour = new FamilyTrip(3, Transport.TRAIN, Meal.THREE_TIMES, "Ukraine", 300,
                3, 5, true);
        sixthTour = new FamilyTrip(7, Transport.PLANE, Meal.ALL_INCLUSIVE, "Bulgaria", 700,
                2, 5, false);

        list.addTour(firstTour);
        list.addTour(secondTour);
        list.addTour(thirdTour);
        list.addTour(fourthTour);
        list.addTour(fifthTour);
        list.addTour(sixthTour);
    }

    @Test
    public void testCalculateTotalPrice() {
        assertEquals(2720, Calculator.calculateTotalPrice(list), 0.01);
    }

    @Test
    public void testNullInArrayCalculateTotalPrice() throws ArrayOverflowException {
        TouristTrip trip = null;
        list.addTour(trip);
        assertEquals(2720, Calculator.calculateTotalPrice(list), 0.01);
    }

    @Test()
    public void testNullInListCalculateTotalPrice() {
        list = null;
        assertEquals(-1, Calculator.calculateTotalPrice(list), 0.01);
    }
}