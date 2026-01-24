package com.graphhopper.routing.ch;

import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.IntScatterSet;
import com.carrotsearch.hppc.IntSet;
import com.graphhopper.routing.ch.CHPreparationGraph.TurnCostFunction;
import org.junit.jupiter.api.Test;

class CHPreparationGraph_Builderbuild_IndirectSortmergesortFikaTest {

    @Test
    void testPrepareForContractionTriggersIndirectSortMergesort() {
        // Create an edge-based CHPreparationGraph to ensure origGraphBuilder is not null
        TurnCostFunction turnCostFunction = (in, via, out) -> 0;
        CHPreparationGraph graph = CHPreparationGraph.edgeBased(5, 10, turnCostFunction);
        
        // Add at least one edge to ensure origGraphBuilder has data to sort
        graph.addEdge(0, 1, 0, 1.0, 1.0);
        
        // This call should traverse through origGraphBuilder.build() 
        // and eventually invoke IndirectSort.mergesort
        graph.prepareForContraction();
    }
}
