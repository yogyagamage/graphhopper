package com.graphhopper.routing.ch;

import org.junit.jupiter.api.Test;

public class CHPreparationGraph_Buildermethod_IntArrayListmethodFikaTest2 {

    @Test
    public void testNodeBasedToIntArrayListConstructor() {
        // Entry point: com.graphhopper.routing.ch.CHPreparationGraph.nodeBased(int, int)
        // Target: com.carrotsearch.hppc.IntArrayList.<init>()
        // Path: nodeBased -> CHPreparationGraph constructor -> OrigGraph.Builder constructor -> IntArrayList constructor
        
        // This directly triggers the full chain:
        // 1. CHPreparationGraph.nodeBased(2, 3)
        // 2. new CHPreparationGraph(2, 3, false, turnCostFunction)
        // 3. new OrigGraph.Builder() (not created due to edgeBased=false)
        // 4. new IntArrayList() for shortcutsByPrepareEdges field
        com.graphhopper.routing.ch.CHPreparationGraph graph = 
            com.graphhopper.routing.ch.CHPreparationGraph.nodeBased(2, 3);
    }
}
