package com.graphhopper.util;

import com.carrotsearch.hppc.IntArrayList;
import org.junit.jupiter.api.Test;

class ArrayUtilgetLast_IntArrayListsizeFikaTest {

    @Test
    void test() {
        ArrayUtil arrayUtil = new ArrayUtil();
        IntArrayList list = new IntArrayList();
        list.add(1);
        arrayUtil.getLast(list);
    }
}
