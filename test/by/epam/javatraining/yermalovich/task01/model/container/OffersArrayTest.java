package by.epam.javatraining.yermalovich.task01.model.container;

import by.epam.javatraining.yermalovich.task01.model.container.ActualOffer;
import by.epam.javatraining.yermalovich.task01.model.container.OffersArray;
import by.epam.javatraining.yermalovich.task01.model.entity.*;
import by.epam.javatraining.yermalovich.task01.model.exception.ArrayOverflowException;
import by.epam.javatraining.yermalovich.task01.model.exception.IncorrectArrayIndexException;
import by.epam.javatraining.yermalovich.task01.model.exception.InvalidSearchParametersOrderException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class OffersArrayTest {

    private OffersArray list;

    private TouristTrip firstTour;
    private TouristTrip secondTour;
    private TouristTrip thirdTour;
    private TouristTrip fourthTour;
    private TouristTrip fifthTour;
    private TouristTrip sixthTour;

    @Before
    public void setUp(){
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
        //list.addTour(sixthTour);
    }

    @Test
    public void testGetLastIndex() {
        assertEquals(4, list.getLastIndex());
    }

    @Test
    public void testGetArray() {
        TouristTrip[] expectedArray = new TouristTrip[5];
        expectedArray[0] = firstTour;
        expectedArray[1] = secondTour;
        expectedArray[2] = thirdTour;
        expectedArray[3] = fourthTour;
        expectedArray[4] = fifthTour;

        assertArrayEquals(expectedArray, list.getArray());
    }

    @Test
    public void testAddTour() throws IncorrectArrayIndexException{
        list.addTour(sixthTour);

        assertEquals(sixthTour, list.get(5));
    }

    @Test
    public void testAddNullTour(){
        list.addTour(null);

        assertEquals(5, list.size());
    }

    @Test
    public void testRemoveTour(){
        list.removeTour(fifthTour);

        assertEquals(4, list.size());
    }

    @Test
    public void testRemoveNotFromArrayTour(){
        list.removeTour(sixthTour);

        assertEquals(5, list.size());
    }

    @Test
    public void testRemoveNullTour(){
        list.removeTour(null);

        assertEquals(5, list.size());
    }

    @Test
    public void testSize(){
        assertEquals(5, list.size());
    }

    @Test
    public void testValidAdd() throws IncorrectArrayIndexException {
        list.add(2, firstTour);
        assertEquals(firstTour, list.get(2));
    }

    @Test (expected = IncorrectArrayIndexException.class)
    public void testInvalidSmallIndexAdd() throws IncorrectArrayIndexException {
        list.add(-1, firstTour);
    }

    @Test (expected = IncorrectArrayIndexException.class)
    public void testInvalidBigIndexAdd() throws IncorrectArrayIndexException {
        list.add(100, firstTour);
    }

    @Test
    public void testInalidNullTourAdd() throws IncorrectArrayIndexException {
        list.add(2, null);
        assertEquals(thirdTour, list.get(2));
    }

    @Test
    public void testValidGet() throws IncorrectArrayIndexException {
        assertEquals(secondTour, list.get(1));
    }

    @Test (expected = IncorrectArrayIndexException.class)
    public void testInvalidSmallIndexGet() throws IncorrectArrayIndexException{
        list.get(-1);
    }

    @Test (expected = IncorrectArrayIndexException.class)
    public void testInvalidBigIndexGet() throws IncorrectArrayIndexException{
        list.get(1000);
    }

    @Test
    public void testFalseIsEmpty() {
        assertEquals(false, list.isEmpty());
    }

    @Test
    public void testTrueIsEmpty() {
        list = new OffersArray();
        assertEquals(true, list.isEmpty());
    }
}
