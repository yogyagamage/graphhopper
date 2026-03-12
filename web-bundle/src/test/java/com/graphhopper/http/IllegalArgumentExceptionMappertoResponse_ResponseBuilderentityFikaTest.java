package com.graphhopper.http;

import com.graphhopper.jackson.MultiException;
import com.graphhopper.util.Helper;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;

public class IllegalArgumentExceptionMappertoResponse_ResponseBuilderentityFikaTest {

    @Test
    public void testToResponse() {
        IllegalArgumentExceptionMapper mapper = new IllegalArgumentExceptionMapper();
        IllegalArgumentException exception = new IllegalArgumentException("Test exception");
        Response response = mapper.toResponse(exception);
    }
}
