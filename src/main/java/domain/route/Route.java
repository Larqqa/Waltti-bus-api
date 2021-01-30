package domain.route;
import lombok.Builder;
import lombok.Value;
import java.awt.Color;
import java.net.URI;

@Value
@Builder
public class Route {
    int routeId;
    int agencyId;
    String routeShortName;
    String routeLongName;
    String routeDesc;
    RouteType routeType;
    URI routeUrl;
    Color routeColor;
    Color routeTextColor;
    BikesAllowed bikesAllowed;
}