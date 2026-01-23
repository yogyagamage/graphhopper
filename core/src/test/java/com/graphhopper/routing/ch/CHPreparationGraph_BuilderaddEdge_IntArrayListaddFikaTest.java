package com.graphhopper.routing.ch;

import com.carrotsearch.hppc.IntArrayList;
import com.graphhopper.routing.ch.CHPreparationGraph.TurnCostFunction;
import org.junit.jupiter.api.Test;

class CHPreparationGraph_BuilderaddEdge_IntArrayListaddFikaTest {

    @Test
    void testAddEdgeChain() {
        // Create a TurnCostFunction mock since it's required for edge-based constructor
        TurnCostFunction turnCostFunction = (in, via, out) -> 0;
        
        // Use the static factory method to create an edge-based CHPreparationGraph
        // This ensures edgeBased=true and origGraphBuilder is initialized
        CHPreparationGraph graph = CHPreparationGraph.edgeBased(10, 20, turnCostFunction);
        
        // Call addEdge with valid parameters that will trigger the full chain
        // We need finite weights to ensure fwd or bwd is true
        // We also need from != to to avoid the loop edge exception
        graph.addEdge(0, 1, 5, 1.0, Double.POSITIVE_INFINITY);
    }
}
