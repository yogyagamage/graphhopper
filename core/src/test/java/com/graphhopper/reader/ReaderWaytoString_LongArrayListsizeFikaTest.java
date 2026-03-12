package com.graphhopper.reader;

import com.carrotsearch.hppc.LongArrayList;
import com.graphhopper.reader.ReaderElement.Type;
import org.junit.jupiter.api.Test;

public class ReaderWaytoString_LongArrayListsizeFikaTest {

    @Test
    public void test() {
        ReaderWay readerWay = new ReaderWay(123L);
        readerWay.toString();
    }
}
