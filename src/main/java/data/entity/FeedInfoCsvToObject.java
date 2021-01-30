package data.entity;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;

public class FeedInfoCsvToObject {
    @CsvBindByPosition(position = 0)
    @Getter String feedPublisherName;

    @CsvBindByPosition(position = 1)
    @Getter String feedPublisherUrl;

    @CsvBindByPosition(position = 2)
    @Getter String feedLang;

    @CsvBindByPosition(position = 3)
    @Getter String feedStartDate;

    @CsvBindByPosition(position = 4)
    @Getter String feedEndDate;

    @CsvBindByPosition(position = 5)
    @Getter String feedVersion;
}
