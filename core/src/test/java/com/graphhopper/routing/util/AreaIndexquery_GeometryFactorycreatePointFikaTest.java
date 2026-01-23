package com.graphhopper.routing.util;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.Polygon;
import org.locationtech.jts.geom.prep.PreparedGeometry;
import org.locationtech.jts.geom.prep.PreparedGeometryFactory;
import org.locationtech.jts.index.strtree.STRtree;
import java.util.ArrayList;
import java.util.List;

public class AreaIndexquery_GeometryFactorycreatePointFikaTest {

    @Test
    public void testQueryTriggersGeometryFactoryCreatePoint() {
        List<AreaIndex.Area> mockAreas = new ArrayList<>();
        AreaIndex<AreaIndex.Area> areaIndex = new AreaIndex<>(mockAreas);
        
        areaIndex.query(52.0, 13.0);
    }

    private static class MockArea implements AreaIndex.Area {
        @Override
        public List<Polygon> getBorders() {
            List<Polygon> borders = new ArrayList<>();
            GeometryFactory gf = new GeometryFactory();
            Coordinate[] coordinates = new Coordinate[] {
                new Coordinate(12.9, 51.9),
                new Coordinate(13.1, 51.9),
                new Coordinate(13.1, 52.1),
                new Coordinate(12.9, 52.1),
                new Coordinate(12.9, 51.9)
            };
            Polygon polygon = gf.createPolygon(coordinates);
            borders.add(polygon);
            return borders;
        }
    }
}
