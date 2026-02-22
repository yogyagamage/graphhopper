package com.graphhopper.reader.osm;

import org.junit.jupiter.api.Test;

public class EdgeResultmethod_IntArrayListmethodFikaTest {

    @Test
    public void testEdgeResultConstructorCallsIntArrayListConstructor() {
        int numFrom = 2;
        int numVia = 3;
        int numTo = 2;
        
        WayToEdgeConverter.EdgeResult edgeResult = 
            new WayToEdgeConverter.EdgeResult(numFrom, numVia, numTo);
    }
}
