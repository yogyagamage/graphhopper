package com.graphhopper.util;

import com.carrotsearch.hppc.IntArrayList;
import org.junit.jupiter.api.Test;

class ArrayUtilgetLast_IntArrayListgetFikaTest {

    @Test
    void test() {
        ArrayUtil instance = new ArrayUtil();
        IntArrayList list = new IntArrayList();
        list.add(1);
        instance.getLast(list);
    }
}
