package domain.stops;

import domain.routes.BikesAllowed;

public enum WheelchairBoarding {
    /*
    For parentless stops:
            0 or empty - No accessibility information for the stop.
            1 - Some vehicles at this stop can be boarded by a rider in a wheelchair.
            2 - Wheelchair boarding is not possible at this stop.

    For child stops:
            0 or empty - Stop will inherit its wheelchair_boarding behavior from the parent station, if specified in the parent.
            1 - There exists some accessible path from outside the station to the specific stop/platform.
            2 - There exists no accessible path from outside the station to the specific stop/platform.

    For station entrances/exits:
            0 or empty - Station entrance will inherit its wheelchair_boarding behavior from the parent station, if specified for the parent.
            1 - Station entrance is wheelchair accessible.
            2 - No accessible path from station entrance to stops/platforms.
    */

    EMPTY(0, "No accessibility information for the stop."),
    SOME(1, "Some vehicles at this stop can be boarded by a rider in a wheelchair."),
    NONE(2, "Wheelchair boarding is not possible at this stop.");

    private final Integer id;
    private final String description;

    private WheelchairBoarding(final Integer id, final String description) {
        this.id = id;
        this.description = description;
    }

    public static WheelchairBoarding getEnumById(final Integer id) {
        for(WheelchairBoarding e : WheelchairBoarding.values()){
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
