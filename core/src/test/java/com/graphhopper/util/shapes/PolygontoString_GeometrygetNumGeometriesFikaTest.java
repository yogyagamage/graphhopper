package com.graphhopper.util.shapes;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;
import org.locationtech.jts.geom.impl.PackedCoordinateSequence;
import org.locationtech.jts.geom.prep.PreparedPolygon;

public class PolygontoString_GeometrygetNumGeometriesFikaTest {

    @Test
    public void testToStringTriggersGetNumGeometries() {
        // Create a simple triangle polygon
        double[] lats = {0.0, 1.0, 0.0};
        double[] lons = {0.0, 0.0, 1.0};
        
        // This will use the second constructor which creates a PreparedPolygon internally
        com.graphhopper.util.shapes.Polygon polygon = new com.graphhopper.util.shapes.Polygon(lats, lons);
        
        // Invoke the entry point method - this should trigger the third-party method call
        polygon.toString();
    }
}
