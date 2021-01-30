package data.entity;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;

public class TransferCsvToObject {
    @CsvBindByPosition(position = 0)
    @Getter String fromStopId;

    @CsvBindByPosition(position = 1)
    @Getter String toStopId;

    @CsvBindByPosition(position = 2)
    @Getter String fromRouteId;

    @CsvBindByPosition(position = 3)
    @Getter String toRouteId;

    @CsvBindByPosition(position = 4)
    @Getter String fromTripId;

    @CsvBindByPosition(position = 5)
    @Getter String toTripId;

    @CsvBindByPosition(position = 6)
    @Getter String transferType;

    @CsvBindByPosition(position = 7)
    @Getter String minTransferTime;

}
