package com.graphhopper.util;

import com.carrotsearch.hppc.IntArrayList;
import org.junit.jupiter.api.Test;

class ArrayUtilsubList_IntArrayListmethodFikaTest {

    @Test
    void testSubListCallsIntArrayListConstructor() {
        ArrayUtil arrayUtil = new ArrayUtil();
        IntArrayList list = new IntArrayList(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        arrayUtil.subList(list, 1, 4);
    }
}
