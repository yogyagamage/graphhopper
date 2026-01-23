package com.graphhopper.util.shapes;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.impl.PackedCoordinateSequence;
import org.locationtech.jts.geom.prep.PreparedPolygon;

public class Polygoncontains_GeometryFactorycreatePointFikaTest {

    @Test
    public void testContainsTriggersCreatePoint() {
        double[] lats = {0.0, 1.0, 1.0, 0.0};
        double[] lons = {0.0, 0.0, 1.0, 1.0};
        
        Coordinate[] coordinates = new Coordinate[lats.length + 1];
        for (int i = 0; i < lats.length; i++) {
            coordinates[i] = new Coordinate(lons[i], lats[i]);
        }
        coordinates[lats.length] = coordinates[0];
        
        GeometryFactory factory = new GeometryFactory();
        PackedCoordinateSequence.Double sequence = new PackedCoordinateSequence.Double(coordinates, 2);
        PreparedPolygon prepPolygon = new PreparedPolygon(factory.createPolygon(sequence));
        
        Polygon polygon = new Polygon(prepPolygon);
        polygon.contains(0.5, 0.5);
    }
}
