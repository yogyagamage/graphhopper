package com.graphhopper.routing.util;

import com.graphhopper.routing.util.RoadDensityCalculator;
import com.graphhopper.storage.Graph;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class RoadDensityCalculatormethod_IntArrayDequemethodFikaTest {

    @Test
    public void testConstructorCreatesIntArrayDeque() {
        Graph mockGraph = Mockito.mock(Graph.class);
        when(mockGraph.createEdgeExplorer()).thenReturn(null);
        
        new RoadDensityCalculator(mockGraph);
    }
}
