package data.entity;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;

public class CalendarCsvToObject {
    @CsvBindByPosition(position = 0)
    @Getter String serviceId;

    @CsvBindByPosition(position = 1)
    @Getter String monday;

    @CsvBindByPosition(position = 2)
    @Getter String tuesday;

    @CsvBindByPosition(position = 3)
    @Getter String wednesday;

    @CsvBindByPosition(position = 4)
    @Getter String thursday;

    @CsvBindByPosition(position = 5)
    @Getter String friday;

    @CsvBindByPosition(position = 6)
    @Getter String saturday;

    @CsvBindByPosition(position = 7)
    @Getter String sunday;

    @CsvBindByPosition(position = 8)
    @Getter String startDate;

    @CsvBindByPosition(position = 9)
    @Getter String endDate;
}
