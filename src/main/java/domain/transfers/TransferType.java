package domain.transfers;

public enum TransferType {
    RECOMMENDED(0, "Recommended transfer point between routes."),
    TIMED(1, "Timed transfer point between two routes. The departing vehicle is expected to wait for the arriving one and leave sufficient time for a rider to transfer between routes."),
    MINIMUM(2, "Transfer requires a minimum amount of time between arrival and departure to ensure a connection. The time required to transfer is specified by min_transfer_time."),
    NOT_POSSIBLE(3, "Transfers are not possible between routes at the location.");

    private final Integer id;
    private final String description;

    private TransferType(final Integer id, final String description) {
        this.id = id;
        this.description = description;
    }

    public static TransferType getEnumById(final Integer id) {
        for(TransferType e : TransferType.values()){
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
