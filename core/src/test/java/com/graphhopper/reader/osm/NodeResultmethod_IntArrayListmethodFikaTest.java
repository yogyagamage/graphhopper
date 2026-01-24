package com.graphhopper.reader.osm;

import com.carrotsearch.hppc.IntArrayList;
import org.junit.jupiter.api.Test;

public class NodeResultmethod_IntArrayListmethodFikaTest {

    @Test
    public void testEntryPoint() {
        int numFrom = 1;
        int numTo = 1;
        WayToEdgeConverter.NodeResult nodeResult = new WayToEdgeConverter.NodeResult(numFrom, numTo);
    }
}
