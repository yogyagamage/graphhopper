package com.graphhopper.util;

import com.carrotsearch.hppc.IntArrayList;
import org.junit.jupiter.api.Test;

class ArrayUtilinvert_IntArrayListsetFikaTest {

    @Test
    void test() {
        ArrayUtil arrayUtil = new ArrayUtil();
        IntArrayList list = new IntArrayList();
        list.add(2);
        list.add(0);
        list.add(1);
        arrayUtil.invert(list);
    }
}
