package domain.feedInfo;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;

public class FeedInfoCsvToObject {
    @CsvBindByPosition(position = 0)
    @Getter String feed_publisher_name;

    @CsvBindByPosition(position = 1)
    @Getter String feed_publisher_url;

    @CsvBindByPosition(position = 2)
    @Getter String feed_lang;

    @CsvBindByPosition(position = 3)
    @Getter String feed_start_date;

    @CsvBindByPosition(position = 4)
    @Getter String feed_end_date;

    @CsvBindByPosition(position = 5)
    @Getter String feed_version;
}
