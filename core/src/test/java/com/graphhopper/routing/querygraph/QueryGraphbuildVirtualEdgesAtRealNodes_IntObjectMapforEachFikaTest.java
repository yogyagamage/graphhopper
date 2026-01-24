package com.graphhopper.routing.querygraph;

import com.carrotsearch.hppc.IntObjectMap;
import com.carrotsearch.hppc.procedures.IntObjectProcedure;
import com.graphhopper.storage.BaseGraph;
import com.graphhopper.storage.index.Snap;
import com.graphhopper.util.EdgeExplorer;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class QueryGraphbuildVirtualEdgesAtRealNodes_IntObjectMapforEachFikaTest {

    @Test
    void testBuildVirtualEdgesAtRealNodesInvokesForEach() {
        BaseGraph baseGraph = new BaseGraph.Builder(1).create();
        List<Snap> snaps = new ArrayList<>();
        
        QueryGraph queryGraph = QueryGraph.create(baseGraph, snaps);
    }
}
