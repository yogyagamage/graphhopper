package com.graphhopper.routing.ch;

import com.carrotsearch.hppc.IntArrayList;
import com.graphhopper.routing.ch.CHPreparationGraph.TurnCostFunction;
import org.junit.jupiter.api.Test;

class CHPreparationGraph_BuilderaddEdge_IntArrayListaddFikaTest {

    @Test
    void testAddEdgePath() {
        // Create a TurnCostFunction mock since it's required for edge-based constructor
        TurnCostFunction turnCostFunction = (in, via, out) -> 0;
        
        // Use the static factory method to create an edge-based CHPreparationGraph
        // This ensures edgeBased=true and origGraphBuilder is initialized
        CHPreparationGraph graph = CHPreparationGraph.edgeBased(10, 20, turnCostFunction);
        
        // Call the entry point method with parameters that will trigger the desired path
        // We need fwd or bwd to be true, and from != to
        graph.addEdge(1, 2, 3, 1.0, Double.POSITIVE_INFINITY);
    }
}
