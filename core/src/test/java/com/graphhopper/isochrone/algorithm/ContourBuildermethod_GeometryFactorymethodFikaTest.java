package com.graphhopper.isochrone.algorithm;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import com.graphhopper.isochrone.algorithm.ReadableTriangulation;

class ContourBuildermethod_GeometryFactorymethodFikaTest {

    @Test
    void testContourBuilderConstructorTriggersGeometryFactoryConstructor() {
        ReadableTriangulation mockTriangulation = Mockito.mock(ReadableTriangulation.class);
        ContourBuilder contourBuilder = new ContourBuilder(mockTriangulation);
    }
}
