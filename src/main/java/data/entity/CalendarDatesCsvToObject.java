package data.entity;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;

public class CalendarDatesCsvToObject {
    @CsvBindByPosition(position = 0)
    @Getter String serviceId;

    @CsvBindByPosition(position = 1)
    @Getter String date;

    @CsvBindByPosition(position = 2)
    @Getter String exceptionType;
}
