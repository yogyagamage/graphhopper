package com.graphhopper.util;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;

public class GHUtilitycreateCircle_GeometryFactorycreatePolygonFikaTest {

    @Test
    public void testCreateCircleTriggersGeometryFactoryCreatePolygon() {
        GHUtility instance = new GHUtility();
        
        String id = "test-circle";
        double centerLat = 49.4;
        double centerLon = 9.7;
        double radius = 100.0;
        
        instance.createCircle(id, centerLat, centerLon, radius);
    }
}
