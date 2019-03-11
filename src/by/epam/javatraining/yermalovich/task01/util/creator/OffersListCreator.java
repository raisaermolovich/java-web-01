package by.epam.javatraining.yermalovich.task01.util.creator;

import by.epam.javatraining.yermalovich.task01.model.container.ActualOffer;
import by.epam.javatraining.yermalovich.task01.model.container.OffersList;
import by.epam.javatraining.yermalovich.task01.model.entity.TouristTrip;

import java.util.List;

public class OffersListCreator implements ContainerCreator {
    @Override
    public ActualOffer createContainer() {
        return new OffersList();
    }

    public ActualOffer createContainer(List<TouristTrip> list) {
        return new OffersList(list);
    }

    @Override
    public String toString() {
        return "OffersListCreator";
    }
}
