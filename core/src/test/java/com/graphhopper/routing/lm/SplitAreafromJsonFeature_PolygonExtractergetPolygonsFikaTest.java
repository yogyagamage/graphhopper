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
    public void testFromJsonFeatureTriggersPolygonExtracterGetPolygons() {
        // Create a simple polygon geometry
        GeometryFactory geometryFactory = new GeometryFactory();
        Coordinate[] coordinates = new Coordinate[] {
            new Coordinate(0, 0),
            new Coordinate(1, 0),
            new Coordinate(1, 1),
            new Coordinate(0, 1),
            new Coordinate(0, 0)
        };
        LinearRing linearRing = geometryFactory.createLinearRing(coordinates);
        Polygon polygon = geometryFactory.createPolygon(linearRing, null);
        
        // Create a JsonFeature with the polygon geometry
        JsonFeature jsonFeature = new JsonFeature();
        jsonFeature.setGeometry(polygon);
        
        // Invoke the entry point method
        SplitArea.fromJsonFeature(jsonFeature);
    }
}
