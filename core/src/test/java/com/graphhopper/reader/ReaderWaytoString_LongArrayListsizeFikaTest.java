package com.graphhopper.reader;

import com.graphhopper.reader.ReaderWay;
import com.carrotsearch.hppc.LongArrayList;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ReaderWaytoString_LongArrayListsizeFikaTest {

    @Test
    public void testToStringInvokesLongArrayListSize() {
        // Create a real ReaderWay instance
        ReaderWay readerWay = new ReaderWay(123L);
        
        // Create a real LongArrayList and set it as nodes
        LongArrayList nodes = new LongArrayList();
        nodes.add(1L);
        nodes.add(2L);
        nodes.add(3L);
        
        // Use reflection to set the private nodes field
        try {
            java.lang.reflect.Field nodesField = ReaderWay.class.getDeclaredField("nodes");
            nodesField.setAccessible(true);
            nodesField.set(readerWay, nodes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        // Invoke the entry point method which should call LongArrayList.size()
        readerWay.toString();
    }
}
