package com.graphhopper.http;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TypeGPXFilterfilter_UriInfogetQueryParametersFikaTest {

    @Test
    public void test() {
        TypeGPXFilter filter = new TypeGPXFilter();
        
        ContainerRequestContext rc = mock(ContainerRequestContext.class);
        UriInfo uriInfo = mock(UriInfo.class);
        MultivaluedMap<String, String> queryParams = new MultivaluedHashMap<>();
        
        when(rc.getUriInfo()).thenReturn(uriInfo);
        when(uriInfo.getQueryParameters()).thenReturn(queryParams);
        
        MultivaluedMap<String, String> headers = new MultivaluedHashMap<>();
        when(rc.getHeaders()).thenReturn(headers);
        
        filter.filter(rc);
    }
}
