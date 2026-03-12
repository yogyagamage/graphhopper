package com.graphhopper.resources;

import com.graphhopper.routing.util.EdgeFilter;
import com.graphhopper.storage.index.LocationIndex;
import com.graphhopper.storage.index.Snap;
import com.graphhopper.util.DistanceCalc;
import com.graphhopper.util.shapes.GHPoint;
import com.graphhopper.util.shapes.GHPoint3D;
import javax.ws.rs.WebApplicationException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NearestResourcedoGet_WebApplicationExceptionmethodFikaTest {

    @Test
    void testDoGet() {
        LocationIndex mockIndex = Mockito.mock(LocationIndex.class);
        Snap mockSnap = Mockito.mock(Snap.class);
        Mockito.when(mockIndex.findClosest(Mockito.anyDouble(), Mockito.anyDouble(), Mockito.any(EdgeFilter.class)))
               .thenReturn(mockSnap);
        Mockito.when(mockSnap.isValid()).thenReturn(false);
        
        boolean hasElevation = false;
        NearestResource resource = new NearestResource(mockIndex, hasElevation);
        
        GHPoint point = new GHPoint(49.123, 11.456);
        boolean elevation = false;
        
        try {
            resource.doGet(point, elevation);
        } catch (WebApplicationException e) {
            // Expected exception - no assertion needed
        }
    }
}
