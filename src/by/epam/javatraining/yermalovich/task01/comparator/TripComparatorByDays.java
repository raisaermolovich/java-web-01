/*Compares objects by 4 main fields only:
 * Days
 * Transport
 * Meals
 * Destination
 */

package by.epam.javatraining.yermalovich.task01.comparator;

import by.epam.javatraining.yermalovich.task01.model.entity.TouristTrip;

import java.util.Comparator;


public class TripComparatorByDays implements Comparator<TouristTrip> {

    public int compare(TouristTrip a, TouristTrip b) {
        return a.getDays() - b.getDays();
    }
}
