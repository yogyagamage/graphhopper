package com.graphhopper.util.shapes;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Polygon;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.impl.PackedCoordinateSequence;

public class Polygoncreate_PreparedPolygonmethodFikaTest {

    @Test
    public void testCreateMethodCallsPreparedPolygonConstructor() {
        // Create a simple triangle polygon using JTS
        GeometryFactory geometryFactory = new GeometryFactory();
        Coordinate[] coordinates = new Coordinate[] {
            new Coordinate(0, 0),
            new Coordinate(1, 0),
            new Coordinate(0.5, 1),
            new Coordinate(0, 0) // closed polygon
        };
        
        PackedCoordinateSequence.Double coordinateSequence = 
            new PackedCoordinateSequence.Double(coordinates, 2);
        
        Polygon jtsPolygon = geometryFactory.createPolygon(coordinateSequence);
        
        // Call the entry point method which should trigger the third-party method
        com.graphhopper.util.shapes.Polygon.create(jtsPolygon);
    }
}
