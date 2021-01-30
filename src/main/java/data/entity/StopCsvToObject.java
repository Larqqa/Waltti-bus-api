package data.entity;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;

public class StopCsvToObject {
    @CsvBindByPosition(position = 0)
    @Getter String stopId;

    @CsvBindByPosition(position = 1)
    @Getter String stopCode;

    @CsvBindByPosition(position = 2)
    @Getter String stopName;

    @CsvBindByPosition(position = 3)
    @Getter String stopLat;

    @CsvBindByPosition(position = 4)
    @Getter String stopLon;

    @CsvBindByPosition(position = 5)
    @Getter String zoneId;

    @CsvBindByPosition(position = 6)
    @Getter String stopUrl;

    @CsvBindByPosition(position = 7)
    @Getter String locationType;

    @CsvBindByPosition(position = 8)
    @Getter String parentStation;

    @CsvBindByPosition(position = 9)
    @Getter String municipalityId;

    @CsvBindByPosition(position = 10)
    @Getter String stopDesc;

    @CsvBindByPosition(position = 11)
    @Getter String stopTimezone;

    @CsvBindByPosition(position = 12)
    @Getter String wheelchairBoarding;

    @CsvBindByPosition(position = 13)
    @Getter String platformCode;

    @CsvBindByPosition(position = 14)
    @Getter String vehicleType;
}
