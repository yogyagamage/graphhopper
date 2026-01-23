package com.graphhopper.util;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;

public class GHUtilitycreateCircle_GeometryFactorymethodFikaTest {

    @Test
    public void testCreateCircleTriggersGeometryFactoryConstructor() {
        // The entry point is a static method, so no instance is needed
        // The path requires that GeometryFactory constructor is invoked
        // We simply call the entry point with valid parameters
        
        String id = "test-circle";
        double centerLat = 49.4;
        double centerLon = 9.7;
        double radius = 100.0;
        
        // This will trigger the GeometryFactory constructor inside createCircle
        GHUtility.createCircle(id, centerLat, centerLon, radius);
    }
}
