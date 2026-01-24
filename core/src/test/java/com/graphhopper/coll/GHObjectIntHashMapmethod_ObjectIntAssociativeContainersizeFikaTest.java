package com.graphhopper.coll;

import com.carrotsearch.hppc.ObjectIntAssociativeContainer;
import com.carrotsearch.hppc.ObjectIntHashMap;
import org.junit.jupiter.api.Test;

class GHObjectIntHashMapmethod_ObjectIntAssociativeContainersizeFikaTest {

    @Test
    void test() {
        ObjectIntAssociativeContainer container = new ObjectIntHashMap();
        GHObjectIntHashMap map = new GHObjectIntHashMap(container);
    }
}
