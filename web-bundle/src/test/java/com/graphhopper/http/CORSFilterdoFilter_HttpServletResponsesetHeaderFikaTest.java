package com.graphhopper.http;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class CORSFilterdoFilter_HttpServletResponsesetHeaderFikaTest {

    @Test
    public void test() throws ServletException, IOException {
        CORSFilter filter = new CORSFilter();
        
        HttpServletRequest mockRequest = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse mockResponse = Mockito.mock(HttpServletResponse.class);
        FilterChain mockChain = Mockito.mock(FilterChain.class);
        
        filter.doFilter(mockRequest, mockResponse, mockChain);
    }
}
