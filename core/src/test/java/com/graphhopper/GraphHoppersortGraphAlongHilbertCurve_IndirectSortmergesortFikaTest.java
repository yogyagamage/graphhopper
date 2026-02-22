package com.graphhopper;

import com.graphhopper.storage.BaseGraph;
import com.graphhopper.storage.NodeAccess;
import com.graphhopper.util.EdgeExplorer;
import com.graphhopper.util.EdgeIterator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.BitSet;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

public class GraphHoppersortGraphAlongHilbertCurve_IndirectSortmergesortFikaTest {

    @Test
    public void testSortGraphAlongHilbertCurveInvokesIndirectSortMergesort() {
        BaseGraph mockGraph = Mockito.mock(BaseGraph.class);
        NodeAccess mockNodeAccess = Mockito.mock(NodeAccess.class);
        EdgeExplorer mockExplorer = Mockito.mock(EdgeExplorer.class);
        EdgeIterator mockIterator = Mockito.mock(EdgeIterator.class);

        when(mockGraph.getNodes()).thenReturn(5);
        when(mockGraph.getNodeAccess()).thenReturn(mockNodeAccess);
        when(mockGraph.createEdgeExplorer()).thenReturn(mockExplorer);
        when(mockGraph.getEdges()).thenReturn(10);

        when(mockNodeAccess.getLat(anyInt())).thenReturn(50.0);
        when(mockNodeAccess.getLon(anyInt())).thenReturn(10.0);

        when(mockExplorer.setBaseNode(anyInt())).thenReturn(mockIterator);
        when(mockIterator.next()).thenReturn(false);

        GraphHopper.sortGraphAlongHilbertCurve(mockGraph);
    }
}
