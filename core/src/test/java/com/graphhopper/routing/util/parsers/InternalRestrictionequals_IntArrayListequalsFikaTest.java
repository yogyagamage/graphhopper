package com.graphhopper.routing.util.parsers;

import com.carrotsearch.hppc.IntArrayList;
import com.graphhopper.util.ArrayUtil;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;

public class InternalRestrictionequals_IntArrayListequalsFikaTest {

    @Test
    public void testEquals() {
        // Create real IntArrayList objects for viaNodes and edgeKeys
        IntArrayList viaNodes1 = new IntArrayList();
        viaNodes1.add(1);
        viaNodes1.add(2);
        
        IntArrayList edgeKeys1 = new IntArrayList();
        edgeKeys1.add(100);
        edgeKeys1.add(200);
        
        IntArrayList viaNodes2 = new IntArrayList();
        viaNodes2.add(1);
        viaNodes2.add(2);
        
        IntArrayList edgeKeys2 = new IntArrayList();
        edgeKeys2.add(100);
        edgeKeys2.add(200);
        
        // Create InternalRestriction instances using the constructor
        // Since InternalRestriction is a private inner class, we need to use reflection
        // or access it through its enclosing class. Let's try to create it via the enclosing class.
        // First, create a mock of the enclosing class to access the private constructor
        RestrictionSetter restrictionSetter = mock(RestrictionSetter.class);
        
        // Use reflection to create InternalRestriction instances
        try {
            // Get the InternalRestriction class
            Class<?> internalRestrictionClass = Class.forName("com.graphhopper.routing.util.parsers.RestrictionSetter$InternalRestriction");
            
            // Get the constructor
            java.lang.reflect.Constructor<?> constructor = internalRestrictionClass.getDeclaredConstructor(
                IntArrayList.class, IntArrayList.class);
            
            // Make it accessible
            constructor.setAccessible(true);
            
            // Create two instances with equal viaNodes and edgeKeys
            Object restriction1 = constructor.newInstance(viaNodes1, edgeKeys1);
            Object restriction2 = constructor.newInstance(viaNodes2, edgeKeys2);
            
            // Call equals method - this should trigger IntArrayList.equals()
            internalRestrictionClass.getMethod("equals", Object.class)
                .invoke(restriction1, restriction2);
                
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
