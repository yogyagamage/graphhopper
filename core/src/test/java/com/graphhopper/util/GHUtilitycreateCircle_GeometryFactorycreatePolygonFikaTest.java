package com.graphhopper.util;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Polygon;

public class GHUtilitycreateCircle_GeometryFactorycreatePolygonFikaTest {

    @Test
    public void testCreateCircleInvokesGeometryFactoryCreatePolygon() {
        // Arrange
        String id = "test-circle";
        double centerLat = 52.0;
        double centerLon = 5.0;
        double radius = 100.0;
        
        // Act - This will execute the method and trigger GeometryFactory.createPolygon
        JsonFeature result = GHUtility.createCircle(id, centerLat, centerLon, radius);
        
        // No assertions required - test passes if no exception is thrown
    }
}
