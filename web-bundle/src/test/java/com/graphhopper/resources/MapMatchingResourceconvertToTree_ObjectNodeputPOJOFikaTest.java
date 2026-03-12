package com.graphhopper.resources;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BaseJsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.graphhopper.GHResponse;
import com.graphhopper.GraphHopper;
import com.graphhopper.ResponsePath;
import com.graphhopper.gpx.GpxConversions;
import com.graphhopper.http.ProfileResolver;
import com.graphhopper.jackson.Gpx;
import com.graphhopper.jackson.ResponsePathSerializer;
import com.graphhopper.matching.EdgeMatch;
import com.graphhopper.matching.MapMatching;
import com.graphhopper.matching.MatchResult;
import com.graphhopper.matching.Observation;
import com.graphhopper.matching.State;
import com.graphhopper.resources.MapMatchingResource.MapMatchingRouterFactory;
import com.graphhopper.routing.Path;
import com.graphhopper.routing.ev.EncodedValueLookup;
import com.graphhopper.routing.util.EncodingManager;
import com.graphhopper.routing.weighting.Weighting;
import com.graphhopper.storage.BaseGraph;
import com.graphhopper.storage.Graph;
import com.graphhopper.storage.StorableProperties;
import com.graphhopper.storage.index.LocationIndex;
import com.graphhopper.storage.index.LocationIndexTree;
import com.graphhopper.storage.index.Snap;
import com.graphhopper.util.Constants;
import com.graphhopper.util.EdgeIteratorState;
import com.graphhopper.util.FetchMode;
import com.graphhopper.util.Helper;
import com.graphhopper.util.InstructionList;
import com.graphhopper.util.PMap;
import com.graphhopper.util.Parameters;
import com.graphhopper.util.PathMerger;
import com.graphhopper.util.PointList;
import com.graphhopper.util.RamerDouglasPeucker;
import com.graphhopper.util.StopWatch;
import com.graphhopper.util.Translation;
import com.graphhopper.util.TranslationMap;
import com.graphhopper.util.details.PathDetailsBuilderFactory;
import com.graphhopper.util.shapes.GHPoint;
import com.graphhopper.util.shapes.GHPoint3D;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import org.locationtech.jts.geom.LineString;
import org.slf4j.Logger;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.Properties;

class MapMatchingResourceconvertToTree_ObjectNodeputPOJOFikaTest {

    @Test
    void testConvertToTreeInvokesPutPOJO() {
        GraphHopper graphHopperMock = Mockito.mock(GraphHopper.class);
        ProfileResolver profileResolverMock = Mockito.mock(ProfileResolver.class);
        TranslationMap translationMapMock = Mockito.mock(TranslationMap.class);
        MapMatchingRouterFactory mapMatchingRouterFactoryMock = Mockito.mock(MapMatchingRouterFactory.class);
        
        StorableProperties storablePropertiesMock = Mockito.mock(StorableProperties.class);
        Mockito.when(graphHopperMock.getProperties()).thenReturn(storablePropertiesMock);
        Mockito.when(storablePropertiesMock.get("datareader.data.date")).thenReturn("2024-01-01");
        
        MapMatchingResource mapMatchingResource = new MapMatchingResource(
            graphHopperMock,
            profileResolverMock,
            translationMapMock,
            mapMatchingRouterFactoryMock
        );
        
        MatchResult matchResult = createMatchResultWithPointListSizeOne();
        
        MapMatchingResource.convertToTree(matchResult, false, false);
    }
    
    private MatchResult createMatchResultWithPointListSizeOne() {
        MatchResult matchResult = Mockito.mock(MatchResult.class);
        ArrayList<EdgeMatch> edgeMatches = new ArrayList<>();
        EdgeMatch edgeMatch = Mockito.mock(EdgeMatch.class);
        EdgeIteratorState edgeIteratorState = Mockito.mock(EdgeIteratorState.class);
        PointList pointList = new PointList(1, false);
        pointList.add(0, 0);
        
        Mockito.when(edgeMatch.getEdgeState()).thenReturn(edgeIteratorState);
        Mockito.when(edgeIteratorState.fetchWayGeometry(Mockito.any(FetchMode.class))).thenReturn(pointList);
        Mockito.when(edgeIteratorState.getEdge()).thenReturn(123);
        
        ArrayList<State> states = new ArrayList<>();
        State state = Mockito.mock(State.class);
        Snap snap = Mockito.mock(Snap.class);
        GHPoint3D snappedPoint = new GHPoint3D(1.0, 2.0, 0.0);
        Mockito.when(state.getSnap()).thenReturn(snap);
        Mockito.when(snap.getSnappedPoint()).thenReturn(snappedPoint);
        states.add(state);
        Mockito.when(edgeMatch.getStates()).thenReturn(states);
        
        edgeMatches.add(edgeMatch);
        Mockito.when(matchResult.getEdgeMatches()).thenReturn(edgeMatches);
        
        return matchResult;
    }
}
