package service.converters;

import data.entity.ShapeCsvToObject;
import domain.Shape;

import static java.lang.Integer.parseInt;

public class ShapeConverter {
    public ShapeConverter() {}

    public static Shape convert(ShapeCsvToObject input) {
        return Shape.builder()
                .shapeId(parseInt(input.getShapeId()))
                .shapePtLat(input.getShapePtLat())
                .shapePtLon(input.getShapePtLon())
                .shapePtSequence(parseInt(input.getShapePtSequence()))
                .build();
    }
}
