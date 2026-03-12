package com.graphhopper.coll;

import com.carrotsearch.hppc.HashOrderMixingStrategy;
import com.carrotsearch.hppc.IntObjectHashMap;
import org.junit.jupiter.api.Test;

public class GHIntObjectHashMapmethod_IntObjectHashMapmethodFikaTest2 {

    @Test
    public void testEntryPoint() {
        int capacity = 10;
        double loadFactor = 0.75;
        HashOrderMixingStrategy hashOrderMixer = GHIntObjectHashMap.DETERMINISTIC;
        
        GHIntObjectHashMap instance = new GHIntObjectHashMap(capacity, loadFactor, hashOrderMixer);
    }
}
