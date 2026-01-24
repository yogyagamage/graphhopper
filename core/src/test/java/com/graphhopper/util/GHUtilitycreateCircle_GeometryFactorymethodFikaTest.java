package com.graphhopper.util;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;

public class GHUtilitycreateCircle_GeometryFactorymethodFikaTest {

    @Test
    public void testCreateCircleTriggersGeometryFactoryConstructor() {
        // Instantiate the class (even though all methods are static)
        GHUtility utility = new GHUtility();
        
        // Call the entry point method with valid parameters
        // This should trigger the GeometryFactory constructor in the execution path
        GHUtility.createCircle("test-circle", 49.4, 9.7, 100.0);
    }
}
