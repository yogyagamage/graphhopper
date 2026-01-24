package com.graphhopper.util;

import com.carrotsearch.hppc.sorting.IndirectComparator;
import com.carrotsearch.hppc.sorting.IndirectSort;
import org.junit.jupiter.api.Test;

public class ArrayUtilcalcSortOrder_IndirectSortmergesortFikaTest {

    @Test
    public void testCalcSortOrderInvokesIndirectSortMergesort() {
        int[] arr1 = new int[]{5, 3, 8};
        int[] arr2 = new int[]{2, 4, 1};
        int length = 3;
        
        ArrayUtil.calcSortOrder(arr1, arr2, length);
    }
}
