package com.graphhopper.routing.querygraph;

import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.IntObjectHashMap;
import com.carrotsearch.hppc.IntObjectMap;
import com.graphhopper.storage.Graph;
import com.graphhopper.storage.NodeAccess;
import com.graphhopper.storage.index.Snap;
import com.graphhopper.util.PointList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class QueryOverlayBuilder_EdgeChangeBuildermethod_IntObjectMapisEmptyFikaTest {

    @Test
    public void test() {
        // Create mocks for Graph and NodeAccess
        Graph graph = mock(Graph.class);
        NodeAccess nodeAccess = mock(NodeAccess.class);
        
        when(graph.getNodes()).thenReturn(10);
        when(graph.getEdges()).thenReturn(20);
        when(graph.getNodeAccess()).thenReturn(nodeAccess);
        when(nodeAccess.is3D()).thenReturn(false);
        
        // Create empty snaps list to avoid complex setup
        List<Snap> snaps = new ArrayList<>();
        
        // Invoke the entry point method
        QueryOverlayBuilder.build(graph, snaps);
    }
}
