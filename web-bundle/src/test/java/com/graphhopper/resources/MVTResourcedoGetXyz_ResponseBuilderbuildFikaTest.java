package com.graphhopper.resources;

import com.graphhopper.GraphHopper;
import com.graphhopper.routing.ev.*;
import com.graphhopper.routing.util.EncodingManager;
import com.graphhopper.storage.BaseGraph;
import com.graphhopper.storage.NodeAccess;
import com.graphhopper.storage.index.LocationIndexTree;
import com.graphhopper.util.EdgeIteratorState;
import com.graphhopper.util.FetchMode;
import com.graphhopper.util.PointList;
import com.graphhopper.util.StopWatch;
import com.graphhopper.util.shapes.BBox;
import no.ecc.vectortile.VectorTileEncoder;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.LineString;
import org.locationtech.jts.geom.util.AffineTransformation;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static org.mockito.Mockito.*;

public class MVTResourcedoGetXyz_ResponseBuilderbuildFikaTest {

    @Test
    public void testDoGetXyz() throws Exception {
        // Create mocks for constructor dependencies
        GraphHopper graphHopper = mock(GraphHopper.class);
        EncodingManager encodingManager = mock(EncodingManager.class);
        
        // Create mock for BaseGraph
        BaseGraph baseGraph = mock(BaseGraph.class);
        when(graphHopper.getBaseGraph()).thenReturn(baseGraph);
        
        // Create mock for NodeAccess
        NodeAccess nodeAccess = mock(NodeAccess.class);
        when(baseGraph.getNodeAccess()).thenReturn(nodeAccess);
        
        // Create mock for LocationIndexTree
        LocationIndexTree locationIndex = mock(LocationIndexTree.class);
        when(graphHopper.getLocationIndex()).thenReturn(locationIndex);
        
        // Mock the query method to do nothing (empty visitor)
        doNothing().when(locationIndex).query(any(BBox.class), any());
        
        // Mock encoding manager to return a RoadClass encoded value
        EnumEncodedValue<RoadClass> roadClassEnc = mock(EnumEncodedValue.class);
        when(encodingManager.getEnumEncodedValue(eq(RoadClass.KEY), eq(RoadClass.class)))
            .thenReturn(roadClassEnc);
        
        // Mock hasEncodedValue to return true
        when(encodingManager.hasEncodedValue(eq(RoadClass.KEY))).thenReturn(true);
        
        // Mock getEncodedValues to return empty list
        when(encodingManager.getEncodedValues()).thenReturn(java.util.Collections.emptyList());
        
        // Create instance of class under test
        MVTResource resource = new MVTResource(graphHopper, encodingManager);
        
        // Create mocks for method parameters
        HttpServletRequest httpReq = mock(HttpServletRequest.class);
        UriInfo uriInfo = mock(UriInfo.class);
        
        // Call the entry point method with z <= 9 to trigger the path with ResponseBuilder.build()
        // This will go through the first branch and call ResponseBuilder.build()
        resource.doGetXyz(httpReq, uriInfo, 5, 10, 20, false);
    }
}
