package com.graphhopper.routing.util;

import com.graphhopper.storage.Graph;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class RoadDensityCalculatormethod_IntScatterSetmethodFikaTest {

    @Test
    public void testEntryPointToThirdPartyMethod() {
        Graph mockGraph = Mockito.mock(Graph.class);
        new RoadDensityCalculator(mockGraph);
    }
}
