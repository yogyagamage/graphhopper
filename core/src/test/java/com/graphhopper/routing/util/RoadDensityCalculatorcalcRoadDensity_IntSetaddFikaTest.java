package com.graphhopper.routing.util;

import com.carrotsearch.hppc.IntArrayDeque;
import com.carrotsearch.hppc.IntSet;
import com.graphhopper.storage.Graph;
import com.graphhopper.storage.NodeAccess;
import com.graphhopper.util.EdgeExplorer;
import com.graphhopper.util.EdgeIterator;
import com.graphhopper.util.EdgeIteratorState;
import com.graphhopper.util.DistancePlaneProjection;
import com.graphhopper.util.shapes.GHPoint;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.function.ToDoubleFunction;

public class RoadDensityCalculatorcalcRoadDensity_IntSetaddFikaTest {

    @Test
    public void testCalcRoadDensity() {
        Graph graph = Mockito.mock(Graph.class);
        NodeAccess nodeAccess = Mockito.mock(NodeAccess.class);
        EdgeExplorer edgeExplorer = Mockito.mock(EdgeExplorer.class);
        EdgeIterator edgeIterator = Mockito.mock(EdgeIterator.class);
        EdgeIteratorState edgeIteratorState = Mockito.mock(EdgeIteratorState.class);

        Mockito.when(graph.getNodeAccess()).thenReturn(nodeAccess);
        Mockito.when(graph.createEdgeExplorer()).thenReturn(edgeExplorer);
        Mockito.when(nodeAccess.getLat(Mockito.anyInt())).thenReturn(0.0);
        Mockito.when(nodeAccess.getLon(Mockito.anyInt())).thenReturn(0.0);
        Mockito.when(edgeIteratorState.getBaseNode()).thenReturn(1);
        Mockito.when(edgeIteratorState.getAdjNode()).thenReturn(2);
        Mockito.when(edgeExplorer.setBaseNode(Mockito.anyInt())).thenReturn(edgeIterator);
        Mockito.when(edgeIterator.next()).thenReturn(true, false, true, false);
        Mockito.when(edgeIterator.getAdjNode()).thenReturn(3, 4);

        RoadDensityCalculator calculator = new RoadDensityCalculator(graph);
        ToDoubleFunction<EdgeIteratorState> roadFactor = e -> 1.0;

        calculator.calcRoadDensity(edgeIteratorState, 100.0, roadFactor);
    }
}
