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

public class RouteResourcedoGet_ResponseBuilderentityFikaTest {

    @Test
    public void testDoGetInvokesResponseBuilderEntity() throws Exception {
        // Mock dependencies for constructor
        GraphHopper graphHopper = Mockito.mock(GraphHopper.class);
        ProfileResolver profileResolver = Mockito.mock(ProfileResolver.class);
        GHRequestTransformer ghRequestTransformer = Mockito.mock(GHRequestTransformer.class);
        Boolean hasElevation = true;
        
        // Mock GraphHopper properties
        com.graphhopper.storage.StorableProperties properties = Mockito.mock(com.graphhopper.storage.StorableProperties.class);
        Mockito.when(graphHopper.getProperties()).thenReturn(properties);
        Mockito.when(properties.get("datareader.data.date")).thenReturn("2024-01-01");
        
        // Mock ProfileResolver behavior
        Mockito.when(profileResolver.resolveProfile(Mockito.any())).thenReturn("car");
        
        // Mock GHRequestTransformer behavior
        Mockito.when(ghRequestTransformer.transformRequest(Mockito.any())).thenAnswer(invocation -> invocation.getArgument(0));
        
        // Create instance of class under test
        RouteResource routeResource = new RouteResource(graphHopper, profileResolver, ghRequestTransformer, hasElevation);
        
        // Mock HttpServletRequest
        HttpServletRequest httpReq = Mockito.mock(HttpServletRequest.class);
        Mockito.when(httpReq.getRemoteAddr()).thenReturn("127.0.0.1");
        Mockito.when(httpReq.getLocale()).thenReturn(java.util.Locale.ENGLISH);
        Mockito.when(httpReq.getHeader("User-Agent")).thenReturn("test-agent");
        
        // Mock UriInfo
        UriInfo uriInfo = Mockito.mock(UriInfo.class);
        MultivaluedHashMap<String, String> queryParams = new MultivaluedHashMap<>();
        Mockito.when(uriInfo.getQueryParameters()).thenReturn(queryParams);
        
        // Create GHResponse with errors to trigger the path containing ResponseBuilder.entity()
        GHResponse ghResponse = new GHResponse();
        ghResponse.addError(new RuntimeException("Test error"));
        
        // Mock GraphHopper.route() to return error response
        Mockito.when(graphHopper.route(Mockito.any(GHRequest.class))).thenReturn(ghResponse);
        
        // Prepare parameters for doGet
        double minPathPrecision = 1.0;
        Double minPathElevationPrecision = null;
        List<com.graphhopper.http.GHPointParam> pointParams = new ArrayList<>();
        com.graphhopper.http.GHPointParam pointParam = Mockito.mock(com.graphhopper.http.GHPointParam.class);
        Mockito.when(pointParam.get()).thenReturn(new com.graphhopper.util.shapes.GHPoint(52.0, 13.0));
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
        // This should trigger the path: doGet -> Response.status(...).entity(...)
        // which calls javax.ws.rs.core.Response.ResponseBuilder.entity(java.lang.Object)
        routeResource.doGet(
            httpReq, uriInfo, minPathPrecision, minPathElevationPrecision, 
            pointParams, type, instructions, calcPoints, enableElevation, 
            pointsEncoded, profileName, algoStr, localeStr, pointHints, 
            curbsides, snapPreventions, pathDetails, headings, withRoute, 
            withTrack, withWayPoints, trackName, timeString
        );
    }
}
