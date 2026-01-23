package com.graphhopper.routing.querygraph;

import com.graphhopper.storage.BaseGraph;
import com.graphhopper.storage.index.Snap;
import com.carrotsearch.hppc.IntObjectMap;
import com.carrotsearch.hppc.procedures.IntObjectProcedure;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

class QueryGraphbuildVirtualEdgesAtRealNodes_IntObjectMapforEachFikaTest {

    @Test
    void testBuildVirtualEdgesAtRealNodesInvokesForEach() {
        // Create a real BaseGraph with minimal configuration
        BaseGraph baseGraph = new BaseGraph.Builder(1).create();
        
        // Create a valid Snap that won't trigger the IllegalStateException
        Snap snap = new Snap(0, 0);
        snap.setClosestNode(0);
        snap.setSnappedPosition(Snap.Position.TOWER);
        
        List<Snap> snaps = new ArrayList<>();
        snaps.add(snap);
        
        // This will invoke the full chain:
        // QueryGraph.create -> QueryGraph constructor -> buildVirtualEdgesAtRealNodes
        // -> queryOverlay.getEdgeChangesAtRealNodes().forEach()
        QueryGraph queryGraph = QueryGraph.create(baseGraph, snaps);
    }
}
