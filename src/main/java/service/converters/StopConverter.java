package service.converters;

import data.entity.StopCsvToObject;
import domain.routes.RouteType;
import domain.stops.LocationType;
import domain.stops.Stop;
import domain.stops.WheelchairBoarding;

import java.net.URI;

import static java.lang.Integer.parseInt;

public class StopConverter {
    public StopConverter() {}

    public static Stop convert(StopCsvToObject input) {
        return Stop.builder()
                .stopId(parseInt(input.getStopId()))
                .stopCode(input.getStopCode())
                .stopName(input.getStopName())
                .stopLat(input.getStopLat())
                .stopLon(input.getStopLon())
                .zoneId(parseInt(input.getZoneId()))
                .stopUrl(URI.create(input.getStopUrl()))
                .locationType(LocationType.getEnumById(parseInt(input.getLocationType())))
                .parentStation(parseInt(input.getParentStation().isEmpty()
                        ? "0"
                        : input.getParentStation()))
                .municipalityId(parseInt(input.getMunicipalityId()))
                .stopDesc(input.getStopDesc())
                .stopTimezone(input.getStopTimezone())
                .wheelchairBoarding(WheelchairBoarding.getEnumById(parseInt(input.getWheelchairBoarding())))
                .platformCode(input.getPlatformCode())
                .vehicleType(RouteType.getEnumById(parseInt(input.getVehicleType().isEmpty()
                        ? "0"
                        : input.getVehicleType())))
                .build();
    }
}
