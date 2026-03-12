package com.graphhopper.storage.index;

import com.carrotsearch.hppc.IntArrayList;
import org.junit.jupiter.api.Test;

public class InMemLeafEntrytoString_IntArrayListtoStringFikaTest {

    @Test
    public void test() {
        IntArrayList list = new IntArrayList(5);
        list.add(1);
        list.add(2);
        list.add(3);
        
        InMemConstructionIndex.InMemLeafEntry entry = 
            new InMemConstructionIndex.InMemLeafEntry(list.size());
        
        entry.toString();
    }
}
