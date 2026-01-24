package com.graphhopper.reader.osm;

import com.carrotsearch.hppc.IntArrayList;
import org.junit.jupiter.api.Test;

public class EdgeResultmethod_IntArrayListmethodFikaTest {

    @Test
    public void testEdgeResultConstructorCallsIntArrayListConstructor() {
        int numFrom = 1;
        int numVia = 2;
        int numTo = 3;
        
        WayToEdgeConverter.EdgeResult edgeResult = 
            new WayToEdgeConverter.EdgeResult(numFrom, numVia, numTo);
    }
}
