package com.graphhopper.routing.util.parsers;

import com.carrotsearch.hppc.IntArrayList;
import com.graphhopper.util.ArrayUtil;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public class InternalRestrictionequals_IntArrayListequalsFikaTest {

    @Test
    public void test() throws Exception {
        // Create IntArrayList instances for constructor parameters
        IntArrayList viaNodes = new IntArrayList();
        viaNodes.add(1);
        viaNodes.add(2);
        
        IntArrayList edgeKeys = new IntArrayList();
        edgeKeys.add(100);
        edgeKeys.add(200);
        
        // Use reflection to access the private constructor
        Class<?> internalRestrictionClass = Class.forName("com.graphhopper.routing.util.parsers.RestrictionSetter$InternalRestriction");
        Constructor<?> constructor = internalRestrictionClass.getDeclaredConstructor(IntArrayList.class, IntArrayList.class);
        constructor.setAccessible(true);
        
        // Create two instances to compare
        Object instance1 = constructor.newInstance(viaNodes, edgeKeys);
        Object instance2 = constructor.newInstance(viaNodes, edgeKeys);
        
        // Invoke equals method which should trigger IntArrayList.equals
        instance1.equals(instance2);
    }
}
