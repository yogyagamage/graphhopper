package com.graphhopper.util.shapes;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Envelope;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;
import org.locationtech.jts.geom.impl.PackedCoordinateSequence;
import org.locationtech.jts.geom.prep.PreparedPolygon;

public class PolygongetMinLat_EnvelopegetMinYFikaTest {

    @Test
    public void testGetMinLatCallsEnvelopeGetMinY() {
        double[] lats = {1.0, 2.0, 3.0, 1.0};
        double[] lons = {1.0, 2.0, 3.0, 1.0};
        
        com.graphhopper.util.shapes.Polygon polygon = new com.graphhopper.util.shapes.Polygon(lats, lons);
        polygon.getMinLat();
    }
}
