package com.graphhopper.routing.ch;

import com.carrotsearch.hppc.IntArrayList;
import com.graphhopper.routing.ch.CHPreparationGraph;
import com.graphhopper.routing.weighting.Weighting;
import com.graphhopper.storage.Graph;
import com.graphhopper.routing.util.AllEdgesIterator;
import com.graphhopper.util.EdgeIteratorState;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class CHPreparationGraph_BuilderbuildFirstEdgesByNode_IntArrayListsetFikaTest {

    @Test
    public void testBuildFromGraphToIntArrayListSet() {
        // Create a mock Graph
        Graph mockGraph = Mockito.mock(Graph.class);
        when(mockGraph.getNodes()).thenReturn(0);
        when(mockGraph.getEdges()).thenReturn(0);
        
        // Create a mock AllEdgesIterator
        AllEdgesIterator mockIter = Mockito.mock(AllEdgesIterator.class);
        when(mockGraph.getAllEdges()).thenReturn(mockIter);
        when(mockIter.next()).thenReturn(false);
        
        // Create a mock Weighting
        Weighting mockWeighting = Mockito.mock(Weighting.class);
        
        // Create CHPreparationGraph instance using the static factory method for edgeBased
        CHPreparationGraph prepareGraph = CHPreparationGraph.edgeBased(0, 0, (in, via, out) -> 0);
        
        // Call the entry point method
        CHPreparationGraph.buildFromGraph(prepareGraph, mockGraph, mockWeighting);
    }
}
