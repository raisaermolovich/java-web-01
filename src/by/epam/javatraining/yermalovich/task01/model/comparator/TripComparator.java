/*Compares objects by 3 main fields only:
 * Days
 * Transport
 * Meals
 */

package by.epam.javatraining.yermalovich.task01.model.comparator;

import by.epam.javatraining.yermalovich.task01.model.entity.TouristTrip;

import java.util.Comparator;


public class TripComparator implements Comparator<TouristTrip> {

    public int compare(TouristTrip a, TouristTrip b) {

        if (a.getDays() == (b.getDays())
                && a.getTransport().equals(b.getTransport())
                && a.getMeals().equals(b.getMeals())
                && a.getDestination().equals(b.getDestination())
                ) {
            return 0;
        } else {
            return -1;
        }

    }

    @Override
    public String toString() {
        return "TripComparator";
    }
}
