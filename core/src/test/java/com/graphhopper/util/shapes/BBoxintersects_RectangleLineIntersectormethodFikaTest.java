package com.graphhopper.util.shapes;

import com.graphhopper.util.PointList;
import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Envelope;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BBoxintersects_RectangleLineIntersectormethodFikaTest {

    @Test
    void testIntersects() {
        BBox bbox = new BBox(1.0, 2.0, 3.0, 4.0);
        PointList pointList = mock(PointList.class);
        when(pointList.size()).thenReturn(2);
        when(pointList.getLat(0)).thenReturn(1.5);
        when(pointList.getLon(0)).thenReturn(2.5);
        when(pointList.getLat(1)).thenReturn(3.5);
        when(pointList.getLon(1)).thenReturn(4.5);
        
        bbox.intersects(pointList);
    }
}
