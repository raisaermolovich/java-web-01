package by.epam.javatraining.yermalovich.task01.model.entity;

import by.epam.javatraining.yermalovich.task01.model.exception.IncorrectMaxNumberOfPeople;
import by.epam.javatraining.yermalovich.task01.model.exception.IncorrectMinNumberOfPeople;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FamilyTripTest {

    private FamilyTrip firstTour;

    @Before
    public void setUp(){
        firstTour = new FamilyTrip (7, Transport.BUS, Meal.NO_MEAL, "Greece", 500,
                3, 5, true);
    }

    @Test
    public void getDays() {
        assertEquals(7, firstTour.getDays());
    }

    @Test
    public void setDays() {
        firstTour.setDays(5);
        assertEquals(5, firstTour.getDays());
    }

    @Test
    public void setIncorrectDays() {
        firstTour.setDays(-5);
        assertEquals(7, firstTour.getDays());
    }

    @Test
    public void getTransport() {
        assertEquals(Transport.BUS, firstTour.getTransport());
    }

    @Test
    public void setTransport() {
        firstTour.setTransport(Transport.NO_TRANSPORT);
        assertEquals(Transport.NO_TRANSPORT, firstTour.getTransport());
    }
    @Test
    public void getMeals() {
        assertEquals(Meal.NO_MEAL, firstTour.getMeals());
    }

    @Test
    public void setMeals() {
        firstTour.setMeals(Meal.ALL_INCLUSIVE);
        assertEquals(Meal.ALL_INCLUSIVE, firstTour.getMeals());
    }

    @Test
    public void getPrice() {
        assertEquals(500, firstTour.getPrice(), 0.01);
    }

    @Test
    public void setPrice() {
        firstTour.setPrice(0);
        assertEquals(0, firstTour.getPrice(), 0.01);
    }

    @Test
    public void setIncorrectPrice() {
        firstTour.setDays(-5);
        assertEquals(500, firstTour.getPrice(), 0.01);
    }

    @Test
    public void getDestination() {
        assertEquals("Greece", firstTour.getDestination());
    }

    @Test
    public void setDestination() {
        firstTour.setDestination("Cyprus");
        assertEquals("Cyprus", firstTour.getDestination());
    }

    @Test
    public void setNullDestination() {
        //String nullDestination = null;
        firstTour.setDestination(null);
        assertEquals("Greece", firstTour.getDestination());
    }

    @Test
    public void getMinNumberOfPeople() {
        assertEquals(3, firstTour.getMinNumberOfPeople());
    }

    @Test
    public void getMaxNumberOfPeople() {
        assertEquals(5, firstTour.getMaxNumberOfPeople());
    }

    @Test
    public void setMinNumberOfPeople() throws IncorrectMinNumberOfPeople {
        firstTour.setMinNumberOfPeople(4);
        assertEquals(4, firstTour.getMinNumberOfPeople());
    }

    @Test(expected = IncorrectMinNumberOfPeople.class)
    public void setIncorrectMinNumberOfPeople() throws IncorrectMinNumberOfPeople {
        firstTour.setMinNumberOfPeople(-1);
    }

    @Test(expected = IncorrectMinNumberOfPeople.class)
    public void setBiggerMinNumberOfPeople() throws IncorrectMinNumberOfPeople {
        firstTour.setMinNumberOfPeople(6);
    }

    @Test
    public void setMaxNumberOfPeople() throws IncorrectMaxNumberOfPeople {
        firstTour.setMaxNumberOfPeople(7);
        assertEquals(7, firstTour.getMaxNumberOfPeople());
    }

    @Test(expected = IncorrectMaxNumberOfPeople.class)
    public void setSmallerMinNumberOfPeople() throws IncorrectMaxNumberOfPeople {
        firstTour.setMaxNumberOfPeople(2);
    }

    @Test
    public void isSpeacialOffer() {
        assertEquals(true, firstTour.isSpeacialOffer());
    }

    @Test
    public void setSpeacialOffer() {
        firstTour.setSpeacialOffer(false);
        assertEquals(false, firstTour.isSpeacialOffer());
    }
}
