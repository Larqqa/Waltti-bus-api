package service.converters;

import domain.routes.BikesAllowed;
import domain.routes.Route;
import data.entity.RouteCsvToObject;
import domain.routes.RouteType;

import java.awt.*;
import java.net.URI;

import static java.lang.Integer.parseInt;

public final class RouteConverter {
    public RouteConverter() {}
    public static Route convert(RouteCsvToObject input) {
        return Route.builder()
                .routeId(parseInt(input.getRouteId()))
                .agencyId(parseInt(input.getAgencyId()))
                .routeShortName(input.getRouteShortName())
                .routeLongName(input.getRouteLongName())
                .routeDesc(input.getRouteDesc())
                .routeType(RouteType.getEnumById(parseInt(input.getRouteType())))
                .routeUrl(URI.create(input.getRouteUrl()))
                .routeColor(Color.getColor("#" + input.getRouteColor()))
                .routeTextColor(Color.getColor("#" + input.getRouteTextColor()))
                .bikesAllowed(BikesAllowed
                        .getEnumById(parseInt(input.getBikesAllowed().isEmpty()
                            ? "0"
                            : input.getBikesAllowed())))
                .build();
    }
}
