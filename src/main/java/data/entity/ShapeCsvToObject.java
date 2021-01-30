package data.entity;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;

public class ShapeCsvToObject {
    @CsvBindByPosition(position = 0)
    @Getter String shapeId;

    @CsvBindByPosition(position = 1)
    @Getter String shapePtLat;

    @CsvBindByPosition(position = 2)
    @Getter String shapePtLon;

    @CsvBindByPosition(position = 3)
    @Getter String shapePtSequence;
}
