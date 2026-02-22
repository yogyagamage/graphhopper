package com.graphhopper.routing.subnetwork;

import com.graphhopper.storage.Graph;
import com.graphhopper.routing.subnetwork.EdgeBasedTarjanSCC.EdgeTransitionFilter;
import com.carrotsearch.hppc.IntContainer;
import com.carrotsearch.hppc.IntArrayList;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class EdgeBasedTarjanSCCmethod_IntArrayDequemethodFikaTest {

    @Test
    public void testFindComponentsForStartEdges() {
        Graph graph = Mockito.mock(Graph.class);
        EdgeTransitionFilter filter = Mockito.mock(EdgeTransitionFilter.class);
        IntContainer edges = IntArrayList.from();
        
        EdgeBasedTarjanSCC.findComponentsForStartEdges(graph, filter, edges);
    }
}
