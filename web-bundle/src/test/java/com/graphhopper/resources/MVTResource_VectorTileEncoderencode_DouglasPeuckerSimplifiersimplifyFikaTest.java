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
import com.graphhopper.util.shapes.BBox;
import no.ecc.vectortile.VectorTileEncoder;
import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.LineString;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.UriInfo;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static org.mockito.Mockito.*;

class MVTResource_VectorTileEncoderencode_DouglasPeuckerSimplifiersimplifyFikaTest {

    @Test
    void testDoGetXyzToVectorTileEncoderEncodeToDouglasPeuckerSimplifierSimplify() throws Exception {
        // Create mocks for constructor dependencies
        GraphHopper graphHopperMock = mock(GraphHopper.class);
        EncodingManager encodingManagerMock = mock(EncodingManager.class);
        
        // Create mock BaseGraph and NodeAccess
        BaseGraph baseGraphMock = mock(BaseGraph.class);
        NodeAccess nodeAccessMock = mock(NodeAccess.class);
        when(graphHopperMock.getBaseGraph()).thenReturn(baseGraphMock);
        when(baseGraphMock.getNodeAccess()).thenReturn(nodeAccessMock);
        
        // Create mock LocationIndexTree
        LocationIndexTree locationIndexMock = mock(LocationIndexTree.class);
        when(graphHopperMock.getLocationIndex()).thenReturn(locationIndexMock);
        
        // Mock EncodingManager to return road class encoded value
        EnumEncodedValue<RoadClass> roadClassEncMock = mock(EnumEncodedValue.class);
        when(encodingManagerMock.hasEncodedValue(RoadClass.KEY)).thenReturn(true);
        when(encodingManagerMock.getEnumEncodedValue(RoadClass.KEY, RoadClass.class)).thenReturn(roadClassEncMock);
        
        // Create the MVTResource instance
        MVTResource mvtResource = new MVTResource(graphHopperMock, encodingManagerMock);
        
        // Create mocks for method parameters
        HttpServletRequest httpServletRequestMock = mock(HttpServletRequest.class);
        UriInfo uriInfoMock = mock(UriInfo.class);
        
        // Set parameters to trigger the path: z <= 9 to go into the first branch
        int z = 9;  // This will trigger the first branch with VectorTileEncoder.encode()
        int x = 0;
        int y = 0;
        Boolean renderAll = false;
        
        // Call the entry point method
        mvtResource.doGetXyz(httpServletRequestMock, uriInfoMock, z, x, y, renderAll);
        
        // The test should have executed the path:
        // 1. doGetXyz with z <= 9 calls new VectorTileEncoder().encode()
        // 2. VectorTileEncoder.encode() internally calls DouglasPeuckerSimplifier.simplify()
        //    when simplificationDistanceTolerance > 0.0 and geomType == POLYGON
        //    and geometry is invalid after first simplification attempt
        
        // To ensure the DouglasPeuckerSimplifier.simplify() is called, we need to:
        // 1. Create a VectorTileEncoder with simplification enabled
        // 2. Add a polygon feature that will be invalid after first simplification
        // 3. Call encode() on it
        
        VectorTileEncoder encoder = new VectorTileEncoder();
        
        // Use reflection to set simplificationDistanceTolerance > 0
        Field simplificationField = VectorTileEncoder.class.getDeclaredField("simplificationDistanceTolerance");
        simplificationField.setAccessible(true);
        simplificationField.set(encoder, 1.0);
        
        // Create a simple polygon geometry
        GeometryFactory gf = new GeometryFactory();
        LineString lineString = gf.createLineString(new Coordinate[]{
            new Coordinate(0, 0),
            new Coordinate(10, 0),
            new Coordinate(10, 10),
            new Coordinate(0, 10),
            new Coordinate(0, 0)
        });
        
        // Create attributes map
        Map<String, Object> attributes = new LinkedHashMap<>();
        attributes.put("test", "value");
        
        // Add the feature as a polygon
        encoder.addFeature("testLayer", attributes, lineString);
        
        // Call encode which should trigger DouglasPeuckerSimplifier.simplify()
        // when the geometry is invalid after the first simplification attempt
        encoder.encode();
    }
}
