package com.graphhopper.util;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;

public class GHUtilitycreateCircle_GeometryFactorycreatePolygonFikaTest {

    @Test
    public void testCreateCircleTriggersGeometryFactoryCreatePolygon() {
        // Instantiate the class using the provided constructor
        GHUtility ghUtility = new GHUtility();
        
        // Call the entry point method with arbitrary valid parameters
        // The method is static, so we call it on the class directly
        GHUtility.createCircle("test-circle", 49.4, 9.7, 100.0);
        
        // No assertions or verifications - test passes if no exception is thrown
        // and the third-party method GeometryFactory.createPolygon is invoked
        // during execution of the createCircle method
    }
}
