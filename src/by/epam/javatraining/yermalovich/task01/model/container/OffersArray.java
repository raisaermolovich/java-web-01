package by.epam.javatraining.yermalovich.task01.model.container;

import by.epam.javatraining.yermalovich.task01.model.entity.TouristTrip;
import by.epam.javatraining.yermalovich.task01.model.exception.IncorrectArrayIndexException;
import by.epam.javatraining.yermalovich.task01.model.comparator.TripComparator;

import java.util.Arrays;
import java.util.Objects;

public class OffersArray implements ActualOffer {

    private int lastIndex;
    private TouristTrip[] array;

    public OffersArray() {
        lastIndex = -1;
        array = new TouristTrip[0];
    }

    public OffersArray(TouristTrip[] array) {
        if (array != null) {
            this.array = array;
            lastIndex = array.length - 1;
        } else {
            lastIndex = -1;
            array = new TouristTrip[0];
        }
    }

    public int getLastIndex() {
        return lastIndex;
    }

    public TouristTrip[] getArray() {
        return array; //WRONG
    }

    public void setArray(TouristTrip[] array) {
        if (array != null) {
            this.array = array;
        }
    }

    @Override
    public void addTour(TouristTrip tour) {
        if (tour != null) {
            TouristTrip[] tmpArray = new TouristTrip[++lastIndex + 1];
            for (int i = 0; i < array.length; i++) {
                tmpArray[i] = array[i];
            }
            tmpArray[lastIndex] = tour;
            array = tmpArray;
        }
    }

    @Override
    public void removeTour(TouristTrip tour) {
        if (tour != null) {
            TripComparator comparator = new TripComparator();
            int matches = 0;

            for (int i = 0; i < array.length; i++) {
                if (comparator.compare(array[i], tour) == 0) {
                    matches++;
                }
            }
            lastIndex -= matches;

            TouristTrip[] tmpArray = new TouristTrip[lastIndex + 1];
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (comparator.compare(array[i], tour) == 0) {
                    continue;
                }
                tmpArray[j++] = array[i];
            }
            array = tmpArray;
        }
    }

    @Override
    public int numberOfTours() {
        return lastIndex + 1;
    }

    @Override
    public TouristTrip get(int index) throws IncorrectArrayIndexException {
        if (index > lastIndex || index < 0) {
            throw new IncorrectArrayIndexException("Index out of range.");
        }
        return array[index];
    }

    @Override
    public void add(int index, TouristTrip tour) throws IncorrectArrayIndexException {
        if (index > lastIndex || index < 0) {
            throw new IncorrectArrayIndexException("Index out of range.");
        }
        array[index] = tour;
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

        for (TouristTrip t : array) {
            builder.append(t).append("\n");
        }
        return builder + "";
    }
}
