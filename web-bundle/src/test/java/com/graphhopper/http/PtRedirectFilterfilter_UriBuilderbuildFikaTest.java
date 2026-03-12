package com.graphhopper.http;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.net.URI;
import java.util.HashMap;
import javax.ws.rs.core.MultivaluedHashMap;

public class PtRedirectFilterfilter_UriBuilderbuildFikaTest {

    @Test
    public void test() {
        PtRedirectFilter filter = new PtRedirectFilter();
        
        ContainerRequestContext requestContext = Mockito.mock(ContainerRequestContext.class);
        UriInfo uriInfo = Mockito.mock(UriInfo.class);
        UriBuilder uriBuilder = Mockito.mock(UriBuilder.class);
        
        MultivaluedHashMap<String, String> queryParams = new MultivaluedHashMap<>();
        queryParams.putSingle("vehicle", "pt");
        queryParams.putSingle("profile", "pt");
        
        Mockito.when(requestContext.getUriInfo()).thenReturn(uriInfo);
        Mockito.when(uriInfo.getPath()).thenReturn("route");
        Mockito.when(uriInfo.getQueryParameters()).thenReturn(queryParams);
        Mockito.when(uriInfo.getRequestUriBuilder()).thenReturn(uriBuilder);
        Mockito.when(uriBuilder.replacePath(Mockito.anyString())).thenReturn(uriBuilder);
        Mockito.when(uriBuilder.replaceQueryParam(Mockito.anyString())).thenReturn(uriBuilder);
        Mockito.when(uriBuilder.build()).thenReturn(URI.create("http://example.com/route-pt"));
        
        filter.filter(requestContext);
    }
}
