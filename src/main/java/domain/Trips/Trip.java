package domain.Trips;

import domain.routes.BikesAllowed;
import domain.stops.WheelchairBoarding;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Trip {
    String routeId;
    String serviceId;
    String tripId;
    String tripHeadsign;
    Integer directionId;
    String blockId;
    Integer shapeId;
    BikesAllowed bikesAllowed;
    String tripShortName;
    WheelchairAccessible wheelchairAccessible;
}
