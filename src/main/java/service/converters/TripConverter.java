package service.converters;

import data.entity.TripCsvToObject;
import domain.Trips.Trip;
import domain.Trips.WheelchairAccessible;
import domain.routes.BikesAllowed;

import static java.lang.Integer.parseInt;

public class TripConverter {
    public TripConverter() {}

    public static Trip convert(TripCsvToObject input) {
        return Trip.builder()
                .routeId(input.getRouteId())
                .serviceId(input.getServiceId())
                .tripId(input.getTripId())
                .tripHeadsign(input.getTripHeadsign())
                .directionId(parseInt(input.getDirectionId()))
                .blockId(input.getBlockId())
                .shapeId(parseInt(input.getShapeId()))
                .bikesAllowed(BikesAllowed.getEnumById(parseInt(input.getBikesAllowed())))
                .tripShortName(input.getTripShortName())
                .wheelchairAccessible(WheelchairAccessible.getEnumById(parseInt(input.getWheelchairAccessible())))
                .build();
    }
}
