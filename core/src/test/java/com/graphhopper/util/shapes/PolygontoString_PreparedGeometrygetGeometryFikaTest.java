package com.graphhopper.util.shapes;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;
import org.locationtech.jts.geom.impl.PackedCoordinateSequence;
import org.locationtech.jts.geom.prep.PreparedPolygon;

public class PolygontoString_PreparedGeometrygetGeometryFikaTest {

    @Test
    public void testToStringTriggersGetGeometry() {
        // Create a simple triangle polygon using JTS
        Coordinate[] coordinates = new Coordinate[] {
            new Coordinate(0, 0),
            new Coordinate(1, 0),
            new Coordinate(0.5, 1),
            new Coordinate(0, 0) // close the ring
        };
        
        GeometryFactory geometryFactory = new GeometryFactory();
        Polygon jtsPolygon = geometryFactory.createPolygon(
            new PackedCoordinateSequence.Double(coordinates, 2)
        );
        
        PreparedPolygon preparedPolygon = new PreparedPolygon(jtsPolygon);
        com.graphhopper.util.shapes.Polygon polygon = 
            new com.graphhopper.util.shapes.Polygon(preparedPolygon);
        
        // This call should traverse through toString() -> prepPolygon.getGeometry()
        polygon.toString();
    }
}
