package com.graphhopper.util;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;

public class GHUtilitycreateCircle_GeometryFactorycreatePolygonFikaTest {

    @Test
    public void testCreateCircleTriggersGeometryFactoryCreatePolygon() {
        // Instantiate the class (GHUtility has only a private constructor, but the method is static)
        // No instance needed for static method
        
        // Call the entry point method with parameters that will lead to GeometryFactory.createPolygon
        GHUtility.createCircle("testCircle", 49.4, 9.7, 100.0);
        
        // The test will execute the full chain:
        // 1. GHUtility.createCircle(...)
        // 2. GeometryFactory.createPolygon(...) - target third-party method
        // No assertions needed as per requirements
    }
}
