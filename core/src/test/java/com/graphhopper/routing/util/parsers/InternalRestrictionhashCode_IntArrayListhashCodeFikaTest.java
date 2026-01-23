package com.graphhopper.routing.util.parsers;

import com.carrotsearch.hppc.IntArrayList;
import com.graphhopper.util.ArrayUtil;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

class InternalRestrictionhashCode_IntArrayListhashCodeFikaTest {

    @Test
    void test() throws Exception {
        IntArrayList viaNodes = new IntArrayList();
        viaNodes.add(1);
        viaNodes.add(2);
        
        IntArrayList edgeKeys = new IntArrayList();
        edgeKeys.add(3);
        edgeKeys.add(4);
        
        Constructor<?> constructor = Class.forName("com.graphhopper.routing.util.parsers.RestrictionSetter$InternalRestriction")
                .getDeclaredConstructor(IntArrayList.class, IntArrayList.class);
        constructor.setAccessible(true);
        
        Object internalRestriction = constructor.newInstance(viaNodes, edgeKeys);
        
        Class<?> internalRestrictionClass = Class.forName("com.graphhopper.routing.util.parsers.RestrictionSetter$InternalRestriction");
        java.lang.reflect.Method hashCodeMethod = internalRestrictionClass.getDeclaredMethod("hashCode");
        hashCodeMethod.setAccessible(true);
        
        hashCodeMethod.invoke(internalRestriction);
    }
}
