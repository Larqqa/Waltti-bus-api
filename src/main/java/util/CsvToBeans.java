package util;

import com.opencsv.bean.CsvToBeanBuilder;

import java.util.List;

public class CsvToBeans {
    public static List read(String fileName, Class template) {
        return new CsvToBeanBuilder(ReadFile.read(fileName))
                .withType(template)
                .withSkipLines(1)
                .build()
                .parse();
    }
}
