package com.graphhopper.reader.osm;

import com.carrotsearch.hppc.LongArrayList;
import org.junit.jupiter.api.Test;

class RestrictionMembersgetAllWays_LongArrayListmethodFikaTest {

    @Test
    void testGetAllWays() {
        LongArrayList fromWays = new LongArrayList(0);
        LongArrayList viaWays = new LongArrayList(0);
        LongArrayList toWays = new LongArrayList(0);
        
        RestrictionMembers instance = RestrictionMembers.viaWay(fromWays, viaWays, toWays);
        instance.getAllWays();
    }
}
