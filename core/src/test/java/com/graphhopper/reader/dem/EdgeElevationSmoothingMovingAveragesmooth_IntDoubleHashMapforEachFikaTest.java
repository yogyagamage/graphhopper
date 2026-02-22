package com.graphhopper.reader.dem;

import com.graphhopper.util.PointList;
import org.junit.jupiter.api.Test;

public class EdgeElevationSmoothingMovingAveragesmooth_IntDoubleHashMapforEachFikaTest {

    @Test
    public void testSmooth() {
        PointList pointList = new PointList(5, true);
        pointList.add(49.0, 11.0, 100.0);
        pointList.add(49.001, 11.001, 105.0);
        pointList.add(49.002, 11.002, 110.0);
        pointList.add(49.003, 11.003, 115.0);
        pointList.add(49.004, 11.004, 120.0);
        
        EdgeElevationSmoothingMovingAverage.smooth(pointList, 1000.0);
    }
}
