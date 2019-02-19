package by.epam.javatraining.yermalovich.task01.model.container;

import by.epam.javatraining.yermalovich.task01.model.entity.TouristTrips;

import java.util.Arrays;
import java.util.Objects;

public class OffersArray implements IActualOffers {

    private int lastIndex;
    private TouristTrips[] array;

    public OffersArray() {
        lastIndex = -1;
        array = new TouristTrips[0];
    }

    public OffersArray(TouristTrips[] array) {
        this.array = array;
        lastIndex = array.length - 1;
    }

    public int getLastIndex() {
        return lastIndex;
    }

    public void setLastIndex(int lastIndex) {
        this.lastIndex = lastIndex;
    }

    public TouristTrips[] getArray() {
        return array;
    }

    public void setArray(TouristTrips[] array) {
        this.array = array;
    }

    @Override
    public void addTour(TouristTrips tour) {

        TouristTrips[] tmpArray = new TouristTrips[++lastIndex + 1];
        for (int i = 0; i < array.length; i++) {
            tmpArray[i] = array[i];
        }
        tmpArray[lastIndex] = tour;
        array = tmpArray;

    }

    @Override
    public void removeTour(TouristTrips tour) {
        TouristTrips[] tmpArray = new TouristTrips[lastIndex--];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == tour) {
                continue;
            }
            tmpArray[j++] = array[i];
        }
        array = tmpArray;
    }

    @Override
    public int numberOfTours() {
        return lastIndex + 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OffersArray that = (OffersArray) o;
        return lastIndex == that.lastIndex &&
                Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(lastIndex);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("OffersArray: \n");

        for (TouristTrips t : array) {
            builder.append(t).append("\n");
        }
        return builder + "";
    }
}
