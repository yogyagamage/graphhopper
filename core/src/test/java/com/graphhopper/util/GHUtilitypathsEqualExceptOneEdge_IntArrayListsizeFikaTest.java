package com.graphhopper.util;

import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.IntIndexedContainer;
import com.graphhopper.routing.Path;
import com.graphhopper.storage.Graph;
import com.graphhopper.storage.NodeAccess;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Random;

public class GHUtilitypathsEqualExceptOneEdge_IntArrayListsizeFikaTest {

    @Test
    public void testComparePathsInvokesIntArrayListSize() {
        // Create mock Path objects
        Path mockRefPath = Mockito.mock(Path.class);
        Path mockPath = Mockito.mock(Path.class);
        
        // Create mock Graph
        Graph mockGraph = Mockito.mock(Graph.class);
        NodeAccess mockNodeAccess = Mockito.mock(NodeAccess.class);
        
        // Setup mock behavior for getGraph()
        Mockito.when(mockRefPath.getGraph()).thenReturn(mockGraph);
        Mockito.when(mockPath.getGraph()).thenReturn(mockGraph);
        Mockito.when(mockGraph.getNodeAccess()).thenReturn(mockNodeAccess);
        
        // Setup mock behavior for getWeight()
        Mockito.when(mockRefPath.getWeight()).thenReturn(100.0);
        Mockito.when(mockPath.getWeight()).thenReturn(100.0);
        
        // Setup mock behavior for getDistance()
        Mockito.when(mockRefPath.getDistance()).thenReturn(1000.0);
        Mockito.when(mockPath.getDistance()).thenReturn(1000.0);
        
        // Setup mock behavior for getTime()
        Mockito.when(mockRefPath.getTime()).thenReturn(60000L);
        Mockito.when(mockPath.getTime()).thenReturn(60000L);
        
        // Create IntArrayList instances that will be returned by calcNodes()
        IntArrayList refNodes = new IntArrayList();
        refNodes.add(1);
        refNodes.add(2);
        refNodes.add(3);
        
        IntArrayList pathNodes = new IntArrayList();
        pathNodes.add(1);
        pathNodes.add(4);
        pathNodes.add(3);
        
        // Setup mock behavior for calcNodes()
        Mockito.when(mockRefPath.calcNodes()).thenReturn(refNodes);
        Mockito.when(mockPath.calcNodes()).thenReturn(pathNodes);
        
        // Call the entry point method
        GHUtility.comparePaths(mockRefPath, mockPath, 1, 3, 12345L);
        
        // The test will execute the full chain:
        // 1. GHUtility.comparePaths(...)
        // 2. GHUtility.pathsEqualExceptOneEdge(...)
        // 3. IntArrayList.size() - which is the target third-party method
    }
}
