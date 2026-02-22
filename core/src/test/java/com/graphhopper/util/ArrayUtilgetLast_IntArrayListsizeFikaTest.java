package com.graphhopper.util;

import com.carrotsearch.hppc.IntArrayList;
import org.junit.jupiter.api.Test;

public class ArrayUtilgetLast_IntArrayListsizeFikaTest {

    @Test
    public void testGetLastCallsSize() {
        IntArrayList list = new IntArrayList();
        list.add(42);
        ArrayUtil.getLast(list);
    }
}
