package com.graphhopper.util;

import com.carrotsearch.hppc.IntArrayList;
import com.carrotsearch.hppc.sorting.IndirectComparator;
import com.carrotsearch.hppc.sorting.IndirectSort;
import org.junit.jupiter.api.Test;

public class ArrayUtilcalcSortOrder_IndirectSortmergesortFikaTest {

    @Test
    public void testCalcSortOrderCallsIndirectSortMergesort() {
        IntArrayList arr1 = new IntArrayList();
        IntArrayList arr2 = new IntArrayList();
        
        arr1.add(1);
        arr2.add(2);
        
        ArrayUtil.calcSortOrder(arr1, arr2);
    }
}
