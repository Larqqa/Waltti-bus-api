package domain.calendar;

public enum DateEnum {
    NOT_AVAILABLE(0, "Service is not available for Mondays in the date range."),
    AVAILABLE(1,"Service is available for all Mondays in the date range."),
    UNDEFINED(2, "Date undefined.");

    private final Integer id;
    private final String description;

    private DateEnum(final Integer id, final String description) {
        this.id = id;
        this.description = description;
    }

    public static DateEnum getEnumById(final Integer id) {
        for(DateEnum e : DateEnum.values()){
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
