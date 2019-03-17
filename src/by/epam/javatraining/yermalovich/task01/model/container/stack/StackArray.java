package by.epam.javatraining.yermalovich.task01.model.container.stack;

import by.epam.javatraining.yermalovich.task01.model.container.ActualOffer;
import by.epam.javatraining.yermalovich.task01.model.entity.TouristTrip;

public class StackArray {
    private int maxSize;
    private TouristTrip[] stackArray;
    private int top;

    public StackArray(int maxSize) {
        if (maxSize > 0) {
            this.maxSize = maxSize;
        } else {
            this.maxSize = 0;
        }
        stackArray = new TouristTrip[maxSize];
        top = -1;
    }

    public StackArray(TouristTrip[] stackArray) {
        if (stackArray != null) {
            this.stackArray = stackArray;
            maxSize = stackArray.length;
            top = maxSize - 1;
        } else {
            maxSize = 0;
            this.stackArray = new TouristTrip[maxSize];
            top = -1;
        }
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) { ///TO CONTINUE
        this.maxSize = maxSize;
    }

    public TouristTrip[] getStackArray() {
        return stackArray;
    }

    public void setStackArray(TouristTrip[] stackArray) {
        this.stackArray = stackArray;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
}
