package com.graphhopper.routing.ch;

import com.carrotsearch.hppc.IntArrayList;
import com.graphhopper.routing.ch.CHPreparationGraph.TurnCostFunction;
import org.junit.jupiter.api.Test;

public class CHPreparationGraph_Buildermethod_IntArrayListmethodFikaTest {

    @Test
    public void testEdgeBasedCallsIntArrayListConstructor() {
        // Create a mock TurnCostFunction since it's required for the constructor
        TurnCostFunction turnCostFunction = (in, via, out) -> 0;
        
        // Call the static entry point method which will trigger the call chain
        CHPreparationGraph graph = CHPreparationGraph.edgeBased(5, 10, turnCostFunction);
        
        // No assertions needed - the test's purpose is to execute the call chain
        // which includes the IntArrayList constructor call
    }
}
