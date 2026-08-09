package com.graphhopper.util;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;

public class GHUtilitycreateCircle_GeometryFactorymethodFikaTest {

    @Test
    public void testCreateCircleTriggersGeometryFactoryConstructor() {
        // Directly call the static entry point method
        // This will execute the full chain and trigger GeometryFactory.<init>()
        GHUtility.createCircle("testCircle", 49.4, 9.7, 100.0);
    }
}
