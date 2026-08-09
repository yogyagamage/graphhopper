package com.graphhopper.util.shapes;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;
import org.locationtech.jts.geom.impl.PackedCoordinateSequence;
import org.locationtech.jts.geom.prep.PreparedPolygon;

public class PolygontoString_PreparedGeometrygetGeometryFikaTest {

    @Test
    public void testToStringInvokesGetGeometry() {
        // Create coordinates for a simple triangle polygon
        double[] lats = {0.0, 1.0, 0.0};
        double[] lons = {0.0, 0.0, 1.0};
        
        // Use the second constructor which internally creates a PreparedPolygon
        com.graphhopper.util.shapes.Polygon polygon = new com.graphhopper.util.shapes.Polygon(lats, lons);
        
        // Call the entry point method - this should invoke PreparedGeometry.getGeometry()
        polygon.toString();
    }
}
