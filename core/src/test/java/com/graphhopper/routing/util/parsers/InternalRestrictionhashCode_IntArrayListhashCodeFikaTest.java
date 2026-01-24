package com.graphhopper.routing.util.parsers;

import com.carrotsearch.hppc.IntArrayList;
import com.graphhopper.util.ArrayUtil;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public class InternalRestrictionhashCode_IntArrayListhashCodeFikaTest {

    @Test
    public void test() throws Exception {
        IntArrayList viaNodes = new IntArrayList();
        viaNodes.add(1);
        IntArrayList edgeKeys = new IntArrayList();
        edgeKeys.add(2);
        
        Constructor<?> constructor = Class.forName("com.graphhopper.routing.util.parsers.RestrictionSetter$InternalRestriction")
                .getDeclaredConstructor(IntArrayList.class, IntArrayList.class);
        constructor.setAccessible(true);
        Object internalRestriction = constructor.newInstance(viaNodes, edgeKeys);
        
        internalRestriction.hashCode();
    }
}
