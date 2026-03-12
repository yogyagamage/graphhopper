package com.graphhopper.util;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;

public class GHUtilitycreateCircle_GeometryFactorymethodFikaTest {

    @Test
    public void testCreateCircleTriggersGeometryFactoryConstructor() {
        // The entry point is a static method, so no instance is needed
        // Call the static method with arbitrary valid parameters
        GHUtility.createCircle("test-circle", 49.4, 9.7, 100.0);
        // The GeometryFactory constructor will be invoked during execution
        // No assertions or verifications needed
    }
}
