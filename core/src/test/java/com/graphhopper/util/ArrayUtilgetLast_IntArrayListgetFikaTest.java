package com.graphhopper.util;

import com.carrotsearch.hppc.IntArrayList;
import org.junit.jupiter.api.Test;

public class ArrayUtilgetLast_IntArrayListgetFikaTest {

    @Test
    public void testGetLastCallsIntArrayListGet() {
        IntArrayList list = new IntArrayList();
        list.add(42);
        ArrayUtil.getLast(list);
    }
}
