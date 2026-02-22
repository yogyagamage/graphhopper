package com.graphhopper.util;

import com.carrotsearch.hppc.IntArrayList;
import org.junit.jupiter.api.Test;

public class ArrayUtilsubList_IntArrayListaddFikaTest {

    @Test
    public void testSubListCallsAdd() {
        IntArrayList list = new IntArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        
        ArrayUtil.subList(list, 0, 2);
    }
}
