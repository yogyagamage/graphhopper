package com.graphhopper.util;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;

public class GHUtilitycreateCircle_GeometryFactorycreatePolygonFikaTest {

    @Test
    public void testCreateCircleInvokesGeometryFactoryCreatePolygon() {
        // Entry point: com.graphhopper.util.GHUtility.createCircle(String, double, double, double)
        // Target third-party method: org.locationtech.jts.geom.GeometryFactory.createPolygon(Coordinate[])
        
        // No constructor parameters needed since GHUtility has default constructor
        // and createCircle is a static method
        
        // Call the entry point method with valid parameters
        GHUtility.createCircle("test-circle", 49.4, 9.7, 100.0);
        
        // The execution path will flow through:
        // 1. GHUtility.createCircle(...)
        // 2. GeometryFactory.createPolygon(...) - This is the target third-party method
        // No assertions needed - test passes if no exceptions are thrown
    }
}
