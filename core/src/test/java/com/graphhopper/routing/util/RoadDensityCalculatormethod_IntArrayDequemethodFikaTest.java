package com.graphhopper.routing.util;

import com.carrotsearch.hppc.IntArrayDeque;
import com.carrotsearch.hppc.IntScatterSet;
import com.graphhopper.storage.Graph;
import com.graphhopper.util.EdgeExplorer;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class RoadDensityCalculatormethod_IntArrayDequemethodFikaTest {

    @Test
    void test() {
        Graph mockGraph = Mockito.mock(Graph.class);
        EdgeExplorer mockEdgeExplorer = Mockito.mock(EdgeExplorer.class);
        Mockito.when(mockGraph.createEdgeExplorer()).thenReturn(mockEdgeExplorer);
        
        RoadDensityCalculator calculator = new RoadDensityCalculator(mockGraph);
    }
}
