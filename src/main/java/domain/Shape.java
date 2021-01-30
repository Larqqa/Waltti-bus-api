package domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Shape {
    Integer shapeId;
    String shapePtLat;
    String shapePtLon;
    Integer shapePtSequence;
}
