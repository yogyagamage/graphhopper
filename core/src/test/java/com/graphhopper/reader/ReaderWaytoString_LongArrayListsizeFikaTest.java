package com.graphhopper.reader;

import com.carrotsearch.hppc.LongArrayList;
import org.junit.jupiter.api.Test;

class ReaderWaytoString_LongArrayListsizeFikaTest {

    @Test
    void test() {
        ReaderWay readerWay = new ReaderWay(123L);
        readerWay.toString();
    }
}
