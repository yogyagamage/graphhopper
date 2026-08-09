package com.graphhopper.util.shapes;

import com.graphhopper.util.PointList;
import org.locationtech.jts.algorithm.RectangleLineIntersector;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Envelope;
import org.junit.jupiter.api.Test;

public class BBoxintersects_RectangleLineIntersectormethodFikaTest {

    @Test
    public void testIntersectsTriggersRectangleLineIntersectorConstructor() {
        BBox bbox = new BBox(0.0, 10.0, 0.0, 20.0);
        PointList pointList = new PointList(2, false);
        pointList.add(5.0, 15.0);
        pointList.add(8.0, 18.0);
        
        bbox.intersects(pointList);
    }
}
