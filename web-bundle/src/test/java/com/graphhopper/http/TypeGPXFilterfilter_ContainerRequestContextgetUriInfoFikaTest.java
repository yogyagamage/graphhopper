package com.graphhopper.http;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TypeGPXFilterfilter_ContainerRequestContextgetUriInfoFikaTest {

    @Test
    public void test() {
        TypeGPXFilter filter = new TypeGPXFilter();
        
        ContainerRequestContext rc = mock(ContainerRequestContext.class);
        UriInfo uriInfo = mock(UriInfo.class);
        MultivaluedMap<String, String> queryParams = mock(MultivaluedMap.class);
        
        when(rc.getUriInfo()).thenReturn(uriInfo);
        when(uriInfo.getQueryParameters()).thenReturn(queryParams);
        
        filter.filter(rc);
    }
}
