package com.graphhopper.util.shapes;

import com.graphhopper.util.PointList;
import org.locationtech.jts.algorithm.RectangleLineIntersector;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Envelope;
import org.junit.jupiter.api.Test;

class BBoxintersects_RectangleLineIntersectormethodFikaTest {

    @Test
    void testIntersectsTriggersRectangleLineIntersectorConstructor() {
        BBox bbox = new BBox(0.0, 1.0, 0.0, 1.0);
        PointList pointList = new PointList();
        pointList.add(0.5, 0.5);
        bbox.intersects(pointList);
    }
}
