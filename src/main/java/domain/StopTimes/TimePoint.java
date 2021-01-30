package domain.StopTimes;

import domain.stops.LocationType;

public enum TimePoint {
    APPROXIMATE(0, "Times are considered approximate."),
    EXACT(1, "Times are considered exact.");

    private final Integer id;
    private final String description;

    private TimePoint(final Integer id, final String description) {
        this.id = id;
        this.description = description;
    }

    public static TimePoint getEnumById(final Integer id) {
        for(TimePoint e : TimePoint.values()){
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
