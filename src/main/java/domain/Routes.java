package domain;
import lombok.Builder;
import lombok.Value;
import java.awt.Color;
import java.net.URI;

@Value
@Builder
public class Routes {
    int routeId;
    int agencyId;
    String routeShortName;
    String routeLongName;
    String routeDesc;
    RouteType routeType;
    URI routeUrl;
    Color routeColor;
    Color routeTextColor;
    BikeEnum bikesAllowed;
}
