package domain.stops;

import domain.routes.BikesAllowed;

public enum LocationType {
/*
Type of the location:
• 0 (or empty): Stop (or Platform). A location where passengers board or disembark from a transit vehicle. Is called a platform when defined within a parent_station.
• 1: Station. A physical structure or area that contains one or more platform.
• 2: Entrance/Exit. A location where passengers can enter or exit a station from the street. If an entrance/exit belongs to multiple stations, it can be linked by pathways to both, but the data provider must pick one of them as parent.
• 3: Generic Node. A location within a station, not matching any other location_type, which can be used to link together pathways define in pathways.txt.
• 4: Boarding Area. A specific location on a platform, where passengers can board and/or alight vehicles.
*/

    STOP(0, "Stop (or Platform). A location where passengers board or disembark from a transit vehicle. Is called a platform when defined within a parent_station."),
    STATION(1, "Station. A physical structure or area that contains one or more platform."),
    ENTRANCE_EXIT(2, "Entrance/Exit. A location where passengers can enter or exit a station from the street. If an entrance/exit belongs to multiple stations, it can be linked by pathways to both, but the data provider must pick one of them as parent."),
    GENERIC_NODE(3, "Generic Node. A location within a station, not matching any other location_type, which can be used to link together pathways define in pathways.txt."),
    BOARDING_AREA(4, "Boarding Area. A specific location on a platform, where passengers can board and/or alight vehicles.");

    private final Integer id;
    private final String description;

    private LocationType(final Integer id, final String description) {
        this.id = id;
        this.description = description;
    }

    public static LocationType getEnumById(final Integer id) {
        for(LocationType e : LocationType.values()){
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
