package util;

import com.opencsv.bean.CsvToBeanBuilder;
import domain.Route;
import domain.RouteConverter;

import java.util.List;
import java.util.stream.Collectors;

public class CsvToBeans {
    public static List read(String fileName, Class template) {
        @SuppressWarnings("unchecked")
        List beans = new CsvToBeanBuilder(ReadFile.read(fileName))
                .withType(template)
                .withSkipLines(1)
                .build()
                .parse();

        return beans;
    }
}
