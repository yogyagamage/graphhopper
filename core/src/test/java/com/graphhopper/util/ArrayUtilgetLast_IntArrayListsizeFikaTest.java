package com.graphhopper.util;

import com.carrotsearch.hppc.IntArrayList;
import org.junit.jupiter.api.Test;

public class ArrayUtilgetLast_IntArrayListsizeFikaTest {
    
    @Test
    public void testGetLast() {
        IntArrayList list = new IntArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        
        // This will invoke IntArrayList.size() during execution
        ArrayUtil.getLast(list);
    }
}
