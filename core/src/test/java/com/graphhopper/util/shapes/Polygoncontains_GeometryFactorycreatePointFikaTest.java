package com.graphhopper.util.shapes;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.impl.PackedCoordinateSequence;
import org.locationtech.jts.geom.prep.PreparedPolygon;

public class Polygoncontains_GeometryFactorycreatePointFikaTest {

    @Test
    public void test() {
        double[] lats = {1.0, 2.0, 3.0};
        double[] lons = {1.0, 2.0, 3.0};
        
        Polygon polygon = new Polygon(lats, lons);
        polygon.contains(1.5, 1.5);
    }
}
