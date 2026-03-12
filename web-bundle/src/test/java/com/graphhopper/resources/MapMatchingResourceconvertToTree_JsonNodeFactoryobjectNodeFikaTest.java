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
import java.util.List;

public class MapMatchingResourceconvertToTree_JsonNodeFactoryobjectNodeFikaTest {

    @Test
    public void testConvertToTree() {
        GraphHopper graphHopper = Mockito.mock(GraphHopper.class);
        ProfileResolver profileResolver = Mockito.mock(ProfileResolver.class);
        TranslationMap translationMap = Mockito.mock(TranslationMap.class);
        MapMatchingRouterFactory mapMatchingRouterFactory = Mockito.mock(MapMatchingRouterFactory.class);
        
        StorableProperties properties = Mockito.mock(StorableProperties.class);
        Mockito.when(properties.get("datareader.data.date")).thenReturn("2023-01-01");
        Mockito.when(graphHopper.getProperties()).thenReturn(properties);
        
        MapMatchingResource resource = new MapMatchingResource(
            graphHopper,
            profileResolver,
            translationMap,
            mapMatchingRouterFactory
        );
        
        MatchResult matchResult = Mockito.mock(MatchResult.class);
        List<EdgeMatch> edgeMatches = new ArrayList<>();
        Mockito.when(matchResult.getEdgeMatches()).thenReturn(edgeMatches);
        
        JsonNode result = MapMatchingResource.convertToTree(matchResult, false, false);
    }
}
