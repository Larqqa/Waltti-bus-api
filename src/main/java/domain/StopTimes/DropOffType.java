package domain.StopTimes;

import domain.stops.LocationType;

public enum DropOffType {
    REGULAR(0, "Regularly scheduled drop off."),
    NONE(1, "No drop off available."),
    ARRANGE(2, "Must phone agency to arrange drop off."),
    COORDINATE(3, "Must coordinate with driver to arrange drop off.");

    private final Integer id;
    private final String description;

    private DropOffType(final Integer id, final String description) {
        this.id = id;
        this.description = description;
    }

    public static DropOffType getEnumById(final Integer id) {
        for(DropOffType e : DropOffType.values()){
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
