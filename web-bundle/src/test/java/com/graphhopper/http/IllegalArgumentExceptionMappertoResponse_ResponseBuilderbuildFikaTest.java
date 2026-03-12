package com.graphhopper.http;

import com.graphhopper.jackson.MultiException;
import com.graphhopper.util.Helper;
import javax.ws.rs.core.Response;
import org.junit.jupiter.api.Test;

class IllegalArgumentExceptionMappertoResponse_ResponseBuilderbuildFikaTest {

    @Test
    void testToResponse() {
        IllegalArgumentExceptionMapper mapper = new IllegalArgumentExceptionMapper();
        IllegalArgumentException exception = new IllegalArgumentException("Test exception");
        mapper.toResponse(exception);
    }
}
