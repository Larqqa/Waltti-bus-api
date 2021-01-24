package domain;

public enum BikeEnum {
    UNDEFINED(0, "No bike information for the trip."),
    ALLOWED(1, "Vehicle being used on this particular trip can accommodate at least one bicycle."),
    NOTALLOWED(2, "No bicycles are allowed on this trip.");

    private final Integer id;
    private final String description;

    private BikeEnum(final Integer id, final String description) {
        this.id = id;
        this.description = description;
    }

    public static BikeEnum getEnumById(final Integer id) {
        for(BikeEnum e : BikeEnum.values()){
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
