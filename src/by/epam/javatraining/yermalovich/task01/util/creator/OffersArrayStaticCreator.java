package by.epam.javatraining.yermalovich.task01.util.creator;

import by.epam.javatraining.yermalovich.task01.model.container.ActualOffer;
import by.epam.javatraining.yermalovich.task01.model.container.OffersArray;
import by.epam.javatraining.yermalovich.task01.model.container.OffersArrayStatic;
import by.epam.javatraining.yermalovich.task01.model.entity.TouristTrip;

public class OffersArrayStaticCreator {

    public ActualOffer createContainer(int length) {
        return new OffersArrayStatic(length);
    }

    public ActualOffer createContainer(TouristTrip[] array){
        return new OffersArray(array);
    }

    @Override
    public String toString() {
        return "OffersArrayStaticCreator";
    }
}
