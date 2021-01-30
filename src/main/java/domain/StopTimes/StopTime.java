package domain.StopTimes;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class StopTime {
    String tripId;
    String arrivalTime;
    String departureTime;
    Integer stopId;
    Integer stopSequence;
    String shapeDistTraveled;
    TimePoint timepoint;
    String stopHeadsign;
    PickupType pickupType;
    DropOffType dropOffType;
}
