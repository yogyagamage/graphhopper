package com.graphhopper.util.shapes;

import com.graphhopper.util.PointList;
import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Envelope;

import static org.mockito.Mockito.mock;

public class BBoxintersects_RectangleLineIntersectormethodFikaTest {

    @Test
    public void testIntersectsTriggersRectangleLineIntersectorConstructor() {
        BBox bbox = new BBox(1.0, 2.0, 3.0, 4.0);
        PointList pointList = new PointList();
        pointList.add(1.5, 3.5);
        pointList.add(2.5, 3.5);
        
        bbox.intersects(pointList);
    }
}
