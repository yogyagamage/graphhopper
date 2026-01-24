package com.graphhopper.util.shapes;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;
import org.locationtech.jts.geom.impl.PackedCoordinateSequence;
import org.locationtech.jts.geom.prep.PreparedPolygon;

public class Polygoncontains_GeometryFactorycreatePointFikaTest {

    @Test
    public void testContainsTriggersCreatePoint() {
        double[] lats = {0.0, 1.0, 1.0, 0.0};
        double[] lons = {0.0, 0.0, 1.0, 1.0};
        
        com.graphhopper.util.shapes.Polygon polygon = 
            new com.graphhopper.util.shapes.Polygon(lats, lons);
        
        polygon.contains(0.5, 0.5);
    }
}
