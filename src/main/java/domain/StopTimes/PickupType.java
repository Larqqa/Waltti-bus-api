package domain.StopTimes;

import domain.stops.LocationType;

public enum PickupType {
    REGULAR(0, "Regularly scheduled pickup."),
    NONE(1, "No pickup available."),
    ARRANGE(2, "Must phone agency to arrange pickup."),
    COORDINATE(3, "Must coordinate with driver to arrange pickup.");

    private final Integer id;
    private final String description;

    private PickupType(final Integer id, final String description) {
        this.id = id;
        this.description = description;
    }

    public static PickupType getEnumById(final Integer id) {
        for(PickupType e : PickupType.values()){
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
