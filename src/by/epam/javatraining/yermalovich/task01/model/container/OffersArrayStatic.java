package by.epam.javatraining.yermalovich.task01.model.container;

import by.epam.javatraining.yermalovich.task01.comparator.TripComparatorByDays;
import by.epam.javatraining.yermalovich.task01.model.entity.TouristTrip;
import by.epam.javatraining.yermalovich.task01.model.exception.ArrayOverflowException;
import by.epam.javatraining.yermalovich.task01.model.exception.IncorrectArrayIndexException;

import java.util.Arrays;
import java.util.Objects;

public class OffersArrayStatic implements ActualOffer {

    private int lastUsedIndex;
    private TouristTrip[] array;

    public OffersArrayStatic(int length) {
        lastUsedIndex = -1;
        if (length > 0) {
            array = new TouristTrip[length];
        } else {
            array = new TouristTrip[0];
        }
    }

    public OffersArrayStatic(TouristTrip[] array) {
        if (array != null) {
            lastUsedIndex = array.length - 1;
            this.array = array;
        } else {
            lastUsedIndex = -1;
            this.array = new TouristTrip[0];
        }
    }

    public OffersArrayStatic(ActualOffer another) {
        if (another != null) {
            lastUsedIndex = another.getArray().length - 1;
            array = Arrays.copyOf(another.getArray(), another.getArray().length);
        }
    }

    public int getLastUsedIndex() {
        return lastUsedIndex;
    }

    @Override
    public TouristTrip[] getArray() {
        return array;
    }

    @Override
    public void setArray(TouristTrip[] array) {
        if (array != null) {
            this.array = array;
            lastUsedIndex = array.length - 1;
        }
    }

    @Override
    public void addTour(TouristTrip tour) throws ArrayOverflowException {
        if (lastUsedIndex < array.length - 1) {
            if (tour != null) {
                array[++lastUsedIndex] = tour;
            }
        } else {
            throw new ArrayOverflowException("Arrays is full.");
        }
    }

    @Override
    public void removeTour(TouristTrip tour) {
        if (tour != null) {

            for (int i = 0, j = 0; j < array.length; i++, j++) {
                if (array[i].equals(tour)) {
                    if (j != array.length - 1) {
                        array[i] = array[j+1];
                    } else {
                        array[i] = null;
                    }
                    lastUsedIndex--;
                    i--;
                } else if (i != j){
                    array[i] = array[j];
                }
            }
        }
    }

    @Override
    public int size() {
        return lastUsedIndex + 1;
    }

    @Override
    public void add(int index, TouristTrip tour) throws IncorrectArrayIndexException {
        if (index > lastUsedIndex || index < 0) {
            throw new IncorrectArrayIndexException("Index out of range.");
        }
        if (tour != null) {
            array[index] = tour;
        }
    }

    @Override
    public TouristTrip get(int index) throws IncorrectArrayIndexException {
        if (index > lastUsedIndex || index < 0) {
            throw new IncorrectArrayIndexException("Index out of range.");
        }
        return array[index];
    }

    @Override
    public boolean isEmpty() {
        return (lastUsedIndex == -1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OffersArrayStatic that = (OffersArrayStatic) o;
        return lastUsedIndex == that.lastUsedIndex &&
                Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(lastUsedIndex);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("OffersArrayStatic: \n");

        for (TouristTrip t : array) {
            builder.append(t).append("\n");
        }
        return builder + "";
    }
}
