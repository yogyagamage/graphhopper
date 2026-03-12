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
    public void testQuery() {
        List<Area> areas = new ArrayList<>();
        AreaIndex<Area> areaIndex = new AreaIndex<>(areas);
        areaIndex.query(1.0, 2.0);
    }

    private static class Area implements AreaIndex.Area {
        @Override
        public List<Polygon> getBorders() {
            List<Polygon> borders = new ArrayList<>();
            GeometryFactory gf = new GeometryFactory();
            Coordinate[] coordinates = new Coordinate[] {
                new Coordinate(0, 0),
                new Coordinate(10, 0),
                new Coordinate(10, 10),
                new Coordinate(0, 10),
                new Coordinate(0, 0)
            };
            Polygon polygon = gf.createPolygon(coordinates);
            borders.add(polygon);
            return borders;
        }
    }
}
