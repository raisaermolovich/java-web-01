package by.epam.javatraining.yermalovich.task01.model.util.creator;

import by.epam.javatraining.yermalovich.task01.model.container.ActualOffer;
import by.epam.javatraining.yermalovich.task01.model.container.OffersArray;
import by.epam.javatraining.yermalovich.task01.model.entity.TouristTrip;

public class OffersArrayCreator implements ContainerCreator {
    @Override
    public ActualOffer createContainer(){
        return new OffersArray();
    }

    public ActualOffer createContainer(TouristTrip[] array){
        return new OffersArray(array);
    }

    @Override
    public String toString() {
        return "OffersArrayCreator";
    }
}
