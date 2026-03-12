package com.graphhopper.http;

import com.graphhopper.jackson.MultiException;
import com.graphhopper.util.Helper;
import javax.ws.rs.core.Response;
import org.junit.jupiter.api.Test;

public class IllegalArgumentExceptionMappertoResponse_ResponsestatusFikaTest {

    @Test
    public void testToResponse() {
        IllegalArgumentExceptionMapper mapper = new IllegalArgumentExceptionMapper();
        IllegalArgumentException exception = new IllegalArgumentException("test message");
        Response response = mapper.toResponse(exception);
    }
}
