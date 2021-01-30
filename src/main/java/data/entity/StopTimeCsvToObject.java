package data.entity;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;

public class StopTimeCsvToObject {
    @CsvBindByPosition(position = 0)
    @Getter String tripId;

    @CsvBindByPosition(position = 1)
    @Getter String arrivalTime;

    @CsvBindByPosition(position = 2)
    @Getter String departureTime;

    @CsvBindByPosition(position = 3)
    @Getter String stopId;

    @CsvBindByPosition(position = 4)
    @Getter String stopSequence;

    @CsvBindByPosition(position = 5)
    @Getter String shapeDistTraveled;

    @CsvBindByPosition(position = 6)
    @Getter String timepoint;

    @CsvBindByPosition(position = 7)
    @Getter String stopHeadsign;

    @CsvBindByPosition(position = 8)
    @Getter String pickupType;

    @CsvBindByPosition(position = 9)
    @Getter String dropOffType;
}
