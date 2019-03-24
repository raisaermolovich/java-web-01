package by.epam.javatraining.yermalovich.task01.model.entity;

import java.util.Objects;

public class FamilyTrip extends GroupTrip{

    private boolean specialOffer;

    public FamilyTrip () {
        super();
        specialOffer = false;
    }

    public FamilyTrip(int days, Transport transport, Meal meals, String destination, int minNumberOfPeople,
                     int maxNumberOfPeople, boolean speacialOffer) {
        super(days, transport, meals, destination, minNumberOfPeople, maxNumberOfPeople);
        this.specialOffer = speacialOffer;
    }

    public FamilyTrip(FamilyTrip another) {
        super(another);
        this.specialOffer = another.specialOffer;

    }

    public boolean isSpeacialOffer() {
        return specialOffer;
    }

    public void setSpeacialOffer(boolean speacialOffer) {
        this.specialOffer = speacialOffer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FamilyTrip that = (FamilyTrip) o;
        return specialOffer == that.specialOffer;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), specialOffer);
    }

    @Override
    public String toString() {
        return
                super.toString() +
                        "speacialOffer=" + specialOffer;
    }
}
