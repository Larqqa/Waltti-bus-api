package data.entity;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;

public class TranslationCsvToObject {
    @CsvBindByPosition(position = 0)
    @Getter String transId;

    @CsvBindByPosition(position = 1)
    @Getter String lang;

    @CsvBindByPosition(position = 2)
    @Getter String translation;
}
