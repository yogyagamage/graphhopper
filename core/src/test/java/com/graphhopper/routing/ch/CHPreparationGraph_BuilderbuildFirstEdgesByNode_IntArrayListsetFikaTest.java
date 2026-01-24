package com.graphhopper.routing.ch;

import com.carrotsearch.hppc.IntArrayList;
import com.graphhopper.routing.ch.CHPreparationGraph.TurnCostFunction;
import org.junit.jupiter.api.Test;

class CHPreparationGraph_BuilderbuildFirstEdgesByNode_IntArrayListsetFikaTest {

    @Test
    void testPrepareForContractionTriggersIntArrayListSet() {
        // Create an edge-based CHPreparationGraph with 0 nodes and 0 edges
        // This will cause buildFirstEdgesByNode() to take the path where numFroms == 0
        // and call firstEdgesByNode.set(0, numEdges)
        TurnCostFunction turnCostFunction = (in, via, out) -> 0;
        CHPreparationGraph graph = CHPreparationGraph.edgeBased(0, 0, turnCostFunction);
        
        // Call the entry point method
        graph.prepareForContraction();
    }
}
