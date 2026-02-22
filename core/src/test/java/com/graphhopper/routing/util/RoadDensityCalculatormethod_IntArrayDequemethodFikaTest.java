package com.graphhopper.routing.util;

import com.graphhopper.storage.Graph;
import com.graphhopper.routing.util.RoadDensityCalculator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class RoadDensityCalculatormethod_IntArrayDequemethodFikaTest {

    @Test
    public void testEntryPointToThirdPartyMethod() {
        Graph mockGraph = Mockito.mock(Graph.class);
        RoadDensityCalculator calculator = new RoadDensityCalculator(mockGraph);
    }
}
