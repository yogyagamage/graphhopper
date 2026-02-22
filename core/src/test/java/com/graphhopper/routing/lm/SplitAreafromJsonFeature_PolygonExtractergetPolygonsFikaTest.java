package com.graphhopper.routing.lm;

import com.graphhopper.util.JsonFeature;
import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;
import org.locationtech.jts.geom.Coordinate;

import java.util.HashMap;

public class SplitAreafromJsonFeature_PolygonExtractergetPolygonsFikaTest {

    @Test
    public void testFromJsonFeatureTriggersPolygonExtracterGetPolygons() {
        GeometryFactory geometryFactory = new GeometryFactory();
        Coordinate[] coordinates = new Coordinate[] {
            new Coordinate(0, 0),
            new Coordinate(1, 0),
            new Coordinate(1, 1),
            new Coordinate(0, 1),
            new Coordinate(0, 0)
        };
        Polygon polygon = geometryFactory.createPolygon(coordinates);
        Geometry geometry = polygon;
        
        JsonFeature jsonFeature = new JsonFeature();
        jsonFeature.setGeometry(geometry);
        jsonFeature.setId("test-id");
        jsonFeature.setProperties(new HashMap<>());
        
        SplitArea.fromJsonFeature(jsonFeature);
    }
}
