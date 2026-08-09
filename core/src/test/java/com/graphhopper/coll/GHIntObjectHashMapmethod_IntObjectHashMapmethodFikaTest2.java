package com.graphhopper.coll;

import com.carrotsearch.hppc.HashOrderMixingStrategy;
import com.carrotsearch.hppc.IntObjectHashMap;
import org.junit.jupiter.api.Test;

class GHIntObjectHashMapmethod_IntObjectHashMapmethodFikaTest2 {

    @Test
    void test() {
        int capacity = 10;
        double loadFactor = 0.75;
        HashOrderMixingStrategy hashOrderMixer = com.carrotsearch.hppc.HashOrderMixing.constant(123321123321123312L);
        
        GHIntObjectHashMap instance = new GHIntObjectHashMap(capacity, loadFactor, hashOrderMixer);
    }
}
