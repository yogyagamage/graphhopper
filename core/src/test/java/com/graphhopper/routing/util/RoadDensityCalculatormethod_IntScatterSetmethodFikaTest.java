package com.graphhopper.routing.util;

import com.graphhopper.routing.util.RoadDensityCalculator;
import com.graphhopper.storage.Graph;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;

public class RoadDensityCalculatormethod_IntScatterSetmethodFikaTest {

    @Test
    public void testIntScatterSetConstructorIsCalled() {
        Graph mockGraph = mock(Graph.class);
        Mockito.when(mockGraph.createEdgeExplorer()).thenReturn(null);
        
        new RoadDensityCalculator(mockGraph);
    }
}
