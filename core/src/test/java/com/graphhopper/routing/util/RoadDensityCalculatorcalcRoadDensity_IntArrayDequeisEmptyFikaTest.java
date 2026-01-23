package com.graphhopper.routing.util;

import com.carrotsearch.hppc.IntArrayDeque;
import com.carrotsearch.hppc.IntScatterSet;
import com.carrotsearch.hppc.IntSet;
import com.graphhopper.storage.Graph;
import com.graphhopper.storage.NodeAccess;
import com.graphhopper.util.DistancePlaneProjection;
import com.graphhopper.util.EdgeExplorer;
import com.graphhopper.util.EdgeIterator;
import com.graphhopper.util.EdgeIteratorState;
import com.graphhopper.util.PointAccess;
import com.graphhopper.util.shapes.GHPoint;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.function.ToDoubleFunction;

class RoadDensityCalculatorcalcRoadDensity_IntArrayDequeisEmptyFikaTest {

    @Test
    void testCalcRoadDensity() {
        Graph graph = Mockito.mock(Graph.class);
        NodeAccess nodeAccess = Mockito.mock(NodeAccess.class);
        EdgeExplorer edgeExplorer = Mockito.mock(EdgeExplorer.class);
        EdgeIterator edgeIterator = Mockito.mock(EdgeIterator.class);
        
        Mockito.when(graph.createEdgeExplorer()).thenReturn(edgeExplorer);
        Mockito.when(graph.getNodeAccess()).thenReturn(nodeAccess);
        Mockito.when(nodeAccess.getLat(Mockito.anyInt())).thenReturn(0.0);
        Mockito.when(nodeAccess.getLon(Mockito.anyInt())).thenReturn(0.0);
        Mockito.when(edgeExplorer.setBaseNode(Mockito.anyInt())).thenReturn(edgeIterator);
        Mockito.when(edgeIterator.next()).thenReturn(false);
        
        RoadDensityCalculator calculator = new RoadDensityCalculator(graph);
        
        EdgeIteratorState edge = Mockito.mock(EdgeIteratorState.class);
        Mockito.when(edge.getBaseNode()).thenReturn(0);
        Mockito.when(edge.getAdjNode()).thenReturn(1);
        
        ToDoubleFunction<EdgeIteratorState> calcRoadFactor = e -> 0.0;
        
        calculator.calcRoadDensity(edge, 100.0, calcRoadFactor);
    }
}
