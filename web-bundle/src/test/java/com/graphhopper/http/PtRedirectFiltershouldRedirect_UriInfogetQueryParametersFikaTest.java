package com.graphhopper.http;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PtRedirectFiltershouldRedirect_UriInfogetQueryParametersFikaTest {

    @Test
    public void test() {
        PtRedirectFilter filter = new PtRedirectFilter();
        
        ContainerRequestContext requestContext = mock(ContainerRequestContext.class);
        UriInfo uriInfo = mock(UriInfo.class);
        
        MultivaluedMap<String, String> queryParams = new MultivaluedHashMap<>();
        queryParams.put("vehicle", Collections.singletonList("pt"));
        queryParams.put("profile", Collections.singletonList("car"));
        
        when(requestContext.getUriInfo()).thenReturn(uriInfo);
        when(uriInfo.getQueryParameters()).thenReturn(queryParams);
        when(uriInfo.getPath()).thenReturn("route");
        
        URI mockUri = URI.create("http://localhost:8080/route?vehicle=pt&profile=car");
        UriBuilder uriBuilder = UriBuilder.fromUri(mockUri);
        when(uriInfo.getRequestUriBuilder()).thenReturn(uriBuilder);
        when(uriInfo.getRequestUri()).thenReturn(mockUri);
        
        filter.filter(requestContext);
    }
}
