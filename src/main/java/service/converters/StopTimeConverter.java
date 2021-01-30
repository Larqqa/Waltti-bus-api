package service.converters;

import data.entity.StopCsvToObject;
import data.entity.StopTimeCsvToObject;
import domain.StopTimes.DropOffType;
import domain.StopTimes.PickupType;
import domain.StopTimes.StopTime;
import domain.StopTimes.TimePoint;

import static java.lang.Integer.parseInt;

public class StopTimeConverter {
    public StopTimeConverter() {}

    public static StopTime convert(StopTimeCsvToObject input) {
        return StopTime.builder()
                .tripId(input.getTripId())
                .arrivalTime(input.getArrivalTime())
                .departureTime(input.getDepartureTime())
                .stopId(parseInt(input.getStopId()))
                .stopSequence(parseInt(input.getStopSequence()))
                .shapeDistTraveled(input.getShapeDistTraveled())
                .timepoint(TimePoint.getEnumById(parseInt(input.getTimepoint())))
                .stopHeadsign(input.getStopHeadsign())
                .pickupType(PickupType.getEnumById(parseInt(input.getPickupType())))
                .dropOffType(DropOffType.getEnumById(parseInt(input.getDropOffType())))
                .build();
    }
}
