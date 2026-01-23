package com.graphhopper.routing.querygraph;

import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.IntObjectHashMap;
import com.carrotsearch.hppc.IntObjectMap;
import com.graphhopper.storage.index.Snap;
import com.graphhopper.util.shapes.GHPoint3D;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class QueryOverlayBuilder_EdgeChangeBuildermethod_IntObjectMapisEmptyFikaTest {

    @Test
    void testBuildPathToIntObjectMapIsEmpty() {
        // Create valid Snap objects to avoid IllegalStateException
        List<Snap> snaps = new ArrayList<>();
        
        // Create a valid Snap with proper initialization
        Snap snap = new Snap(0.0, 0.0);
        snap.setClosestNode(0);
        snap.setSnappedPosition(Snap.Position.TOWER); // This will skip virtual node creation
        
        // Create a mock EdgeIteratorState to satisfy the buildVirtualEdges method
        // We'll use a simple implementation that provides required methods
        snaps.add(snap);
        
        // Create parameters for the build method
        int firstVirtualNodeId = 1000;
        int firstVirtualEdgeId = 2000;
        boolean is3D = false;
        
        // Call the entry point method
        QueryOverlayBuilder.build(firstVirtualNodeId, firstVirtualEdgeId, is3D, snaps);
    }
}
