package com.graphhopper.util.shapes;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Polygon;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.impl.PackedCoordinateSequence;

public class Polygoncreate_PreparedPolygonmethodFikaTest {

    @Test
    public void testCreateTriggersPreparedPolygonConstructor() {
        GeometryFactory geometryFactory = new GeometryFactory();
        Coordinate[] coordinates = new Coordinate[] {
            new Coordinate(0, 0),
            new Coordinate(1, 0),
            new Coordinate(1, 1),
            new Coordinate(0, 1),
            new Coordinate(0, 0)
        };
        PackedCoordinateSequence.Double sequence = new PackedCoordinateSequence.Double(coordinates, 2);
        Polygon jtsPolygon = geometryFactory.createPolygon(sequence);
        
        com.graphhopper.util.shapes.Polygon result = com.graphhopper.util.shapes.Polygon.create(jtsPolygon);
    }
}
