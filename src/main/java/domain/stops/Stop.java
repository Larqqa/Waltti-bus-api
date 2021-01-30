package domain.stops;

import domain.routes.RouteType;
import lombok.Builder;
import lombok.Value;

import java.net.URI;

@Value
@Builder
public class Stop {
    Integer stopId;
    String stopCode;
    String stopName;
    String stopLat;
    String stopLon;
    Integer zoneId;
    URI stopUrl;
    LocationType locationType;
    Integer parentStation;
    Integer municipalityId;
    String stopDesc;
    String stopTimezone;
    WheelchairBoarding wheelchairBoarding;
    String platformCode;
    RouteType vehicleType;
}
