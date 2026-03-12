package com.graphhopper.routing.querygraph;

import com.graphhopper.storage.BaseGraph;
import com.graphhopper.storage.index.Snap;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class QueryGraphbuildVirtualEdgesAtRealNodes_IntObjectMapforEachFikaTest {

    @Test
    public void testCreateTriggersForEach() {
        BaseGraph baseGraph = new BaseGraph.Builder(1).create();
        baseGraph.getNodeAccess().setNode(0, 0.0, 0.0);
        
        List<Snap> snaps = new ArrayList<>();
        Snap snap = new Snap(0.0, 0.0);
        snap.setClosestNode(0);
        snap.setSnappedPosition(Snap.Position.TOWER);
        snaps.add(snap);
        
        QueryGraph queryGraph = QueryGraph.create(baseGraph, snaps);
    }
}
