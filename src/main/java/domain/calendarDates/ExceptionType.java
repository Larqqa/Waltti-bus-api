package domain.calendarDates;

import domain.route.RouteType;

public enum ExceptionType {
    UNKNOWN(0, "Unknown exception type."),
    ADDED(1,"Service has been added for the specified date."),
    REMOVED(2,"Service has been removed for the specified date.");

    private final Integer id;
    private final String description;

    private ExceptionType(final Integer id, final String description) {
        this.id = id;
        this.description = description;
    }

    public static ExceptionType getEnumById(final Integer id) {
        for(ExceptionType e : ExceptionType.values()){
            if(id.equals(e.id)) return e;
        }
        return null;
    }

    public String getDescription() {
        return description;
    }

    public Integer getId() {
        return id;
    }
}