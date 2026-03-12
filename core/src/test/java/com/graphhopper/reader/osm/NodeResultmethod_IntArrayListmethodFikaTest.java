package com.graphhopper.reader.osm;

import com.carrotsearch.hppc.IntArrayList;
import org.junit.jupiter.api.Test;

public class NodeResultmethod_IntArrayListmethodFikaTest {

    @Test
    public void testNodeResultConstructorCallsIntArrayListConstructor() {
        int numFrom = 5;
        int numTo = 3;
        
        WayToEdgeConverter.NodeResult nodeResult = new WayToEdgeConverter.NodeResult(numFrom, numTo);
    }
}
