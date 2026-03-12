package com.graphhopper.coll;

import com.carrotsearch.hppc.ObjectIntAssociativeContainer;
import com.carrotsearch.hppc.ObjectIntHashMap;
import org.junit.jupiter.api.Test;

public class GHObjectIntHashMapmethod_ObjectIntAssociativeContainersizeFikaTest {

    @Test
    public void testEntryPoint() {
        ObjectIntAssociativeContainer container = new ObjectIntHashMap();
        GHObjectIntHashMap instance = new GHObjectIntHashMap(container);
    }
}
