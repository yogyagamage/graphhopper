package com.graphhopper.isochrone.algorithm;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.PrecisionModel;
import com.graphhopper.isochrone.algorithm.ContourBuilder;
import org.mockito.Mockito;

class ContourBuildermethod_GeometryFactorymethodFikaTest {

    @Test
    void test() {
        PrecisionModel precisionModel = new PrecisionModel();
        GeometryFactory geometryFactory = new GeometryFactory(precisionModel);
        
        ReadableTriangulation triangulation = Mockito.mock(ReadableTriangulation.class);
        ContourBuilder contourBuilder = new ContourBuilder(triangulation);
    }
}
