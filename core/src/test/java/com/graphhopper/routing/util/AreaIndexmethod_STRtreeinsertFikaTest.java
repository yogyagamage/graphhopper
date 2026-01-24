package com.graphhopper.routing.util;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Envelope;
import org.locationtech.jts.geom.prep.PreparedGeometryFactory;
import org.locationtech.jts.index.strtree.STRtree;
import java.util.List;
import java.util.ArrayList;

public class AreaIndexmethod_STRtreeinsertFikaTest {

    @Test
    public void testEntryPointToThirdPartyMethod() {
        List<AreaIndex.Area> areas = new ArrayList<>();
        
        AreaIndex.Area mockArea = Mockito.mock(AreaIndex.Area.class);
        Polygon mockPolygon = Mockito.mock(Polygon.class);
        Envelope mockEnvelope = Mockito.mock(Envelope.class);
        
        List<Polygon> borders = new ArrayList<>();
        borders.add(mockPolygon);
        
        Mockito.when(mockArea.getBorders()).thenReturn(borders);
        Mockito.when(mockPolygon.getEnvelopeInternal()).thenReturn(mockEnvelope);
        
        areas.add(mockArea);
        
        AreaIndex<AreaIndex.Area> areaIndex = new AreaIndex<>(areas);
    }
}
