package com.graphhopper.storage.index;

import com.graphhopper.geohash.SpatialKeyAlgo;
import com.graphhopper.util.DistancePlaneProjection;
import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class InMemConstructionIndexaddToAllTilesOnLine_CoordinatemethodFikaTest {

    @Test
    void testAddToAllTilesOnLine() {
        IndexStructureInfo indexStructureInfo = mock(IndexStructureInfo.class);
        PixelGridTraversal pixelGridTraversal = mock(PixelGridTraversal.class);
        SpatialKeyAlgo keyAlgo = mock(SpatialKeyAlgo.class);
        
        when(indexStructureInfo.getEntries()).thenReturn(new int[]{4});
        when(indexStructureInfo.getShifts()).thenReturn(new byte[]{2});
        when(indexStructureInfo.getPixelGridTraversal()).thenReturn(pixelGridTraversal);
        when(indexStructureInfo.getKeyAlgo()).thenReturn(keyAlgo);
        when(keyAlgo.getBits()).thenReturn(32);
        
        InMemConstructionIndex index = new InMemConstructionIndex(indexStructureInfo);
        
        index.addToAllTilesOnLine(1, 0.0, 0.0, 1.0, 1.0);
    }
}
