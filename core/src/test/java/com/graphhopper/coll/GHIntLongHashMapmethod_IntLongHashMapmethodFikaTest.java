package com.graphhopper.coll;

import com.carrotsearch.hppc.HashOrderMixingStrategy;
import com.carrotsearch.hppc.IntLongHashMap;
import org.junit.jupiter.api.Test;

public class GHIntLongHashMapmethod_IntLongHashMapmethodFikaTest {

    @Test
    public void testEntryPointToThirdPartyMethod() {
        int capacity = 16;
        double loadFactor = 0.75;
        
        GHIntLongHashMap map = new GHIntLongHashMap(capacity, loadFactor);
    }
}
