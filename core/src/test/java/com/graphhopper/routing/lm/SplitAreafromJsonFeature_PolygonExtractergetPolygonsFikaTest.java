package com.graphhopper.routing.lm;

import com.graphhopper.util.JsonFeature;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.Polygon;
import org.locationtech.jts.geom.util.PolygonExtracter;
import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Coordinate;

import java.util.ArrayList;
import java.util.List;

public class SplitAreafromJsonFeature_PolygonExtractergetPolygonsFikaTest {

    @Test
    public void testFromJsonFeatureToPolygonExtracterGetPolygons() {
        GeometryFactory geometryFactory = new GeometryFactory();
        Coordinate[] coordinates = new Coordinate[] {
            new Coordinate(0, 0),
            new Coordinate(1, 0),
            new Coordinate(1, 1),
            new Coordinate(0, 1),
            new Coordinate(0, 0)
        };
        Polygon polygon = geometryFactory.createPolygon(coordinates);
        Geometry[] geometries = new Geometry[] { polygon };
        Geometry multiGeometry = geometryFactory.createGeometryCollection(geometries);
        
        JsonFeature jsonFeature = new JsonFeature();
        jsonFeature.setGeometry(multiGeometry);
        
        SplitArea.fromJsonFeature(jsonFeature);
    }
}
