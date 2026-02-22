package com.graphhopper.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilcalcSortOrder_IndirectSortmergesortFikaTest {

    @Test
    public void testCalcSortOrderCallsIndirectSortMergesort() {
        int[] arr1 = {3, 1, 2};
        int[] arr2 = {1, 2, 3};
        int length = 3;
        
        ArrayUtil.calcSortOrder(arr1, arr2, length);
    }
}
