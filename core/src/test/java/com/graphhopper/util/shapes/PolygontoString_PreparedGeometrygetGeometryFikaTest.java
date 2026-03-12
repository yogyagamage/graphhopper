package com.graphhopper.util.shapes;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;
import org.locationtech.jts.geom.impl.PackedCoordinateSequence;
import org.locationtech.jts.geom.prep.PreparedPolygon;

class PolygontoString_PreparedGeometrygetGeometryFikaTest {

    @Test
    void testToStringInvokesGetGeometry() {
        double[] lats = {1.0, 2.0, 3.0, 1.0};
        double[] lons = {4.0, 5.0, 6.0, 4.0};
        
        Coordinate[] coordinates = new Coordinate[lats.length + 1];
        for (int i = 0; i < lats.length; i++) {
            coordinates[i] = new Coordinate(lons[i], lats[i]);
        }
        coordinates[lats.length] = coordinates[0];
        
        GeometryFactory factory = new GeometryFactory();
        Polygon jtsPolygon = factory.createPolygon(
            new PackedCoordinateSequence.Double(coordinates, 2)
        );
        
        PreparedPolygon preparedPolygon = new PreparedPolygon(jtsPolygon);
        com.graphhopper.util.shapes.Polygon polygon = 
            new com.graphhopper.util.shapes.Polygon(preparedPolygon);
        
        polygon.toString();
    }
}
