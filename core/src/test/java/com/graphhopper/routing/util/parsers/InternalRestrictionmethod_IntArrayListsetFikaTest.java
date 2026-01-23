package com.graphhopper.routing.util.parsers;

import com.carrotsearch.hppc.IntArrayList;
import com.graphhopper.util.ArrayUtil;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public class InternalRestrictionmethod_IntArrayListsetFikaTest {

    @Test
    public void testEntryPointToThirdPartyMethod() throws Exception {
        // Create IntArrayList instances for constructor parameters
        IntArrayList viaNodes = new IntArrayList();
        viaNodes.add(1);
        viaNodes.add(2);
        
        IntArrayList edgeKeys = new IntArrayList();
        edgeKeys.add(10);
        edgeKeys.add(20);
        edgeKeys.add(30);
        
        // Get the constructor using reflection since InternalRestriction is private
        Class<?> internalRestrictionClass = Class.forName(
            "com.graphhopper.routing.util.parsers.RestrictionSetter$InternalRestriction"
        );
        
        Constructor<?> constructor = internalRestrictionClass.getDeclaredConstructor(
            IntArrayList.class, IntArrayList.class
        );
        constructor.setAccessible(true);
        
        // Create instance which will trigger the constructor and the IntArrayList.set() calls
        Object internalRestriction = constructor.newInstance(viaNodes, edgeKeys);
    }
}
