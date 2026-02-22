package com.graphhopper.util;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;

public class GHUtilitycreateCircle_GeometryFactorymethodFikaTest {

    @Test
    public void testCreateCircleInvokesGeometryFactoryConstructor() {
        // Direct invocation of the entry point method
        // This will execute the full chain: createCircle -> new GeometryFactory()
        GHUtility.createCircle("test-circle", 52.0, 13.0, 100.0);
    }
}
