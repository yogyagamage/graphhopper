package com.graphhopper.routing.ch;

import com.carrotsearch.hppc.IntArrayList;
import com.graphhopper.routing.ch.CHPreparationGraph.TurnCostFunction;
import org.junit.jupiter.api.Test;

class CHPreparationGraph_BuilderbuildFirstEdgesByNode_IntArrayListsetFikaTest {

    @Test
    void testPrepareForContractionTriggersIntArrayListSet() {
        // Create an edge-based CHPreparationGraph to ensure origGraphBuilder is not null
        TurnCostFunction turnCostFunction = (in, via, out) -> 0;
        CHPreparationGraph graph = CHPreparationGraph.edgeBased(0, 0, turnCostFunction);
        
        // Call the entry point method
        graph.prepareForContraction();
    }
}
