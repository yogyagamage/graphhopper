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
        // Create a simple triangle polygon
        double[] lats = {0.0, 1.0, 0.0};
        double[] lons = {0.0, 0.0, 1.0};
        
        // Use the second constructor which internally creates a PreparedPolygon
        com.graphhopper.util.shapes.Polygon polygon = new com.graphhopper.util.shapes.Polygon(lats, lons);
        
        // Call toString() which should invoke prepPolygon.getGeometry().getNumPoints()
        // and prepPolygon.getGeometry().getNumGeometries()
        polygon.toString();
    }
}
