package domain.route;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;

public final class RouteCsvToObject {
    @CsvBindByPosition(position = 0)
    @Getter String routeId;

    @CsvBindByPosition(position = 1)
    @Getter String agencyId;

    @CsvBindByPosition(position = 2)
    @Getter String routeShortName;

    @CsvBindByPosition(position = 3)
    @Getter String routeLongName;

    @CsvBindByPosition(position = 4)
    @Getter String routeDesc;

    @CsvBindByPosition(position = 5)
    @Getter String routeType;

    @CsvBindByPosition(position = 6)
    @Getter String routeUrl;

    @CsvBindByPosition(position = 7)
    @Getter String routeColor;

    @CsvBindByPosition(position = 8)
    @Getter String routeTextColor;

    @CsvBindByPosition(position = 9)
    @Getter String bikesAllowed;
}
