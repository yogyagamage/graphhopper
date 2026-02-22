package com.graphhopper.util.shapes;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;

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
        Polygon jtsPolygon = geometryFactory.createPolygon(coordinates);
        
        com.graphhopper.util.shapes.Polygon.create(jtsPolygon);
    }
}
