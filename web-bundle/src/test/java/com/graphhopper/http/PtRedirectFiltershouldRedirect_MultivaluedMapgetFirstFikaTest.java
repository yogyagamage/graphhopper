package com.graphhopper.http;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PtRedirectFiltershouldRedirect_MultivaluedMapgetFirstFikaTest {

    @Test
    public void testFilterTriggersGetFirst() {
        PtRedirectFilter filter = new PtRedirectFilter();
        
        ContainerRequestContext requestContext = mock(ContainerRequestContext.class);
        UriInfo uriInfo = mock(UriInfo.class);
        MultivaluedMap<String, String> queryParams = mock(MultivaluedMap.class);
        
        when(requestContext.getUriInfo()).thenReturn(uriInfo);
        when(uriInfo.getQueryParameters()).thenReturn(queryParams);
        when(queryParams.getFirst("vehicle")).thenReturn("pt");
        when(queryParams.getFirst("profile")).thenReturn(null);
        when(uriInfo.getPath()).thenReturn("route");
        
        UriBuilder uriBuilder = mock(UriBuilder.class);
        when(uriInfo.getRequestUriBuilder()).thenReturn(uriBuilder);
        when(uriBuilder.replacePath("/route-pt")).thenReturn(uriBuilder);
        when(uriBuilder.replaceQueryParam("vehicle")).thenReturn(uriBuilder);
        when(uriBuilder.replaceQueryParam("profile")).thenReturn(uriBuilder);
        when(uriBuilder.build()).thenReturn(URI.create("http://localhost:8080/route-pt"));
        
        filter.filter(requestContext);
    }
}
