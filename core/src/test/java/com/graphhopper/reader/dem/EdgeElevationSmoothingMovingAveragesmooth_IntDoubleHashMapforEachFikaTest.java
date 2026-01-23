package com.graphhopper.reader.dem;

import com.carrotsearch.hppc.IntDoubleHashMap;
import com.carrotsearch.hppc.cursors.IntDoubleCursor;
import com.graphhopper.util.DistancePlaneProjection;
import com.graphhopper.util.PointList;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

class EdgeElevationSmoothingMovingAveragesmooth_IntDoubleHashMapforEachFikaTest {

    @Test
    void testSmooth() {
        EdgeElevationSmoothingMovingAverage instance = new EdgeElevationSmoothingMovingAverage();
        
        PointList geometry = new PointList(5, true);
        geometry.add(49.0, 11.0, 100.0);
        geometry.add(49.001, 11.001, 105.0);
        geometry.add(49.002, 11.002, 110.0);
        geometry.add(49.003, 11.003, 115.0);
        geometry.add(49.004, 11.004, 120.0);
        
        instance.smooth(geometry, 1000.0);
    }
}
