package com.graphhopper.util.shapes;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.impl.PackedCoordinateSequence;
import org.locationtech.jts.geom.prep.PreparedPolygon;

public class PolygontoString_GeometrygetNumPointsFikaTest {

    @Test
    public void testToStringTriggersGetNumPoints() {
        double[] lats = {1.0, 2.0, 3.0, 1.0};
        double[] lons = {4.0, 5.0, 6.0, 4.0};
        
        Coordinate[] coordinates = new Coordinate[lats.length + 1];
        for (int i = 0; i < lats.length; i++) {
            coordinates[i] = new Coordinate(lons[i], lats[i]);
        }
        coordinates[lats.length] = coordinates[0];
        
        GeometryFactory factory = new GeometryFactory();
        PackedCoordinateSequence.Double sequence = new PackedCoordinateSequence.Double(coordinates, 2);
        org.locationtech.jts.geom.Polygon jtsPolygon = factory.createPolygon(sequence);
        PreparedPolygon preparedPolygon = new PreparedPolygon(jtsPolygon);
        
        Polygon polygon = new Polygon(preparedPolygon);
        polygon.toString();
    }
}
