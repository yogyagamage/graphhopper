package com.graphhopper.util;

import com.carrotsearch.hppc.IntArrayList;
import org.junit.jupiter.api.Test;

public class ArrayUtilgetLast_IntArrayListgetFikaTest {

    @Test
    public void testGetLast() {
        IntArrayList list = new IntArrayList();
        list.add(42);
        
        // This will invoke IntArrayList.get(int) internally
        ArrayUtil.getLast(list);
    }
}
