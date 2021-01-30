package domain.agency;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;

public class AgencyCsvToObject {
    @CsvBindByPosition(position = 0)
    @Getter String agencyId;

    @CsvBindByPosition(position = 1)
    @Getter String agencyName;

    @CsvBindByPosition(position = 2)
    @Getter String agencyUrl;

    @CsvBindByPosition(position = 3)
    @Getter String agencyTimezone;

    @CsvBindByPosition(position = 4)
    @Getter String agencyEmail;

    @CsvBindByPosition(position = 5)
    @Getter String agencyBrandingUrl;
}
