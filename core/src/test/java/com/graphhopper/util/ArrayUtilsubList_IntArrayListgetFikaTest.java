package com.graphhopper.util;

import com.carrotsearch.hppc.IntArrayList;
import org.junit.jupiter.api.Test;

class ArrayUtilsubList_IntArrayListgetFikaTest {

    @Test
    void testSubListCallsGet() {
        ArrayUtil arrayUtil = new ArrayUtil();
        
        IntArrayList list = new IntArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        
        arrayUtil.subList(list, 0, 2);
    }
}
