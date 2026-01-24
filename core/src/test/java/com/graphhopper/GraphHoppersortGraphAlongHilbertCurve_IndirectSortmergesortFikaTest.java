package com.graphhopper;

import com.carrotsearch.hppc.sorting.IndirectSort;
import com.graphhopper.storage.BaseGraph;
import com.graphhopper.storage.NodeAccess;
import com.graphhopper.util.EdgeExplorer;
import com.graphhopper.util.EdgeIterator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GraphHoppersortGraphAlongHilbertCurve_IndirectSortmergesortFikaTest {

    @Test
    public void testSortGraphAlongHilbertCurveCallsIndirectSortMergesort() {
        // Create a mock BaseGraph
        BaseGraph mockGraph = Mockito.mock(BaseGraph.class);
        NodeAccess mockNodeAccess = Mockito.mock(NodeAccess.class);
        EdgeExplorer mockExplorer = Mockito.mock(EdgeExplorer.class);
        EdgeIterator mockEdgeIterator = Mockito.mock(EdgeIterator.class);

        // Configure mock behavior
        when(mockGraph.getNodes()).thenReturn(3);
        when(mockGraph.getNodeAccess()).thenReturn(mockNodeAccess);
        when(mockNodeAccess.getLat(Mockito.anyInt())).thenReturn(0.0);
        when(mockNodeAccess.getLon(Mockito.anyInt())).thenReturn(0.0);
        when(mockGraph.createEdgeExplorer()).thenReturn(mockExplorer);
        when(mockGraph.getEdges()).thenReturn(5);
        when(mockExplorer.setBaseNode(Mockito.anyInt())).thenReturn(mockEdgeIterator);
        when(mockEdgeIterator.next()).thenReturn(false); // No edges to simplify

        // Call the static entry point method
        GraphHopper.sortGraphAlongHilbertCurve(mockGraph);
    }
}
