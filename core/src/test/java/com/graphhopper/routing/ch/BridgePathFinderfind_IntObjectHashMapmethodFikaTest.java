package com.graphhopper.routing.ch;

import com.carrotsearch.hppc.HashOrderMixing;
import com.carrotsearch.hppc.HashOrderMixingStrategy;
import com.carrotsearch.hppc.IntObjectHashMap;
import com.carrotsearch.hppc.IntObjectMap;
import com.carrotsearch.hppc.IntObjectScatterMap;
import com.graphhopper.routing.ch.BridgePathFinder.BridePathEntry;
import com.graphhopper.util.EdgeIterator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BridgePathFinderfind_IntObjectHashMapmethodFikaTest {

    @Test
    void testFindMethodTriggersIntObjectHashMapConstructor() {
        CHPreparationGraph mockGraph = Mockito.mock(CHPreparationGraph.class);
        PrepareGraphEdgeExplorer mockOutExplorer = Mockito.mock(PrepareGraphEdgeExplorer.class);
        PrepareGraphOrigEdgeExplorer mockOrigOutExplorer = Mockito.mock(PrepareGraphOrigEdgeExplorer.class);
        PrepareGraphEdgeIterator mockEdgeIterator = Mockito.mock(PrepareGraphEdgeIterator.class);
        PrepareGraphOrigEdgeIterator mockOrigEdgeIterator = Mockito.mock(PrepareGraphOrigEdgeIterator.class);

        Mockito.when(mockGraph.createOutEdgeExplorer()).thenReturn(mockOutExplorer);
        Mockito.when(mockGraph.createOutOrigEdgeExplorer()).thenReturn(mockOrigOutExplorer);
        Mockito.when(mockOutExplorer.setBaseNode(Mockito.anyInt())).thenReturn(mockEdgeIterator);
        Mockito.when(mockEdgeIterator.next()).thenReturn(false);
        Mockito.when(mockGraph.getTurnWeight(Mockito.anyInt(), Mockito.anyInt(), Mockito.anyInt())).thenReturn(0.0);

        BridgePathFinder finder = new BridgePathFinder(mockGraph);
        finder.find(1, 2, 3);
    }
}
