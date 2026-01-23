package com.graphhopper.routing.lm;

import com.graphhopper.util.JsonFeature;
import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.LinearRing;

import java.util.ArrayList;
import java.util.List;

public class SplitAreafromJsonFeature_PolygonExtractergetPolygonsFikaTest {

    @Test
    public void testFromJsonFeature() {
        GeometryFactory geometryFactory = new GeometryFactory();
        
        Coordinate[] coordinates = new Coordinate[] {
            new Coordinate(0, 0),
            new Coordinate(1, 0),
            new Coordinate(1, 1),
            new Coordinate(0, 1),
            new Coordinate(0, 0)
        };
        
        LinearRing shell = geometryFactory.createLinearRing(coordinates);
        Polygon polygon = geometryFactory.createPolygon(shell, null);
        
        JsonFeature jsonFeature = new JsonFeature();
        jsonFeature.setGeometry(polygon);
        
        SplitArea.fromJsonFeature(jsonFeature);
    }
}
