package com.graphhopper.storage.index;

import com.graphhopper.geohash.SpatialKeyAlgo;
import com.graphhopper.util.DistancePlaneProjection;
import org.locationtech.jts.geom.Coordinate;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class InMemConstructionIndexaddToAllTilesOnLine_CoordinatemethodFikaTest {

    private static final DistancePlaneProjection DIST_PLANE = DistancePlaneProjection.DIST_PLANE;

    @Test
    void testAddToAllTilesOnLine() {
        // Create mocks for constructor dependencies
        IndexStructureInfo indexStructureInfo = Mockito.mock(IndexStructureInfo.class);
        PixelGridTraversal pixelGridTraversal = Mockito.mock(PixelGridTraversal.class);
        SpatialKeyAlgo keyAlgo = Mockito.mock(SpatialKeyAlgo.class);
        
        // Configure mocks to allow method execution
        Mockito.when(indexStructureInfo.getEntries()).thenReturn(new int[]{4});
        Mockito.when(indexStructureInfo.getShifts()).thenReturn(new byte[]{2});
        Mockito.when(indexStructureInfo.getPixelGridTraversal()).thenReturn(pixelGridTraversal);
        Mockito.when(indexStructureInfo.getKeyAlgo()).thenReturn(keyAlgo);
        Mockito.when(keyAlgo.getBits()).thenReturn(32);
        
        // Create instance using constructor
        InMemConstructionIndex index = new InMemConstructionIndex(indexStructureInfo);
        
        // Call entry point method - this should trigger Coordinate constructor calls
        index.addToAllTilesOnLine(1, 49.0, 11.0, 49.1, 11.1);
    }
}
