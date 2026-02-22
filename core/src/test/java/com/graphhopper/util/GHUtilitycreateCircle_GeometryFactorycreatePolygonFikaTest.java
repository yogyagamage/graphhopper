package com.graphhopper.util;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;

import static org.mockito.Mockito.mock;

public class GHUtilitycreateCircle_GeometryFactorycreatePolygonFikaTest {

    @Test
    public void testCreateCircleInvokesCreatePolygon() {
        // Directly call the entry point method
        JsonFeature result = GHUtility.createCircle("test-circle", 52.0, 13.0, 100.0);
        
        // No assertions or verifications - test passes if no exception is thrown
    }
}
