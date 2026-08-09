package com.graphhopper.util.shapes;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.impl.PackedCoordinateSequence;
import org.locationtech.jts.geom.GeometryFactory;

class Polygonmethod_GeometryFactorycreatePolygonFikaTest {

    @Test
    void testEntryPointCallsThirdPartyMethod() {
        double[] lats = {1.0, -1.0, -1.0, 1.0};
        double[] lons = {1.0, 1.0, -1.0, -1.0};
        
        Polygon polygon = new Polygon(lats, lons);
    }
}
