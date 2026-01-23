package com.graphhopper.util.shapes;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.impl.PackedCoordinateSequence;

public class Polygonmethod_GeometryFactorycreatePolygonFikaTest {

    @Test
    public void testEntryPointToThirdPartyMethod() {
        double[] lats = {1.0, 2.0, 3.0};
        double[] lons = {4.0, 5.0, 6.0};
        
        Polygon polygon = new Polygon(lats, lons);
    }
}
