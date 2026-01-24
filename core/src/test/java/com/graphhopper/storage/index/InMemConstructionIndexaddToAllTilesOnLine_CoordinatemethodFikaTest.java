package com.graphhopper.storage.index;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import com.graphhopper.geohash.SpatialKeyAlgo;
import com.graphhopper.util.DistancePlaneProjection;
import org.locationtech.jts.geom.Coordinate;

class InMemConstructionIndexaddToAllTilesOnLine_CoordinatemethodFikaTest {

    @Test
    void testAddToAllTilesOnLine() {
        IndexStructureInfo indexStructureInfo = Mockito.mock(IndexStructureInfo.class);
        Mockito.when(indexStructureInfo.getEntries()).thenReturn(new int[]{4});
        Mockito.when(indexStructureInfo.getShifts()).thenReturn(new byte[]{2});
        
        PixelGridTraversal pixelGridTraversal = Mockito.mock(PixelGridTraversal.class);
        Mockito.when(indexStructureInfo.getPixelGridTraversal()).thenReturn(pixelGridTraversal);
        
        SpatialKeyAlgo keyAlgo = Mockito.mock(SpatialKeyAlgo.class);
        Mockito.when(indexStructureInfo.getKeyAlgo()).thenReturn(keyAlgo);
        Mockito.when(keyAlgo.getBits()).thenReturn(32);
        
        InMemConstructionIndex index = new InMemConstructionIndex(indexStructureInfo);
        
        index.addToAllTilesOnLine(1, 0.0, 0.0, 1.0, 1.0);
    }
}
