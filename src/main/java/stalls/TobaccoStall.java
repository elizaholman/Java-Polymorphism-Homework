package stalls;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;


public class TobaccoStall extends Stall implements ISecurity, IReviewed {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 18;
    }

    public int getRating() {
        return 0;
    }
}
