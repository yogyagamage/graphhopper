package com.graphhopper.routing.ch;

import com.carrotsearch.hppc.IntArrayList;
import com.graphhopper.routing.ch.CHPreparationGraph.TurnCostFunction;
import org.junit.jupiter.api.Test;

class CHPreparationGraph_Buildermethod_IntArrayListmethodFikaTest {

    @Test
    void testEdgeBasedCallsIntArrayListConstructor() {
        // Create a simple TurnCostFunction implementation
        TurnCostFunction turnCostFunction = (inEdge, viaNode, outEdge) -> 0.0;
        
        // Call the static entry point method
        CHPreparationGraph graph = CHPreparationGraph.edgeBased(5, 10, turnCostFunction);
        
        // The call chain should have triggered:
        // 1. CHPreparationGraph.edgeBased() 
        // 2. CHPreparationGraph constructor
        // 3. OrigGraph.Builder constructor
        // 4. IntArrayList constructor (via shortcutsByPrepareEdges = new IntArrayList())
    }
}
