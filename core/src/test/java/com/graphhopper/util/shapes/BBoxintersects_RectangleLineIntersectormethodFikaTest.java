package com.graphhopper.util.shapes;

import com.graphhopper.util.PointList;
import org.junit.jupiter.api.Test;
import org.locationtech.jts.algorithm.RectangleLineIntersector;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Envelope;

public class BBoxintersects_RectangleLineIntersectormethodFikaTest {

    @Test
    public void testIntersectsTriggersRectangleLineIntersectorConstructor() {
        BBox bbox = new BBox(0.0, 1.0, 0.0, 1.0);
        PointList pointList = new PointList();
        pointList.add(0.5, 0.5);
        pointList.add(0.6, 0.6);
        
        bbox.intersects(pointList);
    }
}
