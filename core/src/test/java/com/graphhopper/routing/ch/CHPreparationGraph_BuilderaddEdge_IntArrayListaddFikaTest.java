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
        // This ensures edgeBased=true so origGraphBuilder is initialized
        CHPreparationGraph graph = CHPreparationGraph.edgeBased(10, 20, turnCostFunction);
        
        // Call the entry point method with parameters that will trigger the desired path
        // from != to to avoid IllegalArgumentException
        // weightFwd finite to ensure fwd=true
        // weightBwd finite to ensure bwd=true
        // This will trigger the edgeBased branch and call origGraphBuilder.addEdge
        graph.addEdge(0, 1, 5, 1.0, 2.0);
    }
}
