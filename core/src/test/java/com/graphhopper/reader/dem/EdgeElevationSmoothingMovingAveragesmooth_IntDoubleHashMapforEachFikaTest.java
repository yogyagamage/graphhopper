package com.graphhopper.reader.dem;

import com.carrotsearch.hppc.IntDoubleHashMap;
import com.carrotsearch.hppc.cursors.IntDoubleCursor;
import com.graphhopper.util.DistancePlaneProjection;
import com.graphhopper.util.PointList;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

public class EdgeElevationSmoothingMovingAveragesmooth_IntDoubleHashMapforEachFikaTest {

    @Test
    public void testSmooth() {
        EdgeElevationSmoothingMovingAverage instance = new EdgeElevationSmoothingMovingAverage();
        
        PointList geometry = new PointList(5, true);
        geometry.add(49.0, 11.0, 100.0);
        geometry.add(49.001, 11.001, 110.0);
        geometry.add(49.002, 11.002, 120.0);
        geometry.add(49.003, 11.003, 130.0);
        geometry.add(49.004, 11.004, 140.0);
        
        double maxWindowSize = 1000.0;
        
        EdgeElevationSmoothingMovingAverage.smooth(geometry, maxWindowSize);
    }
}
