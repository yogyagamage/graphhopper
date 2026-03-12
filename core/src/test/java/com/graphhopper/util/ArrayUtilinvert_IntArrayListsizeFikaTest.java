package com.graphhopper.util;

import com.carrotsearch.hppc.IntArrayList;
import org.junit.jupiter.api.Test;

public class ArrayUtilinvert_IntArrayListsizeFikaTest {

    @Test
    public void testInvertCallsSize() {
        ArrayUtil arrayUtil = new ArrayUtil();
        IntArrayList list = new IntArrayList();
        list.add(0);
        arrayUtil.invert(list);
    }
}
