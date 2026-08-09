package com.graphhopper.isochrone.algorithm;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import com.graphhopper.isochrone.algorithm.ReadableTriangulation;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.PrecisionModel;

public class ContourBuildermethod_GeometryFactorymethodFikaTest {

    @Test
    public void testEntryPointToThirdPartyMethod() {
        ReadableTriangulation mockTriangulation = Mockito.mock(ReadableTriangulation.class);
        ContourBuilder contourBuilder = new ContourBuilder(mockTriangulation);
    }
}
