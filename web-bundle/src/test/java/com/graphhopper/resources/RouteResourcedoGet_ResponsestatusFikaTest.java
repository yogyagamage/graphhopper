package com.graphhopper.resources;

import com.graphhopper.GHRequest;
import com.graphhopper.GHResponse;
import com.graphhopper.GraphHopper;
import com.graphhopper.http.GHRequestTransformer;
import com.graphhopper.http.ProfileResolver;
import com.graphhopper.util.StopWatch;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class RouteResourcedoGet_ResponsestatusFikaTest {

    @Test
    public void testDoGetInvokesResponseStatus() throws Exception {
        // Mock dependencies for constructor
        GraphHopper graphHopper = Mockito.mock(GraphHopper.class);
        ProfileResolver profileResolver = Mockito.mock(ProfileResolver.class);
        GHRequestTransformer ghRequestTransformer = Mockito.mock(GHRequestTransformer.class);
        
        // Mock GraphHopper properties
        com.graphhopper.storage.StorableProperties properties = Mockito.mock(com.graphhopper.storage.StorableProperties.class);
        when(graphHopper.getProperties()).thenReturn(properties);
        when(properties.get("datareader.data.date")).thenReturn("2024-01-01");
        
        // Mock route method to return a response with errors
        GHResponse ghResponse = Mockito.mock(GHResponse.class);
        when(ghResponse.hasErrors()).thenReturn(true);
        when(ghResponse.getErrors()).thenReturn(new ArrayList<>());
        when(graphHopper.route(any(GHRequest.class))).thenReturn(ghResponse);
        
        // Mock profile resolver
        when(profileResolver.resolveProfile(any(com.graphhopper.util.PMap.class))).thenReturn("car");
        
        // Mock request transformer
        when(ghRequestTransformer.transformRequest(any(GHRequest.class))).thenAnswer(invocation -> invocation.getArgument(0));
        
        // Create instance with mocked dependencies
        RouteResource routeResource = new RouteResource(
            graphHopper,
            profileResolver,
            ghRequestTransformer,
            false
        );
        
        // Mock HttpServletRequest
        HttpServletRequest httpReq = Mockito.mock(HttpServletRequest.class);
        when(httpReq.getRemoteAddr()).thenReturn("127.0.0.1");
        when(httpReq.getLocale()).thenReturn(java.util.Locale.ENGLISH);
        when(httpReq.getHeader("User-Agent")).thenReturn("test-agent");
        
        // Mock UriInfo
        UriInfo uriInfo = Mockito.mock(UriInfo.class);
        when(uriInfo.getQueryParameters()).thenReturn(new MultivaluedHashMap<>());
        
        // Create parameters for doGet
        double minPathPrecision = 1.0;
        Double minPathElevationPrecision = null;
        List<com.graphhopper.http.GHPointParam> pointParams = new ArrayList<>();
        com.graphhopper.http.GHPointParam pointParam = Mockito.mock(com.graphhopper.http.GHPointParam.class);
        when(pointParam.get()).thenReturn(new com.graphhopper.util.shapes.GHPoint(0, 0));
        pointParams.add(pointParam);
        String type = "json";
        boolean instructions = true;
        boolean calcPoints = true;
        boolean enableElevation = false;
        boolean pointsEncoded = true;
        String profileName = "car";
        String algoStr = "";
        String localeStr = "en";
        List<String> pointHints = new ArrayList<>();
        List<String> curbsides = new ArrayList<>();
        List<String> snapPreventions = new ArrayList<>();
        List<String> pathDetails = new ArrayList<>();
        List<Double> headings = new ArrayList<>();
        boolean withRoute = true;
        boolean withTrack = true;
        boolean withWayPoints = false;
        String trackName = "GraphHopper Track";
        String timeString = null;
        
        // Invoke the entry point method
        routeResource.doGet(
            httpReq,
            uriInfo,
            minPathPrecision,
            minPathElevationPrecision,
            pointParams,
            type,
            instructions,
            calcPoints,
            enableElevation,
            pointsEncoded,
            profileName,
            algoStr,
            localeStr,
            pointHints,
            curbsides,
            snapPreventions,
            pathDetails,
            headings,
            withRoute,
            withTrack,
            withWayPoints,
            trackName,
            timeString
        );
        
        // The test will execute and the third-party method Response.status(Response.Status.BAD_REQUEST)
        // will be invoked when ghResponse.hasErrors() returns true
    }
}
