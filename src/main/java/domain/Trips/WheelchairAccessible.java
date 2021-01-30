package domain.Trips;

import domain.transfers.TransferType;

public enum WheelchairAccessible {
/*
0 or empty - No accessibility information for the trip.
1 - Vehicle being used on this particular trip can accommodate at least one rider in a wheelchair.
2 - No riders in wheelchairs can be accommodated on this trip.
*/
    UNDEFINED(0, "No accessibility information for the trip."),
    CAN(1, "Vehicle being used on this particular trip can accommodate at least one rider in a wheelchair."),
    NO(2, "No riders in wheelchairs can be accommodated on this trip.");

    private final Integer id;
    private final String description;

    private WheelchairAccessible(final Integer id, final String description) {
        this.id = id;
        this.description = description;
    }

    public static WheelchairAccessible getEnumById(final Integer id) {
        for(WheelchairAccessible e : WheelchairAccessible.values()){
            if(id.equals(e.id)) return e;
        }
        return null;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

}
