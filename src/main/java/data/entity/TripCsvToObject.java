package data.entity;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;

public class TripCsvToObject {
    @CsvBindByPosition(position = 0)
    @Getter String routeId;

    @CsvBindByPosition(position = 1)
    @Getter String serviceId;

    @CsvBindByPosition(position = 2)
    @Getter String tripId;

    @CsvBindByPosition(position = 3)
    @Getter String tripHeadsign;

    @CsvBindByPosition(position = 4)
    @Getter String directionId;

    @CsvBindByPosition(position = 5)
    @Getter String blockId;

    @CsvBindByPosition(position = 6)
    @Getter String shapeId;

    @CsvBindByPosition(position = 7)
    @Getter String bikesAllowed;

    @CsvBindByPosition(position = 8)
    @Getter String tripShortName;

    @CsvBindByPosition(position = 9)
    @Getter String wheelchairAccessible;
}
