package com.graphhopper.util;

import com.carrotsearch.hppc.IntArrayList;
import org.junit.jupiter.api.Test;

class ArrayUtilinvert_IntArrayListmethodFikaTest {

    @Test
    void testInvert() {
        ArrayUtil arrayUtil = new ArrayUtil();
        IntArrayList inputList = new IntArrayList(5);
        inputList.add(0);
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        inputList.add(4);
        arrayUtil.invert(inputList);
    }
}
