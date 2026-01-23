package com.graphhopper.routing.util.parsers;

import com.carrotsearch.hppc.IntArrayList;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public class InternalRestrictionmethod_IntArrayListsizeFikaTest {

    @Test
    public void test() throws Exception {
        IntArrayList viaNodes = new IntArrayList();
        IntArrayList edgeKeys = new IntArrayList();
        edgeKeys.add(1);
        edgeKeys.add(2);
        
        Constructor<?> constructor = Class.forName("com.graphhopper.routing.util.parsers.RestrictionSetter$InternalRestriction")
                .getDeclaredConstructor(IntArrayList.class, IntArrayList.class);
        constructor.setAccessible(true);
        Object instance = constructor.newInstance(viaNodes, edgeKeys);
    }
}
