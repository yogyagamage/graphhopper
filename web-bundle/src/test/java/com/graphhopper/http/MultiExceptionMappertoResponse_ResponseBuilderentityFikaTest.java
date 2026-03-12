package com.graphhopper.http;

import com.graphhopper.jackson.MultiException;
import org.junit.jupiter.api.Test;
import javax.ws.rs.core.Response;
import java.util.Collections;

class MultiExceptionMappertoResponse_ResponseBuilderentityFikaTest {

    @Test
    void test() {
        MultiExceptionMapper mapper = new MultiExceptionMapper();
        MultiException exception = new MultiException(Collections.emptyList());
        Response response = mapper.toResponse(exception);
    }
}
