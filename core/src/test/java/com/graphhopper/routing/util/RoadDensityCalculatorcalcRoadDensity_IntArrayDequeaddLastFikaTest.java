package com.graphhopper.routing.util;

import com.carrotsearch.hppc.IntArrayDeque;
import com.graphhopper.storage.Graph;
import com.graphhopper.util.EdgeIteratorState;
import com.graphhopper.util.shapes.GHPoint;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.function.ToDoubleFunction;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.anyInt;

public class RoadDensityCalculatorcalcRoadDensity_IntArrayDequeaddLastFikaTest {

    @Test
    public void testCalcRoadDensity() {
        Graph graph = Mockito.mock(Graph.class);
        com.graphhopper.storage.NodeAccess nodeAccess = Mockito.mock(com.graphhopper.storage.NodeAccess.class);
        Mockito.when(graph.getNodeAccess()).thenReturn(nodeAccess);
        Mockito.when(nodeAccess.getLat(anyInt())).thenReturn(0.0);
        Mockito.when(nodeAccess.getLon(anyInt())).thenReturn(0.0);
        
        com.graphhopper.util.EdgeExplorer edgeExplorer = Mockito.mock(com.graphhopper.util.EdgeExplorer.class);
        Mockito.when(graph.createEdgeExplorer()).thenReturn(edgeExplorer);
        
        com.graphhopper.util.EdgeIterator edgeIterator = Mockito.mock(com.graphhopper.util.EdgeIterator.class);
        Mockito.when(edgeExplorer.setBaseNode(anyInt())).thenReturn(edgeIterator);
        Mockito.when(edgeIterator.next()).thenReturn(true, false);
        Mockito.when(edgeIterator.getAdjNode()).thenReturn(2);
        
        RoadDensityCalculator calculator = new RoadDensityCalculator(graph);
        
        EdgeIteratorState edge = Mockito.mock(EdgeIteratorState.class);
        Mockito.when(edge.getBaseNode()).thenReturn(0);
        Mockito.when(edge.getAdjNode()).thenReturn(1);
        
        ToDoubleFunction<EdgeIteratorState> calcRoadFactor = e -> 1.0;
        
        calculator.calcRoadDensity(edge, 100.0, calcRoadFactor);
    }
}
