package domain.routes;

public enum RouteType {
    TRAM(0, "Tram, Streetcar, Light rail. Any light rail or street level system within a metropolitan area."),
    SUBWAY(1, "Subway, Metro. Any underground rail system within a metropolitan area."),
    RAIL(2, "Rail. Used for intercity or long-distance travel."),
    BUS(3, "Bus. Used for short- and long-distance bus routes."),
    FERRY(4, "Ferry. Used for short- and long-distance boat service."),
    CABLE(5, "Cable tram. Used for street-level rail cars where the cable runs beneath the vehicle, e.g., cable car in San Francisco."),
    AERIAL(6, "Aerial lift, suspended cable car (e.g., gondola lift, aerial tramway). Cable transport where cabins, cars, gondolas or open chairs are suspended by means of one or more cables."),
    FUNICULAR(7, "Funicular. Any rail system designed for steep inclines."),
    TROLLEYBUS(11, "Trolleybus. Electric buses that draw power from overhead wires using poles."),
    MONORAIL(12, "Monorail. Railway in which the track consists of a single rail or a beam."),
    UNKNOWN(13, "Unknown route type.");

    private final Integer id;
    private final String description;

    private RouteType(final Integer id, final String description) {
        this.id = id;
        this.description = description;
    }

    public static RouteType getEnumById(final Integer id) {
        for(RouteType e : RouteType.values()){
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
