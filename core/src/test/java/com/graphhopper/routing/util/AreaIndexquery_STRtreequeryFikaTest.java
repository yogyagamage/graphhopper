package com.graphhopper.routing.util;

import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Envelope;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.Polygon;
import org.locationtech.jts.geom.prep.PreparedGeometry;
import org.locationtech.jts.geom.prep.PreparedGeometryFactory;
import org.locationtech.jts.index.strtree.AbstractSTRtree;
import org.locationtech.jts.index.strtree.STRtree;
import java.util.ArrayList;
import java.util.List;

public class AreaIndexquery_STRtreequeryFikaTest {

    @Test
    public void testQueryPath() {
        List<Area> mockAreas = new ArrayList<>();
        AreaIndex<Area> areaIndex = new AreaIndex<>(mockAreas);
        areaIndex.query(52.0, 5.0);
    }

    private static class Area implements AreaIndex.Area {
        @Override
        public List<Polygon> getBorders() {
            List<Polygon> borders = new ArrayList<>();
            GeometryFactory gf = new GeometryFactory();
            Coordinate[] coordinates = new Coordinate[] {
                new Coordinate(4.9, 51.9),
                new Coordinate(5.1, 51.9),
                new Coordinate(5.1, 52.1),
                new Coordinate(4.9, 52.1),
                new Coordinate(4.9, 51.9)
            };
            Polygon polygon = gf.createPolygon(coordinates);
            borders.add(polygon);
            return borders;
        }
    }
}
