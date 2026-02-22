package com.graphhopper.coll;

import com.carrotsearch.hppc.ObjectIntAssociativeContainer;
import com.carrotsearch.hppc.ObjectIntHashMap;
import org.junit.jupiter.api.Test;

public class GHObjectIntHashMapmethod_ObjectIntAssociativeContainersizeFikaTest {

    @Test
    public void testEntryPointToThirdPartyMethod() {
        ObjectIntAssociativeContainer<?> container = new ObjectIntHashMap<>(10);
        new GHObjectIntHashMap(container);
    }
}
